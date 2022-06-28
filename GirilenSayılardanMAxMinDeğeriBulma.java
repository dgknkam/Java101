import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Kaç Adet Sayı Gireceksiniz : ");
        int n= inp.nextInt();
        int enbüyüksayi=0 , enkücüksayi=0 ;
        for (int i =1 ; i<=n ; i++ ) {

            System.out.print(i+". Sayiyi Girin : ");
            int sayi= inp.nextInt();
            if(i==1){
                enkücüksayi=sayi;
            }

            if(sayi>enbüyüksayi){
                enbüyüksayi=sayi;
            } else {
                enkücüksayi=sayi;
            }

        }
        System.out.println("En Buyuk Sayi " +enbüyüksayi);
        System.out.println("En Kucuk Sayi " +enkücüksayi);
    }
}
