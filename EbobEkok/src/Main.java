import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,ebob=0, i= 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("İki sayı giriniz: ");
        n1 = inp.nextInt();
        n2 = inp.nextInt();

        //n1%x=0
        while (i <= n1 && i<=n2){
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        int ekok= (n1*n2) / ebob;
        System.out.println("EKOK: " + ekok);
        System.out.println("EBOB: " + ebob);
    }
}