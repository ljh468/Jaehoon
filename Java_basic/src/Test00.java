import java.util.Scanner;

public class Test00 {
	public static void main(String[] args) {
		int a;
		int num;
		int num2=1;
		System.out.println("몇단을 출력할까요?");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		
		if(a==3||a==5)
		System.out.println("("+a+"단)");
			while(num2<10) {
				System.out.println(a+"X"+num2+"="+(a*num2));
				num2++;
			}
			num2=1;
			System.out.println();
	

	}

}
