import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        
        // 방 갯수를 잡아주는 변수
        int line = scan.nextInt();
        int[]arr = new int[line];
        
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = scan.nextInt();
        }
        
        int max = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(max < arr[i]) max = arr[i];
        }
        
        double[]score = new double[line];
        double sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	double temp = (double)arr[i] / max;
        	score[i] = temp * 100;
        }
        
        for(int i = 0; i < arr.length; i++) {
        	sum += score[i];
        }
        
        double avg = sum / line;
        
        System.out.println(avg);
    }
}