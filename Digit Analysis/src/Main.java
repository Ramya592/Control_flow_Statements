import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N=sc.nextInt();
        while(N>0){
            int digit=N%10;
            if(digit%2!=0){
                if(digit%digit==0 && digit %1==0){
                    System.out.println("The digit "+digit+" is prime");
                }
                else{
                    System.out.println("The digit "+digit+" is not prime");
                }
            }
            else{
                System.out.println("The digit is Even");
            }
            N=N/10;
        }
    }
}
