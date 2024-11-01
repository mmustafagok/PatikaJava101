import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        double tutar, kdvOran = 0, kdvliFiyat;
        Scanner inp= new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        tutar = inp.nextDouble();
        if (tutar < 1000) {
            kdvOran=0.18;
        } else if (tutar>=1000) {
            kdvOran=0.08;
        }
        kdvliFiyat = tutar + tutar*kdvOran;
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
    }
}
