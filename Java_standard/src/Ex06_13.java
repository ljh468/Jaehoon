// 생성자에서 다른 생성자 호출하기 - this()

class Car2 {
	String color;
	String gearType;
	int door;

	Car2(){
		this("white", "auto", 4);	// 생성자에서 다른생성자 추출, 첫줄에만 가능
	}								// 클래스이름 Car대신 this를 사용
	
	Car2(String color){				// Car2(String color, String gearType, int door)를 호출
	this(color, "auto", 4);
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class Ex06_13 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue"); //  객체생성과 동시에 초기화
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " +
		 c1.gearType + ", door = " + c1.door);

		System.out.println("c2의 color = " + c2.color + ", gearType = " +
		 c2.gearType + ", door = " + c2.door);
	}
}
