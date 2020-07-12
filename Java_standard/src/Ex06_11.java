// 기본생성자
class Data_1 { 
	int value;
}

class Data_2 {
	int value;
	
	Data_2(){} // Data_2의 객체생성시 기본생성자가 필요함
	
	Data_2(int x){
		value = x;
	}
}
class Ex06_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
	}
}

