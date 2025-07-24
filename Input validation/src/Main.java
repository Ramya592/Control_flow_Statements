
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        int count=0;
        do{
            System.out.print("Enter a number: ");
            n=scan.nextInt();
            if(n<=0) {
                System.out.println("Invalid number");
                count++;
            }
        }while(n<=0);
        System.out.println(n+" is a positive number");
        System.out.println("You have attempted " + count + " times");
    }
}
