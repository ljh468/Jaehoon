import java.util.Scanner;
// [기초-종합] 수 나열하기1
public class Ex58 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long d = s.nextLong();
        long n = s.nextLong();
        
     
       System.out.print(a+ d*(n-1));
	}

}