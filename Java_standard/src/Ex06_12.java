// 참조형 매개변수
class Car { 
	String color;   // 인스턴스 변수 (iv)
	String gearType;
	int door;
	
	Car(){} // 기본 생성자
	
	Car(String c, String g, int d){ // 매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex06_12 {

	public static void main(String[] args) {
		Car c1 = new Car(); // Car객체 생성 참조변수 c1에 저장
		c1.color = "white";
		c1.gearType = "auto"; // c1 인스턴스 변수 초기화
		c1.door = 4;
		
		Car c2 = new Car("White", "auto", 5); // Car객체 생성 참조변수c2에 저장
											  // c2 인스턴스 변수초기화
											  // 매개변수생성자가 있으면 간단하게 초기화
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " +
		 c1.gearType + ", door =  " + c1.door);

		System.out.println("c2의 color = " + c2.color + ", gearType = " +
		 c2.gearType + ", door =  " + c2.door);
	}
}

