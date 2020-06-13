// 더하기 사이클 (숫자의 앞자리추출, 뒷자리 추출)
// 원래 수로 돌아올 때까지 연산을 반복하는 문제
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

