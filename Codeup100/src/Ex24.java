// ��.��.�� ���� '-'�̿��ϰ� �����ٲ㼭 ���
import java.util.Scanner;

public class Ex24 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String time = s.nextLine();
    	String[] arr = time.split("\\.");
    	
    	System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
    	}
    }


