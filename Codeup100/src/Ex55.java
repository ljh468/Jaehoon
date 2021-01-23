import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//[기초-종합] 빛 섞어 색 만들기(설명)
public class Ex55 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
		try {
			String[] n = br.readLine().split(" ");
			int count = 0;
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for (int i = 0; i < Integer.valueOf(n[0]); i++) {
				
				for (int j = 0; j < Integer.valueOf(n[1]); j++) {
					
					for (int k = 0; k < Integer.valueOf(n[2]); k++) {
						
						bw.write(i + " " + j + " " + k + "\n");
						count++;
					}
				}
			}
			bw.write(String.valueOf(count));
			bw.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//end of main()
}

/* 시간초과
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
*/

