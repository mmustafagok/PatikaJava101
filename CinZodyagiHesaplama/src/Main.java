import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("**************************");
        System.out.println(" Çin Zodyağı Hesaplama ");
        System.out.println("**************************");

        int yil;
        System.out.print("Doğum yılınızı giriniz: ");
        yil=input.nextInt();

        switch(yil%12){
            case 0:
                System.out.println("Zodyak Burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Zodyak Burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Zodyak Burcunuz. Köpek");
                break;
            case 3:
                System.out.println("Zodyak Burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Zodyak Burcunuz: Fare");
                break;
            case 5:
                System.out.println("Zodyak Burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Zodyak Burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Zodyak Burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Zodyak Burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Zodyak Burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Zodyak Burcunuz: At");
                break;
            case 11:
                System.out.println("Zodyak Burcunuz: Koyun");
                break;
            default:
                System.out.print("Hatalı girdiniz !!");
                break;
        }

    }
}
