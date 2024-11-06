import java.util.Scanner;

public class Main {

    static void plus(){
        Scanner inp = new Scanner(System.in);
        double number, result=0;
        int i = 1;
        System.out.println("Press 0 to end summation");
        while (true){
            System.out.print("Enter the " + i + ". number: ");
            number = inp.nextDouble();
            if (number==0){
                break;
            }
            result += number;
            i++;
        }
        System.out.println("Sum of the numbers you entered " + result);
    }

    static void minus(){
        Scanner inp = new Scanner(System.in);
        double number, result=0;
        int i = 2;
        System.out.println("Press 0 to end subtraction");
        System.out.print("Enter the first number: ");
        number = inp.nextDouble();
        result+=number;
        while (true){
            System.out.print("Enter the " + i + ". number: ");
            number = inp.nextDouble();
            if (number==0){
                break;
            }
            result -= number;
            i++;
        }
        System.out.println("Substraction of the numbers you entered " + result);
    }

    static void times(){
        Scanner inp = new Scanner(System.in);
        double number, result=1;
        int i = 1;
        System.out.println("Press 1 to end multiplication");
        while (true){
            System.out.print("Enter the " + i + ". number: ");
            number = inp.nextDouble();
            if (number==1){
                break;
            }
            result *= number;
            i++;
        }
        System.out.println("Multiplication of the numbers you entered " + result);
    }

    static void divided(){
        Scanner inp = new Scanner(System.in);
        double number,number2, result=1;

        System.out.print("Enter the first number: ");
        number = inp.nextDouble();;

        System.out.print("Enter the second number: ");
        number2 = inp.nextDouble();

        if (number2==0){
            System.out.println("The second number can not be 0");
        }else {
            result=number/number2;
        }
        System.out.println("Divicion of the numbers you entered: " + result);

    }

    static void power(){
        Scanner inp = new Scanner(System.in);
        int base, power, result=1;
        System.out.print("Enter the base value: ");
        base = inp.nextInt();

        System.out.print("Enter the power value: ");
        power = inp.nextInt();

        for (int i =1; i<=power; i++){
            result*=base;
        }
        System.out.println("Result: " + result);
    }
    // 5! = 5*4*3*2*1
    static void factorial(){
        Scanner inp = new Scanner(System.in);
        int number,result=1;
        System.out.println("Enter the number: ");
        number = inp.nextInt();

        for (int i=1; i<=number; i++){
                result*=i;
        }
        System.out.println("Result: "+ result);
    }

    static void mod(){
        Scanner inp = new Scanner(System.in);
        int number,number2,result=1;
        System.out.println("Enter the first number: ");
        number = inp.nextInt();
        System.out.println("Enter the second number: ");
        number2=inp.nextInt();
        if (number2==0){
            System.out.print("The second number can not be 0");
        }else {
            result= number%number2;        }

        System.out.print("Result: " + result);
    }

    static void rectArea(){
        Scanner inp = new Scanner(System.in);
        int edge,edge2,result=1;
        System.out.print("Enter the first edge: ");
        edge = inp.nextInt();
        System.out.print("Enter the second edge: ");
        edge2=inp.nextInt();
        if (edge==0 || edge2==0){
            System.out.print("The edge can not be 0");
        }else {
            result= edge*edge2;        }

        System.out.println("The rectangle area is: " + result);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Choose the operation: ");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectArea();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
        }

    }while (select!=0);
}
}