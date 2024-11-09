import java.util.Scanner;

public class Main {
    static void asal(int number){
        int count=0;
        for (int i=2; i<number;i++){
            if (number%i==0){
                count++;
            }
        }

        if (number!=0){
            if (number==1){
                System.out.println("Sayı asal değildir.");
            } else if (count==0) {
                System.out.println("Sayı asaldır.");
            }
        }
    }


    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int number;



        do {
            System.out.print("Sayı giriniz(0'a basarsanız işlem durur): ");
            number= inp.nextInt();
            asal(number);

        }while (number!=0);


    }
}