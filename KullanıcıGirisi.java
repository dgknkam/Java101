import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String ıd, pw;

        Scanner input = new Scanner(System.in);

        System.out.print("Id Giriniz : ");
        ıd = input.nextLine();
        System.out.print("Pw Giriniz : ");
        pw = input.nextLine();

        if (ıd.equals("dgknkam") && (pw.equals("elektrik"))) {
            System.out.print("Hoşgeldiniz");
        } else {
            System.out.println("Bilgilerinizi Kontrol Ediniz");
            System.out.print("Şifrenizi Değiştirmek İstermisiniz? Evet mi hayır mı? ");
            String karar = input.nextLine();
            if (karar.equals("evet")) {
                System.out.println("Yeni Şifrenizi Yazınız :");
                pw = input.nextLine();
                if(pw.equals("elektrik")) {
                    System.out.println("Eski Şifrenizi Kullanmazsınız. Lütfen Yeni Şifre Oluşturunuz. ");
                }
                pw = input.nextLine();
                System.out.println("Yeni Şifre Başarıyla Oluşturuldu");

                System.out.print("Id Giriniz : ");
                ıd = input.nextLine();
                System.out.print("Pw Giriniz : ");
                pw = input.nextLine();
            } else {
                System.out.println("Tabii Efendim ");
            }


        }
        

    }
}
