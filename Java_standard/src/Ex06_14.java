// 멤버변수의 초기화

class Ex06_14 {
	static {
		System.out.println("static {}"); // 클래스 초기화블럭
	}
	
	{
		System.out.println("{ }"); // 인스턴스 초기화블럭
	}
	
	public  Ex06_14() {
		System.out.println("생성자"); // 생성자 (iv 초기화)
	}
	
	public static void main(String[] args) {
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
		Ex06_14 bt = new Ex06_14();
		
		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex06_14 bt2 = new Ex06_14();
	}
}

/* 멤버변수의 초기화 예제2
 * 	class Ex06_15{
 * 	static int[] arr = new int[10];
 * 
 * 	static{
 * 		for(int i=0; i<arr.length; i++){
 *      // 1과  10사이의 임의의 값을 배열 arr에 저장한다.
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

