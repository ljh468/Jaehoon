package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PrintUserinfo {

	public static void main(String[] args) throws SQLException{
		
		// 회원 정보를 가져오기 위해 DBUserInfo 객체를 메모리에 올림
		DBUserinfo ui = new DBUserinfo();
		
		// 회원정보 가져오기
		List<Map<String,String>> rList = ui.getUserInfo();
		
		// rList = ui.getUserInfo(); 함수의 오류 발생 및 테이블 조회 결과가 없을 때 Nullpointer
		// 에러가 발생하는것을 방지 하기 위해 강제로 메모리에 올림
		
		if(rList == null) {
			rList = new ArrayList<Map<String, String>>();
		}
		System.out.println("=======================");
		System.out.println("ui.getUserInfo() 함수로부터 전달 받은 회원 정보 출력합니다.");
		System.out.println("=======================");
		
		Iterator<Map<String, String>> it = rList.iterator();
		
		while(it.hasNext()) {
			Map<String, String> rMap = it.next();
			
			// 예기치 않은 오류로 메모리에 존재하지 않는 경우를 대비하기 위해 강제로 메모리에 올림
			if(rMap == null) {
				rMap = new HashMap<String, String>();
			}
			
			// 레코드의 각 컬럼을 내용 출력
			System.out.println("회원아이디(user_id) : " + rMap.get("user_id"));
			System.out.println("회원이름(user_nm) : " + rMap.get("user_nm"));
			System.out.println("이메일(email) : " + rMap.get("email"));
			System.out.println("주소(addr) : " + rMap.get("addr"));
			System.out.println("가입일(reg_dt) : " + rMap.get("reg_dt"));
			System.out.println("-------------------------");
			
			// 사용이 끝나면 메모리 비우기
			rMap = null;
		}
		
		// 사용이 끝나면 메모리 비우기
		rList = null;
	}

}
