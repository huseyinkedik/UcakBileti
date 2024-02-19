import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculuktipi;
        double ucret;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km olarak giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz: ");
        yolculuktipi = input.nextInt();

        if ((mesafe >= 1) && (yas >= 1) && ((yolculuktipi == 1) || (yolculuktipi == 2))) {

            ucret = mesafe * 0.10;

            if (yas <= 12) {
                ucret *= 0.5;
            } else if (yas <= 24) {
                ucret *= 0.9;
            } else if (yas >= 65) {
                ucret *= 0.7;
            }
            if (yolculuktipi == 2) {
                ucret *= 0.8;
                ucret *= 2;
            }
            System.out.print("Bilet Ücreti: " + ucret);
        } else {
            System.out.print("Hatalı giriş yaptnız: ");
        }
    }
}
