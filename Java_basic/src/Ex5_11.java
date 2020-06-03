import java.util.Scanner;
public class Ex5_11 {

	public static void main(String[] args) {		
		
		Scanner sc=new Scanner(System.in);
		System.out.printf("첫번째 수를 입력하세요");
		int a = sc.nextInt();
		
		System.out.printf("계산할 연산자를 입력하세요");
		char ch = sc.next().charAt(0);
		
		System.out.printf("두번째 수를 입력하세요");
		int b = sc.nextInt();
		
		if(ch=='+') {
			System.out.println(a+"+"+b+"="+(a+b));
		}
		if(ch=='-') {
			System.out.println(a+"-"+b+"="+(a-b));
		}
		if(ch=='*') {
			System.out.println(a+"*"+b+"="+(a*b));
		}
		if(ch=='/') {
			System.out.println(a+"/"+b+"="+(a/b));
		}
		if(ch=='%') {
			System.out.println(a+"%"+b+"="+(a%b));
		}
		
		
	}

}
