import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int a = 1; a <= (n - i); a++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } //boşluk artarak yıldız azalarak

        for (int i = 1; i <= (n - 1); i++) {
            for (int a = 0; a < i; a++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * n - (2 * i + 1)); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
