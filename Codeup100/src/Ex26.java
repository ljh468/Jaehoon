// 8����(octal) ��ȯ
import java.util.Scanner;

public class Ex26 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int a = s.nextInt();
    	String octal = Integer.toOctalString(a);
    	
    	System.out.println(octal);
    	}
    }

/* (16����) hexadecimal ��ȯ
 * import java.util.Scanner;

public class Ex26 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int a = s.nextInt();
    	
    	System.out.printf("%x",a);
    	}
    }
 */
