
public class Test03 {
public static void main(String[] args) {
		
		int[] num = new int[90];
		int i = 0;
		int hap = 0;
		
		for(i=0; i<num.length; i++) {
			num[i] = i + 11;
			hap = hap + num[i]; 
		}
		
		i = 0;
		while(i<num.length) {
			System.out.println("num["+i+"] : "+ num[i]);
			i++;
		}
		
			System.out.println("���� : "+hap);
	}

}
