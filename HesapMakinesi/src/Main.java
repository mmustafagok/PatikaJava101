import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double sayi1, sayi2, sonuc = 0;
        int secenek;
        System.out.print("İlk sayıyı giriniz: ");
        sayi1 = inp.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = inp.nextDouble();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz: ");
        secenek = inp.nextInt();

        switch(secenek){
            case 1:
                sonuc= sayi1 + sayi2;
                break;
            case 2:
                sonuc= sayi1-sayi2;
                break;
            case 3:
                sonuc= sayi1*sayi2;
                break;
            case 4:
                if (sayi2==0){
                    System.out.println("Bölen 0 olamaz!");
                }else{
                    sonuc= sayi1/sayi2;
                }
                break;
            default:
                System.out.println("Geçerli seçenek seçilmedi!");
        }

        System.out.println("Sonuç= " + sonuc);


    }
}
