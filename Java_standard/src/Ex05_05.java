//�ζǹ�ȣ ��÷�ϱ�
public class Ex05_05 {

	public static void main(String[] args) {
		int[] ball = new int[45]; // �迭 index 0~44 ����
		
		for(int i=0; i<ball.length; i++)
		ball[i] = i+1; // �迭�� �� 1~ ����
		
		int tmp=0;
		int k = 0;
		
		for(int i=0; i<6; i++) { //6�� ����
			k= (int)(Math.random()*45);
			tmp = ball[i]; //tmp ������ �̿��Ͽ� ball[i]�� ball[k] �ڸ��ٲٱ�
			ball[i] = ball[k];
			ball[k] = tmp;
		}
		for(int i=0; i<6; i++)
			System.out.println("ball["+i+"]="+ball[i]);
	}

}
