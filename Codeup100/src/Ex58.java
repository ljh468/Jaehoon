import java.util.Scanner;
// [기초-종합] 수 나열하기1
public class Ex58 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        
     
       System.out.print(a+ d*(n-1));
	}

}