import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int money = scan.nextInt();
        int tax = (int)(money * 0.78);
        
        int unexpenses = (int)(money * 0.2);
        int bils = (int)(unexpenses*0.78);
        int reexpenses = (int)(money * 0.8);
        
        int res = reexpenses + bils;
        
        System.out.print(tax + " " + res);
        
        
    }
}