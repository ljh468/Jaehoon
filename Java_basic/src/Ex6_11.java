import java.util.Scanner;
public class Ex6_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int hap=0;
		int num1,num2,num3;
		
		System.out.printf("시작값 입력 : ");
		 num1 = sc.nextInt();
		System.out.printf("끝값 입력 : ");
		 num2 = sc.nextInt();
		System.out.printf("증가값 입력 : ");
		 num3 = sc.nextInt();
		
		for( i=num1; i<=num2; i=i+num3 ) {
			hap=hap+i;
		}
//		System.out.println(num1+"부터"+num3+"까지의 합은 : "+hap);
		System.out.printf("%d부터 %d까지 %d씩 증가한값의 합 : %d",num1,num2,num3,hap);
	}
}
