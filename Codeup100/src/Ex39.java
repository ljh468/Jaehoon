// 둘 다 참일 경우만 참 출력하기
import java.util.Scanner;

public class Ex39 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		if(a+b ==2){
            System.out.println(1);
        }else{
            System.out.println(0);
            }
	}
}
