// 시.분.초 에서 '-'이용하고 순서바꿔서 출력
import java.util.Scanner;

public class Ex24 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String time = s.nextLine();
    	String[] arr = time.split("\\.");
    	
    	System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
    	}
    }


