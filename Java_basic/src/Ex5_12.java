import java.util.Scanner;
public class Ex5_12 {

	public static void main(String[] args) {		
		
		Scanner sc=new Scanner(System.in);
		
		int a;
		int b;
		char ch;
		
		System.out.printf("ù��° ���� �Է��ϼ���");
		a = sc.nextInt();
		System.out.printf("����� �����ڸ� �Է��ϼ���");
		ch = sc.next().charAt(0);
		System.out.printf("�ι�° ���� �Է��ϼ���");
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
			System.out.println("�����ڸ� �߸��Է��ϼ̽��ϴ�.");
		}
		
		
		
	}

}
