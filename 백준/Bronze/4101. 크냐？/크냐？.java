import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			if(a == 0 && b == 0) break;
			else {
				if(a > b) System.out.println("Yes");
				else System.out.println("No");
			}
		}
	}

}
