// 0 0�� ���� ������ A+B�� ����ϴ� ����
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
