
public class MyCreator {
	
	MyCreator() {
		System.out.println("메모리에 올라갈때 기본적으로 실행되는 생성자 함수 ");
	}
	MyCreator(String pName) {
		System.out.println(pName + "원래 없지만, 강제로 만든 메모리 올리는 생성자 함수");
		
		this.name = pName;
	}
	
	private String name;
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
