import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin yarıçapını (r) giriniz: ");
        int r=input.nextInt();

        System.out.print("Alanını hesaplamak istediğiniz açıyı giriniz: ");
        int a=input.nextInt();

        final double pi=3.14;

        double alan=pi*r*r;
        double cevre=2*pi*r;
        double daireDilimi=alan*((double)a/360);

        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Daire diliminin alanı: "+daireDilimi);
    }

}