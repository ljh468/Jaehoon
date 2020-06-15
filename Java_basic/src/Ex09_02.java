import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.println("문자열 입력==> ");
		str = s.nextLine();
		
		System.out.println("출력 문자열 ==>");
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='o') {
				System.out.printf("%c",'$');
			}
			else
				System.out.printf("%c", str.charAt(i));
		//str.length() ==0 문자열이 없다
		//str.length() !=0 문자열이 있다
			
		/*	if(str.length()==0) {  
				System.out.println("yes");
			}else
				System.out.println("No");
				*/
		}
	}
}
