public class Main {
    static void pattern(int number, int original, boolean decreasing){

        System.out.print(number + " ");

        // Sayı başlangıç değerine ulaşıldığında (ve artış modundayken) işlemi durdur
        if (number == original && !decreasing) return;

        // Azalma modundaysak ve sayı pozitifse 5 çıkar
        if (decreasing) {
            if (number > 0) {
                pattern(number - 5, original, true);
            } else {
                // Sayı negatif veya 0 olduğunda artış moduna geç
                pattern(number + 5, original, false);
            }
        } else {
            // Artış modundaysak 5 ekle
            pattern(number + 5, original, false);
        }



    }

    public static void main(String[] args) {

        pattern(12,12, true);

    }
}