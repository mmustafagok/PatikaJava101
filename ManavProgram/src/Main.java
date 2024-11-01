import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double elmafiyat=3.67;
        double armutfiyat=2.14;
        double domatesfiyat=1.11;
        double muzfiyat=0.95;
        double patlicanfiyat=5.0;
        double sonuc=0;

        System.out.println("Kaç kilo elma alacaksınız?");
        double elmaKilo=scanner.nextDouble();

        scanner.nextLine();
        sonuc+=(elmaKilo*elmafiyat);


        System.out.println("Kaç kilo armut alacaksınız?");
        double armutKilo=scanner.nextDouble();

        scanner.nextLine();
        sonuc+=(armutKilo*armutfiyat);

        System.out.println("Kaç kilo domates alacaksınız?");
        double domatesKilo=scanner.nextDouble();
        scanner.nextLine();
        sonuc+=(domatesKilo*domatesfiyat);

        System.out.println("Kaç kilo muz alacaksınız?");
        double muzKilo=scanner.nextDouble();

        scanner.nextLine();
        sonuc+=(muzKilo*muzfiyat);

        System.out.println("Kaç kilo patlıcan alacaksınız?");
        double patlicanKilo=scanner.nextDouble();

        scanner.nextLine();
        sonuc+=(patlicanKilo*patlicanfiyat);
        System.out.println("Toplam tutar: "+sonuc);

    }

}

