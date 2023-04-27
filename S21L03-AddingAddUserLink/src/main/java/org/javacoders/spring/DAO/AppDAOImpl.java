package org.javacoders.spring.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.javacoders.spring.model.User;

import jakarta.validation.Valid;

public class AppDAOImpl implements AppDAO{

	private DataSource dataSource;
	public AppDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<User> listUsers() {
		List<User> listUsers = new ArrayList<User>();
		Connection con;
		try {
			String sql = "Select * from users";
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User temp = new User(rs.getInt("user_id"), rs.getString("name"), rs.getString("email"));
				listUsers.add(temp);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
 		return listUsers;
	}

	@Override
	public void addUser(User user) {
		String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.execute();
			pst.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {con.close();} catch(SQLException e) {}
			}
		}
	}
}
