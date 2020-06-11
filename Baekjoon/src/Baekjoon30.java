import java.util.Scanner;

public class Baekjoon30{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int k = n;
        
        while(true) {
        	int a = k/10;
        	int b = k%10;
        	
        	if(a+b<10) {
        		k = (b*10 +(a+b));
        	}
        	else {
        		k = (b*10 +((a+b)%10));
        	}
        	count++;
        	if(k==n) {
        		break;
        	}
        	
        }
          System.out.println(count);  
          s.close();
    }
}

