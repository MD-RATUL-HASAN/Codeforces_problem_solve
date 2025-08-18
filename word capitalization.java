
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
                String word = input.nextLine();
        String result = word.substring(0,1).toUpperCase()+ word.substring(1);
        System.out.println( result);
    }
}
