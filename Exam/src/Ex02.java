//�迭  1~100���� ���� ,������� ���, 1~100���� �� ���
public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[90];
		int hap=0;
		int i;
		for(i =0; i<arr.length; i++) {
		arr[i] = i+11;
		hap += arr[i];
		
	}	
		i=0;
		while(i<arr.length) {
			System.out.println("arr["+i+"]="+arr[i]);
			i++;
		}
		System.out.println("�迭�� ������ : "+ hap);
	}
}
