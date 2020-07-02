package DB.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

   public static void main(String[] args) throws SQLException {
	                                     //try catch 밖의 부분 까지 에러를 잡는다(전체범위)
      Connection conn = null;
      String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 외워야함!
      String user = "myuser";
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
         
      } finally {

         if (conn != null) {
            conn.close();
         }
      }

      conn = null;
   }

}