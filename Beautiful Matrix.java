import java.util.Scanner;
public class Main {
    public static void main ( String[] args ){
        Scanner inpout = new Scanner(System.in);
        int row = 0, colam = 0;
        for (int i = 1; i<= 5 ; i++){
            for ( int j = 1 ; j <= 5 ; j++){
                int x = inpout .nextInt();
                        if (x == 1) {
                            row = i;
                            colam = j;
                        }

            }
        }
        int rowcolom = Math.abs(row - 3) + Math.abs(colam - 3);
        System.out.println(rowcolom);

    }
}