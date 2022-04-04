import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] number = new int[3];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}
		
		
		for(int i = 0; i < number.length; i++){
			for(int j = i + 1; j < number.length; j++){
			if(number[i] > number[j]){
				int temp = number[i];
				number[i] = number[j];
				number[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

	}

}
