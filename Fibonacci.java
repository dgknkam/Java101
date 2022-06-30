import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, a = 0, b = 1, c = 0;
        System.out.println("Kaç Elemanlı Bir Fibonacci Serisi olsun? : ");
        sayi = inp.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (i == 0) {
                a = 0;
                b = 1;
                c = a + b;
                System.out.print(a + "," + b + ",");
            } else {
                a = b;
                b = c;
                c = a + b;
            }
            System.out.print(c + ",");
        }
    }
}
