import java.util.Scanner;

public class Ex18 {
 
    public static void main(String[] str) {
        Scanner s = new Scanner(System.in);
        String date = s.nextLine();
        String[] arr = date.split("-");
    	System.out.printf("%s%s",arr[0],arr[1]);
    }
}