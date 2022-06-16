import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        double armut;
        double elma;
        double domates;
        double muz;
        double patlıcan;
        Scanner input = new Scanner(System.in);

        //Meyveler ve KG Fiyatları
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        System.out.println("Armut Kaç Kilo :");
        armut=input.nextDouble();
        System.out.println("Elma Kaç Kilo :");
        elma=input.nextDouble();
        System.out.println("Domates Kaç Kilo");
        domates=input.nextDouble();
        System.out.println("Muz Kaç Kilo");
        muz=input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo :");
        patlıcan=input.nextDouble();

        double toplamtutar;
        toplamtutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.0);
        System.out.println("Toplam Tutar : " + toplamtutar);

    }
}
