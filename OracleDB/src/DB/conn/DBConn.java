package DB.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	/**
	 * ����Ŭ db�� �����ϱ�
	 * 
	 * @return Connection ����Ŭ db ���� ��ü
	 */

	public static Connection getConnection() throws SQLException {
		                                     // try catch ���� �κ� ���� ������ ��´�(��ü����)
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �ܿ�����!
		String user = "myuesr";
		String passwd = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ����Ŭ ����̹� �ε� , driverManager�� ���
			
			conn = DriverManager.getConnection(url, user, passwd);
			// connection ��ü�� ����, DriverManager�� ��ϵ� ������̹����� getConnection�� ����Ͽ� �ĺ�
			
			System.out.println("����Ŭ ���� ����!!");

		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ���� ����");
			System.out.println("ojdbc6.jar ���Ͽ� �����ϴ� �ڹ� ������ ã�� ����");
			System.out.println("���� :" + e.toString());

		} catch (Exception e) {
			System.out.println("����Ŭ ���� ���� - ���� Exception���� ȣ����");
			System.out.println("���� :" + e.toString());

		}
		// ����Ŭ db�� ����� �ڹ� ��ü�� ��� ���� �����Ѵ�.
		return conn;
	}

	/**
	 * ������ ����� ����Ŭ db�� ���� ���� �ϱ� / ��, �޸𸮿� �ö� Connection ��ü�� �޸𸮿� �����
	 * 
	 * @param Connection ���� ����Ŭ db�� ����� �ڹ� ��ü
	 */
	public static void DBClose(Connection pConn) throws SQLException {
		pConn.close();
	}
}
