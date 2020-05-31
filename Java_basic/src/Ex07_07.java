
public class Ex07_07 {

	public static void main(String[] args) {

		int i;
		
		for(i=1; i<=100; i++) {
			System.out.println("for문을 "+i+"번 실행하셨습니다.");
			if(i==57)
				break;
		}
			System.out.println("57번째에서 종료하였습니다.");
	}

}
