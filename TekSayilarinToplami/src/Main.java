import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, sum=0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            n = inp.nextInt();
            if (n%4==0){
                sum+=n;
            }
        }while(n%2==0);
        System.out.println("Sum of multiples of 4= " + sum);
    }
}