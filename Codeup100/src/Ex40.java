// 참(1), 거짓(0) 서로 같을때 1출력
import java.util.Scanner;

public class Ex40{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a==1&&b==1||a==0&&b==0) {
		   System.out.print(1);
		}else {
		   System.out.print(0);
		}

		}
}
/* 참(1), 거짓(0) 이서로 다를때 1출력
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();

if(a!=1&&b==1||a==1&&b!=1) {
   System.out.print(1);
}else {
   System.out.print(0);
}

}
*/