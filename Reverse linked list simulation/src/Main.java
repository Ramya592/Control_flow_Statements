import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] value=new int[n];
        int[] next=new int[n];
        for(int i=0;i<n;i++){
            value[i]= scan.nextInt();
            next[i]= scan.nextInt();
        }
        int head=scan.nextInt();
        int prev=-1;
        int current=head;
        while(current!=-1){
            int nextIndex=next[current];
            next[current]=prev;
            prev=current;
            current=nextIndex;
        }
        head=prev;
        System.out.println("Reversed List is : ");
        while(head!=-1){
            System.out.print(value[head]+" ");
            head=next[head];
        }
    }
}