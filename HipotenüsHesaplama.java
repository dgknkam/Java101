import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // kenar uzunlığı girdilerini tanımla
        int a,b ;
        double c ;
        Scanner kenar = new Scanner(System.in) ;

        System.out.println("İlk kenar : " );
        a= kenar.nextInt();

        System.out.println("ikinci kenar : ");
        b= kenar.nextInt();

        c= Math.sqrt((a*a)+(b*b)) ;

        System.out.println("Hipotenüs : " + c );
    }
}
