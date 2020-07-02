public class AppleTree extends Tree{
						//extends 상속받겠다. Tree에서
	public void exe() {
		super.treePrint();
		//super 는 부모를 의미
		//부모클래스에서 treeprint를 사용하겠다.
		
	}
	
	@Override
	public void treePrint(){
	System.out.println("슈퍼클래스에서 정의한 함수를 이것으로 변경함");
}

}