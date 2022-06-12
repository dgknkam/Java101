import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        //  değişkenleri oluştur
        double mat, fizik, kimya, turkce,  tarih, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcı değerlerini al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

        double ortalama;

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        ortalama = toplam / 6.0 ;
        System.out.println("Ortalamaniz : " + ortalama );

        //variable = (condition) ? expressionTrue :  expressionFalse;
        System.out.println((ortalama >=60) ? "Sınıfı Geçtiniz Tebrikler!" : "Sınıfta kaldın Çok Çalışmalısın!"  );


    }
}

