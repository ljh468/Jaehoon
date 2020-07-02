package DB.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	/**
	 * 오라클 db와 연결하기
	 * 
	 * @return Connection 오라클 db 연결 객체
	 */

	public static Connection getConnection() throws SQLException {
		                                     // try catch 밖의 부분 까지 에러를 잡는다(전체범위)
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 외워야함!
		String user = "myuesr";
		String passwd = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클 드라이버 로딩 , driverManager에 등록
			
			conn = DriverManager.getConnection(url, user, passwd);
			// connection 객체를 연결, DriverManager에 등록된 각드라이버들은 getConnection을 사용하여 식별
			
			System.out.println("오라클 접속 성공!!");

		} catch (ClassNotFoundException e) {
			System.out.println("오라클 접속 실패");
			System.out.println("ojdbc6.jar 파일에 존재하는 자바 파일을 찾지 못함");
			System.out.println("이유 :" + e.toString());

		} catch (Exception e) {
			System.out.println("오라클 접속 실패 - 최종 Exception까지 호출함");
			System.out.println("이유 :" + e.toString());

		}
		// 오라클 db와 연결된 자바 객체를 결과 값을 전달한다.
		return conn;
	}

	/**
	 * 기존에 연결된 오라클 db와 접속 해제 하기 / 즉, 메모리에 올라간 Connection 객체를 메모리에 지우기
	 * 
	 * @param Connection 기존 오라클 db와 연결된 자바 객체
	 */
	public static void DBClose(Connection pConn) throws SQLException {
		pConn.close();
	}
}
