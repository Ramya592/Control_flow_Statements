import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int score=scan.nextInt();
        int x=score/10;
        switch (x){
            case 9:
            case 10:
                System.out.println("Greater than 90");
                break;
            case 8:
                System.out.println("Greater than 80");
                break;
            case 7:
                System.out.println("Greater than 70");
                break;
            case 6:
                System.out.println("Greater than 60");
                break;
        }
    }
}