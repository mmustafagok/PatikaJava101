import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance,age,tripType;
        double price,kmTl = 0.10;

        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the distance in KM: ");
        distance = inp.nextInt();
        System.out.print("Enter your age: ");
        age = inp.nextInt();
        System.out.print("1- One Way\n2- Round Trip \nChoose the trip type: ");
        tripType = inp.nextInt();

        if(distance<0 || age<0 || (tripType!=1 && tripType!=2)){
            System.out.println("You Entered Incorrect Data");
            return;
        }
        price = kmTl*distance;



        if (age<=12){
            price*=0.5;
        } else if (age>12 && age<=24) {
            price*=0.9;
        } else if (age>=65) {
            price*=0.7;
        }

        if (tripType==2){
            price*=0.8;
        }


        System.out.println("Price: " + price);
    }
}