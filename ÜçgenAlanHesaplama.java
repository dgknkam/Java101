import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // kenar uzunlığı girdilerini tanımla
         //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double a, b, c, u;
        double ucgeninalanı;
        Scanner kenar = new Scanner(System.in) ;

        System.out.println("1. kenar : " );
        a= kenar.nextInt();

        System.out.println("2. kenar : ");
        b= kenar.nextInt();

        System.out.println("3. kenar : ");
        c= kenar.nextInt();

        u= (a+b+c) / 2;

        ucgeninalanı= Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
        System.out.println("Üçgenin Alanı" +ucgeninalanı);

    }
}
