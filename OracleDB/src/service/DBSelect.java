package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DB.conn.DBConn;

public class DBSelect {

	public static void main(String[] args) throws SQLException{
		
		// 오라클 접속하기..
		Connection  conn = DBConn.getConnection();
		
		// 오라클에 SQL쿼리를 전달하기 위해 객체
		PreparedStatement pstmt = null;
		
		// sQL 선언
		String sql = "SELECT COUNT(1) AS CNT FROM USER_INFO";
		
		// 오라클에 전달될 SQL 쿼리를 저장하기
		pstmt = conn.prepareStatement(sql);
		
		// sql 조회 쿼리를 실행하고, rs 변수에 결과를 저장하기
		// Resultset 객체는 Map 자료 구조 (키와 값으로 구성)를 오라클에 적합하도록 구현한 자바 객체
		ResultSet rs = pstmt.executeQuery(sql);
		//ResultSet : 2개이상이면 list map 형태로 바꿔줌
		if(rs.next()) {
			
			String cnt = rs.getString("CNT");
			System.out.println("회원가입한 수 CNT : " + cnt);
		}
		
		// 오라클로부터 전달받은 결과는 사용이 끝나면 바로 메모리를 해체 해야함
		// 해제하지 않으면 오라클 DB 에 계속 연결이 유지되고 있어  DB의 성능이 떨어짐
		rs.close();
		
		// 오라클 DB 접속 종료
		DBConn.DBClose(conn);

	}

}
