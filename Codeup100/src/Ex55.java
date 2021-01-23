import java.util.Scanner;
// [기초-종합] 빛 섞어 색 만들기(설명)
public class Ex55{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] color = s.nextLine().split(" ");
		s.close();
		
		int rPick = Integer.parseInt(color[0]);
		int gPick = Integer.parseInt(color[1]);
		int bPick = Integer.parseInt(color[2]);

		int count = 0;
		for(int r=0; r<rPick; r++){
			for(int g=0; g<gPick; g++){
				for(int b=0; b<bPick; b++){
					
					System.out.println(r+" "+g+" "+b);
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}

