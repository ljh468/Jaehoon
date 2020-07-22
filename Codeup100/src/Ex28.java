// 8진수로 입력받아  10진수로 출력
import java.util.Scanner;

public class Ex28 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String a = s.nextLine();
    	
    	int octal = Integer.parseInt(a, 8);
    	
    	System.out.println(octal);
    	}
    }

/* 16진수로 입력받아 8진수로 출력
import java.util.Scanner;


public class Ex28 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String a = s.nextLine();
    	
    	int octal = Integer.parseInt(a, 16);
    	String num = Integer.toOctalString(octal);
    	System.out.println(num);
    	}
    }
*/