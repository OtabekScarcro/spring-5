package org.javacoders.spring.config;

import javax.sql.DataSource;

import org.javacoders.spring.DAO.AppDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project?serverTimezone=Europe/Warsaw");
		dataSource.setUsername("root");
		dataSource.setPassword("Scarcro149$");
		return dataSource;
	}
	
	@Bean(name="DAOBean")
	public AppDAOImpl AppDAO() {
		return new AppDAOImpl(getDataSource());
	}
}
