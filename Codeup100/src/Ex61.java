import java.util.Scanner;
// [����-����] �Բ� ���� Ǫ�� ��(����)
public class Ex61{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
       
        int num = 1;
        while(a!=0 && b!=0 && c!=0) {
        	if(num%a == 0 && num%b==0 && num%c==0)
        		break;
        	num++;
        }
        System.out.println(num);
        
    }
}