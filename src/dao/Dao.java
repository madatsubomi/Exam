package dao;

import java.sql.Connection;

public class Dao {
	static DataSource ds;

	public Connection getConnetion() throws Exception {

		return ds.getConnection();
	}
}