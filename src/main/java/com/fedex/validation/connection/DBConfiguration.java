package com.fedex.validation.connection;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBConfiguration {
	
	public static final String DRIVER = "oracle.jdbc.OracleDriver"; 
	public static final String JDBC_URL = "jdbc:oracle:thin:@ldap://oid.inf.fedex.com:3060/GTM_TEST3_SVC1_L2,cn=OracleContext,dc=ute,dc=fedex,dc=com";   //TEST URL
	//public static final String JDBC_URL = "jdbc:oracle:thin:@ldap://oid.inf.fedex.com:3060/GTM_PROD1_SVC1_L3,cn=OracleContext,dc=ute,dc=fedex,dc=com";	   //PROD URL
	public static final String USERNAME = "rtm";
	public static final String PASSWORD = "Z1od4h3HfVh93kfGHvn";
	
	
	public static DataSource getDataSource(){
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName(DBConfiguration.DRIVER);
	dataSource.setUrl(DBConfiguration.JDBC_URL);
	dataSource.setUsername(DBConfiguration.USERNAME);
	dataSource.setPassword(DBConfiguration.PASSWORD);
return dataSource;
}
}