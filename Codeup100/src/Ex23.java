// 시:분:초 에서 분만 출력
import java.util.Scanner;

public class Ex23 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String time = s.nextLine();
    	String[] arr = time.split(":");
    	
    	int minute = Integer.parseInt(arr[1]);
    	
    	System.out.println(minute);
    	}
    }


