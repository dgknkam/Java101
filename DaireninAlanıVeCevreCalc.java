import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {

        int r ;
        double pi = 3.14 ;

        Scanner inp  = new Scanner(System.in);

        System.out.println("Dairenin Yarıçapını Girin : ");

        r= inp.nextInt();
         double alan= pi*r*r ;
         double cevre= 2*pi*r;

        System.out.println("Dairenin Alanı : "+ alan);
        System.out.println("Dairenin Çevresi : "+ cevre);

        double dilimalanı;
        double a;

        System.out.println("Merkez Acıyı Girin : ");
        a= inp.nextInt();
        
        dilimalanı=(pi*(r*r)*a)/360 ;

        System.out.println("Dilim Alanı : " + dilimalanı);

    }
}
