import java.util.Scanner;

public class Ex20 {
 
    public static void main(String[] str) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split("\\.");
    	System.out.println(Integer.valueOf(arr[0]));
    	System.out.println(Integer.valueOf(arr[1]));
    }
}