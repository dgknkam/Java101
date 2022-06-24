import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //n!=  1 * 2 * 3 * 4....*n

        /*int n = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;

        }
        System.out.println(n + "faktöriyel :" + total ); */

        int n , r;
        int ntotal =1;
        int rtotal =1;
        int ktotal =1;
        System.out.println("n icin faktöriyel girin: ");
        n= input.nextInt();
        System.out.println("r için faktöriyel girin: ");
        r= input.nextInt();
        int i=1, y=1, x=1;
        while(i<=n){
            ntotal=ntotal*i;
            i++;
            System.out.println("nTotal : " + ntotal);
        }
        while(x<=r) {
            rtotal=rtotal*x;
            x++;
            System.out.println("rTotal : " +rtotal);
        }
        //C(n,r) = n! / (r! * (n-r)!)
        int k=n-r;
        while(y<=k) {
            ktotal=ktotal*y;
            y++;
            System.out.println("kTotal : " +ktotal);
        }
        int c;
        c= ntotal/(rtotal*ktotal) ;
        System.out.println("Sonuç : "+ c);

    }
}
