// �ܾ� �ɰ��� ���
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
		
		// toCharArry()�� String���ڿ��� char�迭�� ��ȯ����
		char[] pars = line.toCharArray();
		
		// pars�迭�� ���� �ϳ��������� char c ������ ���� (for each)
		for (char c : pars) {
			System.out.println("'" + c + "'");
		}
	}
}
*/