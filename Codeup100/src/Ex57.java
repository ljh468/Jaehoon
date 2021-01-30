import java.util.Scanner;

// [기초-종합] 여기까지! 이제 그만
public class Ex57 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long sum=0;
        for(int i =1; i<10000000; i++) {
        	
        	sum = sum+i;
        	
        	if(sum>= a) {
        		System.out.println(sum);
        		break;
        	}
        }
    
	}

}
