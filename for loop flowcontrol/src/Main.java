import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int j,k;
        boolean found=false;
        int num=scan.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scan.nextInt();
        }
        for(k=0;k<num && !found;k++){
            for(j=k+1;j<num;j++) {
                if (arr[k] == arr[j]) {
                    System.out.print(j);
                    found=true;
                    break;
                }
            }
        }
        if(!found) {
            System.out.print(-1);
        }
    }
}