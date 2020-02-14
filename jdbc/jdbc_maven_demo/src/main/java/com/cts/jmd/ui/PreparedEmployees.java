package com.cts.jmd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class PreparedEmployees{

	public static void main(String[] args) {
		try (
				Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","welcome");
			) {
			
			
			PreparedStatement ps = con.prepareStatement("select * from employees where salary>15000 order by first_name ");
			ResultSet rs = ps.executeQuery();
			System.out.println("salary \t"+"first_name");
			while(rs.next()) {
				System.out.printf("%-15s%-40s\n", rs.getString("salary"), rs.getString("first_name"));
			}
		} catch (SQLException e) {
			System.out.println("Could not retrieve");
			e.printStackTrace();
		}
	}
}
		

