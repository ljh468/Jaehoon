
import java.util.Scanner;
//[����-����] �� �����ϱ�3
public class Ex59{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int n = s.nextInt();
        long res = a * b + c;
        
        if(n == 1)
        	System.out.println(a);
        else {
        	for(int i = 2; i < n; i++) {
        		res = res * b + c;
        	}
        	System.out.println(res);
        }
        
    }
}