package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DB.conn.DBConn;

public class DBSelect {

	public static void main(String[] args) throws SQLException{
		
		// ����Ŭ �����ϱ�..
		Connection  conn = DBConn.getConnection();
		
		// ����Ŭ�� SQL������ �����ϱ� ���� ��ü
		PreparedStatement pstmt = null;
		
		// sQL ����
		String sql = "SELECT COUNT(1) AS CNT FROM USER_INFO";
		
		// ����Ŭ�� ���޵� SQL ������ �����ϱ�
		pstmt = conn.prepareStatement(sql);
		
		// sql ��ȸ ������ �����ϰ�, rs ������ ����� �����ϱ�
		// Resultset ��ü�� Map �ڷ� ���� (Ű�� ������ ����)�� ����Ŭ�� �����ϵ��� ������ �ڹ� ��ü
		ResultSet rs = pstmt.executeQuery(sql);
		//ResultSet : 2���̻��̸� list map ���·� �ٲ���
		if(rs.next()) {
			
			String cnt = rs.getString("CNT");
			System.out.println("ȸ�������� �� CNT : " + cnt);
		}
		
		// ����Ŭ�κ��� ���޹��� ����� ����� ������ �ٷ� �޸𸮸� ��ü �ؾ���
		// �������� ������ ����Ŭ DB �� ��� ������ �����ǰ� �־�  DB�� ������ ������
		rs.close();
		
		// ����Ŭ DB ���� ����
		DBConn.DBClose(conn);

	}

}
