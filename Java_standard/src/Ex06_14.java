// ��������� �ʱ�ȭ

class Ex06_14 {
	static {
		System.out.println("static {}"); // Ŭ���� �ʱ�ȭ��
	}
	
	{
		System.out.println("{ }"); // �ν��Ͻ� �ʱ�ȭ��
	}
	
	public  Ex06_14() {
		System.out.println("������"); // ������ (iv �ʱ�ȭ)
	}
	
	public static void main(String[] args) {
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
		Ex06_14 bt = new Ex06_14();
		
		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex06_14 bt2 = new Ex06_14();
	}
}

/* ��������� �ʱ�ȭ ����2
 * 	class Ex06_15{
 * 	static int[] arr = new int[10];
 * 
 * 	static{
 * 		for(int i=0; i<arr.length; i++){
 *      // 1��  10������ ������ ���� �迭 arr�� �����Ѵ�.
 * 		arr[i] = (int) (math.random()*10) + 1;
 * 		}
 *	}
 * 
 * 	public static void main(String[] args){
 * 		for(int i0; i< arr.length; i++)
 * 			System.out.println("arr["+i+"] :" + arr[i]);
 * 	}
 * }
 * 
 * 
*/

