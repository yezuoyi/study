package com.yzy.study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcDemo {
	public static void main(String[] args) throws SQLException {
		// MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
		// 避免中文乱码要指定useUnicode和characterEncoding
		String url = "jdbc:mysql://localhost:3306/demo?"
				+ "user=root&password=root&useUnicode=true&characterEncoding=UTF8";
		String sql;
		Connection conn = null;
		try {
			// 加载MySql的驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 连接数据库
			conn = DriverManager.getConnection(url);
			// 创建statement语句，
			// Statement接口提供了三种执行SQL语句的方法：executeQuery、executeUpdate和execute
			Statement stmt = conn.createStatement();
			// sql = "create table student(id char(20),name varchar(20),primary key(id))";
			// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功
			// int rows = stmt.executeUpdate(sql);
			// System.out.println(rows);
			// if (rows != -1) {
			if (true) {
				/*
				 * int rows; System.out.println("数据库新建成功"); // 插入数据1 sql =
				 * "insert into student(id,name) values('20150417','韦小宝')"; rows =
				 * stmt.executeUpdate(sql); // 插入数据2 sql =
				 * "insert into student(id,name) values('20150416','张无忌')"; rows =
				 * stmt.executeUpdate(sql); // 查询数据,返回结果集ResultSet
				 */ sql = "select * from t_city";

				ResultSet rs = stmt.executeQuery(sql);
				System.out.println("id："  + "\t" + "country：" +"\t"+"map "+"\t"+"Name"+"\t"+"State");
				while (rs.next()) {
					System.out.println( rs.getString(1) + "\t"  + rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("类未找到异常");
			e.printStackTrace();
		} catch (SQLException e) {
			// try {
			// throw new Exception("异常");
			// } catch (Exception e1) {
			// e1.printStackTrace();
			// }
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
}
