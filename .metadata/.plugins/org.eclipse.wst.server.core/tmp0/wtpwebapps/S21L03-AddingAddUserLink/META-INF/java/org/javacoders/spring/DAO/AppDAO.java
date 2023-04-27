package org.javacoders.spring.DAO;

import java.util.List;

import org.javacoders.spring.model.User;

public interface AppDAO {
	public List<User> listUsers();
}
