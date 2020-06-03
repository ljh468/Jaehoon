import java.util.Scanner;
public class Ex5_12 {

	public static void main(String[] args) {		
		
		Scanner sc=new Scanner(System.in);
		
		int a;
		int b;
		char ch;
		
		System.out.printf("첫번째 수를 입력하세요");
		a = sc.nextInt();
		System.out.printf("계산할 연산자를 입력하세요");
		ch = sc.next().charAt(0);
		System.out.printf("두번째 수를 입력하세요");
		b = sc.nextInt();
		
		if(ch=='+') {
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if(ch=='-') {
			System.out.println(a+"-"+b+"="+(a-b));
		} 
		else if(ch=='*') {
			System.out.println(a+"*"+b+"="+(a*b));
		}
		else if(ch=='/') {
			System.out.printf("%d/%d=%.5f",a,b,a/(float)b);
		}
		else if(ch=='%') {
			System.out.println(a+"%"+b+"="+(a%b));
		}
		else {
			System.out.println("연산자를 잘못입력하셨습니다.");
		}
		
		
		
	}

}
