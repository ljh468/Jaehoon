// 단어 쪼개어 출력
import java.util.Scanner;

public class Ex21 {
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String str = s.nextLine();
    	
    	String[] arr = str.split("");
    	
    	for(int i=0; i<arr.length; i++) {
    		System.out.println("'"+arr[i]+"'");
    	}
    }
}

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		// toCharArry()은 String문자열을 char배열로 변환해줌
		char[] pars = line.toCharArray();
		
		// pars배열의 값을 하나씩꺼내서 char c 변수에 대입 (for each)
		for (char c : pars) {
			System.out.println("'" + c + "'");
		}
	}
}
*/