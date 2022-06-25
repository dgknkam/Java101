import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Girin : ");
        int sayi = input.nextInt();
        int bassayisi = 0;
        int basdegeri;
        int degisensayi = sayi;
        int baspow;
        int sonuc=0;
        //BASASAK SAYISI = ALINACAK ÜS
        while (0 != degisensayi) {   // 1basamak sayısını buul .. 2basamak değeri....3asamak sayısı kadar üssü al

            degisensayi /= 10;
            bassayisi++;

        }
        degisensayi = sayi;
        while (degisensayi != 0 ) {
            basdegeri = degisensayi % 10;
            baspow = 1;
            for (int i = 1; i <= bassayisi; i++) {
                baspow *= basdegeri;
            }
            sonuc += baspow;
            degisensayi /= 10;

        }
        if (sonuc==sayi) {
            System.out.println(sayi + " Bir Armstrong Sayısıdır");
        }
        else {
            System.out.println(sayi + "Bir Armstrong Sayısı Değildir.");
        }
    }
}
