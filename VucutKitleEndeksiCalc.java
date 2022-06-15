import java.util.Scanner;

public class Main{
    public static void main(String[] Args) {

        Scanner inp= new Scanner(System.in);

        double boy ;
        double kilo ;
        double vucudendeksi;

        System.out.println("Boyunuzu Metre Cinsinden Girin : ");
        boy= inp.nextDouble();
        System.out.println("Kilonuzu Giriniz : ");
        kilo=inp.nextDouble();

        vucudendeksi= kilo/(boy*boy);

        System.out.println("Vucudendeksi : " +vucudendeksi);

    }
}
