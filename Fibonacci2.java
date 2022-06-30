import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, a = 0, b = 1, c = 0;
        System.out.println("Kaç Elemanlı Bir Fibonacci Serisi olsun? : ");
        sayi = inp.nextInt();
        for (int i = 0; i <= sayi; i++) {

            if (i == 0) {
                System.out.print(i + ",");
            }
            c = b + a;
            b = a;
            a = c;

            System.out.print(c + ",");

        }
    }
}
