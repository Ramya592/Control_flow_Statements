import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        if(x>=-2 && x<=2){
            switch(x+2){
                case 0:
                case 1:
                    System.out.println("Negative");
                    break;
                case 2:
                    System.out.println("zero");
                    break;
                case 3:
                case 4:
                    System.out.println("positive");
                    break;
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}