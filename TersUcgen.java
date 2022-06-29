import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n ;

        System.out.println("Kaç basamaklı olsun : ");

        n= inp.nextInt();
        
        for (int i=0 ; i<=n ; i++ ) {
            System.out.println();
            for (int k=1 ; k<=i ; k++  ){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * n - (2 * i + 1)); j++){
                System.out.print("*");
            }
        }
    }
}
