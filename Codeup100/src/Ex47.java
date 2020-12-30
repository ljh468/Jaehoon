import java.util.Scanner;
public class Ex47 {
        public static void main(String[] args) {
            
            Scanner s = new Scanner(System.in);
            int mon = s.nextInt();
            
            switch(mon) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
                default:
        }
    }
}

//평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
/*
public class Ex47 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char st = s.next().charAt(0);
		
		switch(st) {
			case 'A':
				System.out.println("best!!!");
				break;
			case 'B':
				System.out.println("good!!");
				break;
			case 'C':
				System.out.println("run!");
				break;
			case 'D':
				System.out.println("slowly~");
				break;
			default:
				System.out.println("what?");
		}
	}
}
*/