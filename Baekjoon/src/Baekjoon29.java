// 0 0이 들어올 때까지 A+B를 출력하는 문제
import java.util.Scanner;

public class Baekjoon29{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        while(true) {
        	int a =  s.nextInt();
            int b =  s.nextInt();
            
            if(a==0&&b==0) {
            	break;
            }
            System.out.println(a+b);
            
        }
            
    }
}

