// a+b ��� 0 0 ���� break;
import java.util.Scanner;

public class Baekjoon23{
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

