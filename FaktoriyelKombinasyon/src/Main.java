import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan N ve R değerlerini alma
        System.out.print("N değerini girin: ");
        int n = scanner.nextInt();
        System.out.print("R değerini girin: ");
        int r = scanner.nextInt();

        // R, N'den büyükse hata mesajı
        if (r > n) {
            System.out.println("Hatalı veri! R, N'den büyük olamaz.");
            return;
        }

        // Faktöriyel hesaplama
        long faktöriyelN = 1;
        for (int i = 1; i <= n; i++) {
            faktöriyelN *= i; // N'in faktöriyeli
        }

        long faktöriyelR = 1;
        for (int i = 1; i <= r; i++) {
            faktöriyelR *= i; // R'nin faktöriyeli
        }

        long faktöriyelNR = 1;
        for (int i = 1; i <= (n - r); i++) {
            faktöriyelNR *= i; // (N-R)'nin faktöriyeli
        }

        // Kombinasyonu hesaplama
        long kombinasyon = faktöriyelN / (faktöriyelR * faktöriyelNR);

        // Sonucu yazdırma
        System.out.printf("C(%d, %d) = %d%n", n, r, kombinasyon);
    }
}