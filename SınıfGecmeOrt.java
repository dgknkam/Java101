import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        matematik = input.nextInt();
        while (!((0 <= matematik) && (matematik <= 100))) {
            System.out.println("0-100 arasında bir sayı giriniz");
            matematik = input.nextInt();
        }

        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        while (!((0 <= fizik) && (fizik <= 100))) {
            System.out.println("0-100 arasında bir sayı giriniz");
            fizik = input.nextInt();
        }
        
        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        while (!((0 <= turkce) && (turkce <= 100))) {
            System.out.println("0-100 arasında bir sayı giriniz");
            turkce = input.nextInt();
        }

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        while (!((0 <= kimya) && (kimya <= 100))) {
            System.out.println("0-100 arasında bir sayı giriniz");
            kimya = input.nextInt();

        }

        System.out.println("Muzik Notunuzu Giriniz : ");
        muzik = input.nextInt();
        while (!((0 <= muzik) && (muzik <= 100))) {
            System.out.println("0-100 arasında bir sayı giriniz");
            muzik = input.nextInt();

        }

        double avarage = (matematik + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta Kaldınız");

        } else {
            System.out.println("Tebrikler Sınıfı Geçtiniz");

        }

        System.out.println("Ortalama : " + avarage);
    }

}
