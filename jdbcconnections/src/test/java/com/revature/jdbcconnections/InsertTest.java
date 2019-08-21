package com.revature.jdbcconnections;

import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {

			Employeedao.insert(102, "priya");
			Employeedao.insert(103,"nithiya");

	}

}
