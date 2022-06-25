import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a , b;
        System.out.println("Üssü Alınacak Sayı : ");
        a= inp.nextInt();
        System.out.println("Üs Olacak Sayı : ");
        b = inp.nextInt();
        // 3^4=3*3*3*3

        // for (statement 1; statement 2; statement 3)
        int total = 1 ;
        for (int i = 0 ; i<b ; i++ ) {
            total*= a;


        }  System.out.println("Sayının Üssü : " + total);
    }
}
