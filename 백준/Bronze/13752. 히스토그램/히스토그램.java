import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		int[] num = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < num[i]; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

	}

}