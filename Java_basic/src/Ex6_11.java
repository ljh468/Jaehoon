import java.util.Scanner;
public class Ex6_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int hap=0;
		int num1,num2,num3;
		
		System.out.printf("���۰� �Է� : ");
		 num1 = sc.nextInt();
		System.out.printf("���� �Է� : ");
		 num2 = sc.nextInt();
		System.out.printf("������ �Է� : ");
		 num3 = sc.nextInt();
		
		for( i=num1; i<=num2; i=i+num3 ) {
			hap=hap+i;
		}
//		System.out.println(num1+"����"+num3+"������ ���� : "+hap);
		System.out.printf("%d���� %d���� %d�� �����Ѱ��� �� : %d",num1,num2,num3,hap);
	}
}
