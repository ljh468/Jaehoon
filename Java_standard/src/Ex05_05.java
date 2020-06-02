//로또번호 추첨하기
public class Ex05_05 {

	public static void main(String[] args) {
		int[] ball = new int[45]; // 배열 index 0~44 선언
		
		for(int i=0; i<ball.length; i++)
		ball[i] = i+1; // 배열에 값 1~ 저장
		
		int tmp=0;
		int k = 0;
		
		for(int i=0; i<6; i++) { //6번 섞기
			k= (int)(Math.random()*45);
			tmp = ball[i]; //tmp 변수를 이용하여 ball[i]와 ball[k] 자리바꾸기
			ball[i] = ball[k];
			ball[k] = tmp;
		}
		for(int i=0; i<6; i++)
			System.out.println("ball["+i+"]="+ball[i]);
	}

}
