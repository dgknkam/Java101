import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int counter = 0;
        int toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayı Girin");
        sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                if (i == 0) {
                    continue;
                }
                System.out.println(i);
                toplam += i;
                counter++;
            }

        }
        System.out.println("Ortalama : " + toplam / counter);
    }
}
