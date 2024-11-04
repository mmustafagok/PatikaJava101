import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select,n,buyuk=0,kucuk=0;
        System.out.print("Kaç sayı gireceksiniz: ");
        select = inp.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        n = inp.nextInt();
        buyuk = n;
        kucuk = n;

        for (int i=2; i<=select; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            n = inp.nextInt();

            if(n>buyuk){
                buyuk=n;
            }
            if (n<kucuk){
                kucuk=n;
            }
        }
        System.out.println(buyuk);
        System.out.println(kucuk);
    }
}