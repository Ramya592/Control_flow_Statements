import java.util.Scanner;
public class Main {
    public static void pascalTriangle(int n) {
        int line, i, j;
        for (line = 1; line <= n; line++) {
            for (j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
            int c = 1;
            for (i = 1; i <= line; i++) {
                System.out.print(c + " ");
                c = c * (line - i) / i;
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        pascalTriangle(scan.nextInt());
    }
}
