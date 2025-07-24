import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=scan.nextInt();
        int ans=2;
        for(int i=1;i<=n;i++){
            ans=ans*2;
            System.out.print(ans+" ");
        }

    }
}
