// 8진수(octal) 변환
import java.util.Scanner;

public class Ex26 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int a = s.nextInt();
    	String octal = Integer.toOctalString(a);
    	
    	System.out.println(octal);
    	}
    }

/* (16진수) hexadecimal 변환
 * import java.util.Scanner;

public class Ex26 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int a = s.nextInt();
    	
    	System.out.printf("%x",a);
    	}
    }
 */
