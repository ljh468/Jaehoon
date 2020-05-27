// java.lang.Object 부모
// 자식은 부모가 가지고 있는 모든 기능을 다 쓸수있다.
// Hello 자바파일은 java.lang.Object가 가지고있는 모든 기능을 쓸수있다.
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		int result;
		
		a=100;
		b=50;
		
		result = a+b;
		System.out.println(a+"+"+b+"="+result);
		
		result = a-b;
		System.out.println(a+"-"+b+"="+result);
		
		result = a*b;
		System.out.println(a+"*"+b+"="+result);
		
		result = a/b;
		System.out.println(a+"/"+b+"="+result);
		
	}

}
