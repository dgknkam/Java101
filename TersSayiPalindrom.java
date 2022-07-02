import java.util.Scanner;

public class TersSayi {

    static int TersSayi(int number) {
        int temp = number , reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp/=10;

        } return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Ters SAyı olup olmadığını merak Ettiğiniz Sayıyı girin : ");
        int number = inp.nextInt();
        System.out.println(TersSayi(number));
    }
}
