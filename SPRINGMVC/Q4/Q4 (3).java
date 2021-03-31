package com.akshat.springmvc;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import org.springframework.stereotype.Service;

@Service()
public class DataBase {
	private Connection connection;
	
	public DataBase() {
		try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				this.connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi", "root", "admin@123");
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}
	
	public void insertData(User1 user) throws Exception {
		 String password = user.getPassword();
		 String email = user.getEmail();
		 String username = user.getUsername();
    	 
    	 
		 PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
    	 
    	 preparedStatement.setString(1, username);
    	 preparedStatement.setString(2, email);
    	 preparedStatement.setNString(3, password);
    	 
    	 preparedStatement.executeUpdate();
    	 
	}
	
	public boolean  getData(User1 user) throws Exception {
		 
		PreparedStatement p = connection.prepareStatement("select * from user where username = ? ");
    	p.setString(1, user.getUsername());
    	 
		ResultSet r = p.executeQuery();
		if(r.next()==false) {
				return false;
		}
		 
		String username = "";
		String password = "";
		while(r.next()){
			username=r.getString(1);
			password=r.getString(3);
		}
		
		if(username.equals(user.getUsername()) && password.equals(user.getPassword()))
			{return true;}
		else 
		  {return false;}	
	}
}