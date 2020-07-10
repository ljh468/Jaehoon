// 다섯자리 정수 쪼개어 출력
import java.util.Scanner;

public class Ex22 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String num = s.nextLine();
    	String[] arr = num.split("");
    	
    	for(int i=0; i<arr.length; i++) {
    		System.out.print("["+ arr[i]);
    		for(int j = arr.length-1; j>i; j--) {
    				System.out.print(0);
    		}
    		System.out.println("]");
    	}
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        
        int ans[]=new int[str.length()];
        
        for(int i=0; i<str.length(); i++) {
            ans[i] = str.charAt(i)-'0';
        }
        //char-'0'을 이용하면 아스키코드값을 알 필요없이 int형으로 변환이 가능하다.
        
        
        System.out.println("["+ans[0]*10000+"]");
        System.out.println("["+ans[1]*1000+"]");
        System.out.println("["+ans[2]*100+"]");
        System.out.println("["+ans[3]*10+"]");
        System.out.println("["+ans[4]+"]");
        
        
        
    }
}
*/