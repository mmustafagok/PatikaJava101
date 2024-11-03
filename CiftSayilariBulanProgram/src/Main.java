import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, sum=0,count=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = inp.nextInt();

        for (int i=1; i<=n; i++){
            if (i%3==0 && i%4==0){
                sum+=i;
                count++;

            }
        }

        double average= sum/count;
        System.out.println(average);
    }
}