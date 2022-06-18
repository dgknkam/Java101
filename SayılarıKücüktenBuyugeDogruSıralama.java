import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("a sayısını girin : ");
        a = input.nextInt();
        System.out.println("b sayısını girin : ");
        b = input.nextInt();
        System.out.println("c sayısını girin : ");
        c = input.nextInt();
        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println(c + " " + b + " " + a + " ");
                System.out.print("a < b < c");
            } else {
                System.out.println(b + " " + c + " " + a + " ");
                System.out.print("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println(c + " " + a + " " + b + " ");
                System.out.print("b < a < c");
            } else {
                System.out.println(a + " " + c + " " + b + " ");
                System.out.print("b < c < a ");
            }
        } else {
            if (a < b) {
                System.out.println(b + " " + a + " " + c + " ");
                System.out.print("c < a <b");
            } else {
                System.out.println(a + " " + b + " " + c + " ");
                System.out.println("c < b < a ");

            }
        }
    }
}
