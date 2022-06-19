import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double yıl;
        System.out.println("Yili Girin : ");
        yıl = input.nextDouble();

        if (yıl % 4 == 0) {
            if (yıl % 100 == 0) {
                if (yıl % 400 == 0) {
                    System.out.println("Artik Bir Yildir");
                }
                else {
                    System.out.println("Artik bir yildeğildir");
                }
            }
            else {
                System.out.println("artik bir yildir");
            }
        } else {
            System.out.println("Artik Bir Yil değildir");
        }

    }
}
