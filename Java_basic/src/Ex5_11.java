import java.util.Scanner;
public class Ex5_11 {

	public static void main(String[] args) {		
		
		Scanner sc=new Scanner(System.in);
		System.out.printf("ù��° ���� �Է��ϼ���");
		int a = sc.nextInt();
		
		System.out.printf("����� �����ڸ� �Է��ϼ���");
		char ch = sc.next().charAt(0);
		
		System.out.printf("�ι�° ���� �Է��ϼ���");
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
