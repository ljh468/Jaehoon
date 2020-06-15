import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.println("문자열을 입력하세요 : ");
		str = s.nextLine();
		
		strRep = str.replace(" ","$");		//입력 문자열의 공백을 $로 바꾼다
		strSub = str.substring(3,8);		//입력문자열의 3번째부터 8번째까지의 문자를 추출
		strAry = str.split(" ");            //입력문자열을 공백으로 분리
		
		System.out.println("입력 문자열 ==> "+str);
		System.out.println("바꾼 문자열 ==> "+strRep);
		System.out.println("일부 문자열 ==> "+strSub);
		for(int i=0; i<strAry.length; i++) {
			System.out.println("분리한 문자열"+ i + "==>" + strAry[i]);
		}
	}
}
