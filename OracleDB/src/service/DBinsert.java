package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import DB.conn.DBConn;

public class DBinsert {

	public void doInsert(Map<String, String> pMap) {

		try {

			// ����Ŭ �����ϱ�..
			Connection conn = DBConn.getConnection();

			// ����Ŭ�� SQL������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;

			// sQL ����
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR) VALUES(";

			// ?��� Ű����� ����ٰ� ������ �����ϰڴٴ� �ǹ�
			sql += "?, "; // ù���� �÷��� USER_ID�� ��Ī��
			sql += "?, "; // �ι��� �÷��� USER_NM�� ��Ī��
			sql += "?, "; // ������ �÷��� EMAIL�� ��Ī��
			sql += "?, "; // �׹��� �÷��� ADDR�� ��Ī��
			sql += "?) "; // �ټ����� �÷��� USER_ID�� ��Ī��

			// ����Ŭ�� ���޵� SQL ������ �����ϱ�
			pstmt = conn.prepareStatement(sql);

			int idx = 0;

			// ���� �޴� pMap ��ü�� ���� SQL ������ ? �� ��������

			String user_id = pMap.get("user_id");
			System.out.println("���޹��� user_id : " + user_id);
			pstmt.setString(++idx, user_id);
			// Ű��, ���� ù��°
			String user_nm = pMap.get("user_nm");
			System.out.println("���޹��� user_nm : " + user_nm);
			pstmt.setString(++idx, user_id);
			// Ű��, ���� �ι�°
			String email = pMap.get("email");
			System.out.println("���޹��� email : " + email);
			pstmt.setString(++idx, email);
			// Ű��, ���� ����°
			String addr = pMap.get("addr");
			System.out.println("���޹��� addr : " + addr);
			pstmt.setString(++idx, addr);
			// Ű��, ���� �׹�°

			// insert ���� ����
			int res = pstmt.executeUpdate();

			if (res > 0) {
				System.out.println("������ ��� ����!");
			} else {
				System.out.println("������ ��� ����!");
			}
			pstmt = null;

			// ����Ŭ db ��������
			DBConn.DBClose(conn);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
