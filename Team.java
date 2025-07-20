import java.util.Scanner;
public class Team{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;

    while (n-->0){
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int check = a+b+c;
       if (check>=2){
           count++;

       }

    }

       System.out.println(count);
       sc.close();
}
}