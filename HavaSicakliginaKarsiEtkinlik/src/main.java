import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sicaklik;
        System.out.print("Hava sıcaklık değerini giriniz: ");
        sicaklik=input.nextFloat();

        if(sicaklik<5){
            System.out.print("Kayak etkinliği yapabilirsiniz.");
        }
        else if(sicaklik<=25){
            if(sicaklik>=5 && sicaklik<=15){
                System.out.println("Sinema etkinliği yapabilirsiniz.");
            }
            if(sicaklik>=15 && sicaklik<=25){
                System.out.print("Piknik etkinliği yapabilirsiniz.");
            }
        }
        else{
            System.out.print("Yüzme etkinliği yapabilirsiniz.");
        }

    }
}