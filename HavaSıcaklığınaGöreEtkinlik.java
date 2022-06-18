import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        int heat;
        System.out.print("Sıcaklık Kaç Derece:");
        heat = input.nextInt();
        
        if (heat<5) {
            System.out.print("Kayak Yapmaya Gidebilirsiniz");
        } else if ((heat>=5) && (heat<25)) {
            if(heat<=15) {
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            if (heat>=15) {
                System.out.println("Pikniğe Gidebilirsiniz");
            }

        } else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
