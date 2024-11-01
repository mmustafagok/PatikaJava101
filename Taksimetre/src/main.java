import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double kmTl=20,km,acılıs=30, tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = inp.nextDouble();

        tutar = acılıs + km*kmTl;
        if (tutar<100){
            tutar = 100;
        }
        System.out.println("Toplam tutar: " + tutar);
    }
}
