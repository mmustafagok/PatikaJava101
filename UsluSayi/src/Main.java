import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taban*taban*taban
        // Kullanıcıdan taban ve üs değerlerini alma
        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        int sonuc= 1;

        for (int i=1;i<=us;i++){
            sonuc*=taban;
        }
        System.out.println(sonuc);
    }
}