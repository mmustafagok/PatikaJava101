import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, tarih, ort;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        ort = (mat+fizik+turkce+kimya+tarih) /5;
        System.out.println("Ortalamanız: " + ort);

        if (ort<50){
            System.out.println("Kaldınız!");
        }else {
            System.out.println("Geçtiniz!");
        }

    }







}