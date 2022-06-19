import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int kalan, dogumyili;
        System.out.println("Doğum Yılınızı Girin");
        dogumyili= input.nextInt();
        kalan = dogumyili % 12;
        if (kalan == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        if (kalan == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        if (kalan == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        if (kalan == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        if (kalan == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        if (kalan == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }if (kalan == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        if (kalan == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        if (kalan == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejdarha");
        }
        if (kalan == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        if (kalan == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        if (kalan == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }


    }
}
