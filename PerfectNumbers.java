import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Bir Sayi giriniz : ");
        int sayi= inp.nextInt();
        int toplam =0 ;

        for (int i=1; i<=sayi ; i++){
            if(sayi==i){
                continue;
            }
            if(sayi%i==0){
                toplam+=i;
            }
        }if(toplam==sayi){
            System.out.println("Mükemmel bir sayidir");
        } else {
            System.out.println("Mükemmel Sayi değidlri.");
        }
    }
}
