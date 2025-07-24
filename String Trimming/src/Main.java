import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        StringBuilder sb=new StringBuilder(name);
        do{
            char lastChar=sb.charAt(sb.length()-1);
            if(sb.length()==0){
                break;
            }
            if(Character.isDigit(lastChar)){
                sb.deleteCharAt(sb.length()-1);
            }
            else
                break;
        }while (true);
        System.out.println(sb.toString());
    }
}