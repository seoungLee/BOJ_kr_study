import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		if(min < 45) {
			hour--;
			min = 60-(45-min);
			if(hour < 0) {
				hour=23;
			}
			System.out.println(hour + " " + min);
		}else {
			System.out.println(hour + " " + (min - 45));
		}
		
		
	}
}
