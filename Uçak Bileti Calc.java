import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double mesafe, normalBiletFiyati, yas, yasIndirimi, yolculukTipi, IndirimliTuttar;

        System.out.println("Uçak Bilet Fiyatlarına Hoşgeldiniz: ");
        System.out.println("Lütfen Uçuş Mesafesini Girin ");

        mesafe = input.nextDouble();
        normalBiletFiyati = mesafe * 0.10;
        System.out.println("Lütfen Yaşınızı Girin:");
        yas = input.nextDouble();
        System.out.println("Yolculuk Tipinizi Seçiniz?\n 1-Tek Yön mü?\n 2-Gidiş Dönüş mü? ");
        yolculukTipi = input.nextInt();
        yasIndirimi = 0;
        if (12 > yas) {
            yasIndirimi = normalBiletFiyati * 0.50;
        } else if (12 <= yas) {
            if (yas < 24) {
                yasIndirimi = normalBiletFiyati * 0.10;
            } else if ((24 <= yas) && (yas <= 65)) {
                yasIndirimi = 0;

            } else {
                yasIndirimi = normalBiletFiyati * 0.30;
            }
        }
        IndirimliTuttar = normalBiletFiyati - yasIndirimi;

        if ((yolculukTipi!=1) && (yolculukTipi!=2)) {
            System.out.println("Hatalı Yolculuk Tipi");
        } else{
            if (yolculukTipi == 1) {
                normalBiletFiyati = IndirimliTuttar;
            }
            else if (yolculukTipi == 2) {
                normalBiletFiyati = 2 * (IndirimliTuttar - (IndirimliTuttar * 0.20));

            }
            System.out.println("Tutar: " + normalBiletFiyati);
        }




    }

    }


