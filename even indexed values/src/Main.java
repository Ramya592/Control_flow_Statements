import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i+=2){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}