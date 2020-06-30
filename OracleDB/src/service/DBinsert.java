package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import DB.conn.DBConn;

public class DBinsert {

	public void doInsert(Map<String, String> pMap) {

		try {

			// 오라클 접속하기..
			Connection conn = DBConn.getConnection();

			// 오라클에 SQL쿼리를 전달하기 위해 객체
			PreparedStatement pstmt = null;

			// sQL 선언
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR) VALUES(";

			// ?라는 키워드는 여기다가 변수를 대입하겠다는 의미
			sql += "?, "; // 첫번쨰 컬럼인 USER_ID과 매칭됨
			sql += "?, "; // 두번쨰 컬럼인 USER_NM과 매칭됨
			sql += "?, "; // 세번쨰 컬럼인 EMAIL과 매칭됨
			sql += "?, "; // 네번쨰 컬럼인 ADDR과 매칭됨
			sql += "?) "; // 다섯번쨰 컬럼인 USER_ID과 매칭됨

			// 오라클에 전달될 SQL 쿼리를 저장하기
			pstmt = conn.prepareStatement(sql);

			int idx = 0;

			// 전달 받는 pMap 객체의 값과 SQL 쿼리의 ? 와 대입히기

			String user_id = pMap.get("user_id");
			System.out.println("전달받은 user_id : " + user_id);
			pstmt.setString(++idx, user_id);
			// 키값, 변수 첫번째
			String user_nm = pMap.get("user_nm");
			System.out.println("전달받은 user_nm : " + user_nm);
			pstmt.setString(++idx, user_id);
			// 키값, 변수 두번째
			String email = pMap.get("email");
			System.out.println("전달받은 email : " + email);
			pstmt.setString(++idx, email);
			// 키값, 변수 세번째
			String addr = pMap.get("addr");
			System.out.println("전달받은 addr : " + addr);
			pstmt.setString(++idx, addr);
			// 키값, 변수 네번째

			// insert 쿼리 실행
			int res = pstmt.executeUpdate();

			if (res > 0) {
				System.out.println("데이터 등록 성공!");
			} else {
				System.out.println("데이터 등록 실패!");
			}
			pstmt = null;

			// 오라클 db 접속종료
			DBConn.DBClose(conn);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
