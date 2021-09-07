package fx06_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClass {
	public Connection conn;
	public DBClass() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sjh1","12345");
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}