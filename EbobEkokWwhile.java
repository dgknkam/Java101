import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("n1 sayısını girin");
        int n1 = inp.nextInt();

        System.out.println("n2 Sayısını Girin");
        int n2 = inp.nextInt();
        int k=n1;
        int ebob;
        int ekok;
        while (k>1) {
            if ( n1 % k==0 && n2 %k==0){
                ebob=k;
                System.out.println("Ebob : " + ebob);
                break ;
            }
            k--;

        }
        ekok = (n1*n2) / k ;
        System.out.println("Ekok : "+ ekok);

    }
}
