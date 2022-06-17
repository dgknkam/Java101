import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayıyı Girin : ");
        n1 = input.nextInt();
        System.out.println("2.Sayıyı Girin :");
        n2 = input.nextInt();
        System.out.println("1=Toplama:\n2-Çıkarma:\n3-Çarpma:\n4-Bölme:");

        System.out.println("Bir Sayı Seçin");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuç;" + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç;" + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç;" + (n1 * n2));
                break;
            case 4:
                int karar = (n1 != 0 && n2 != 0) ? 2 : 1;

                switch (karar) {
                    case 1:
                        System.out.println("Bir Sayı Sıfıra Bölünemez");
                        break;
                    case 2:
                        System.out.println("Sonuç : " + n1 / n2);
                        break;
                }
                break;
        }


    }
}
