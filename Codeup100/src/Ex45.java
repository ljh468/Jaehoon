
// 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
import java.util.Scanner;

public class Ex45 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
       
		if(a > 0){
		    System.out.println("plus");
		}else{
		    System.out.println("minus");
		}
        if(a%2 ==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
	}
}

/* // 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
public class Ex45 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	
	if(a%2 == 0)
		System.out.println("even");
	else if(a%2 == 1)
	System.out.println("odd");
	
	if(b%2 == 0)
		System.out.println("even");
	else if(b%2 == 1)
		System.out.println("odd");
	
	if(c%2 == 0)
		System.out.println("even");
	else if(c%2 == 1)
		System.out.println("odd");
	
}
	
	}
*/

