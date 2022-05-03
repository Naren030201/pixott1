package com.revature.fsd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.fds.model.Customer;
import com.revature.fds.model.Util;

public class CustomerSignupdao {
public void signup(Customer cus) {
	String sql="insert into user_details (name,mobile,password) values(?,?,?)";
	try(Connection con = Util.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			){
		stmt.setString(1, cus.getName());
		stmt.setString(2, cus.getMobile());
		stmt.setString(3, cus.getPass());
	}catch (SQLException e) {
		Util.displayMessage(e);
	}
}
}
