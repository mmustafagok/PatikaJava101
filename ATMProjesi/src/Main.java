import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        int select, price, balance=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();
        System.out.print("Parolanız: ");
        password = inp.nextLine();

        if (userName.equals("admin") && password.equals("123")){
            System.out.println("Bankaya hoşgeldiniz!");

            do {
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("İşleminizi seçiniz: ");
                select = inp.nextInt();

                switch (select){
                    case 1:
                        System.out.print("Yatırılacak para miktarı: ");
                        price= inp.nextInt();
                        balance+=price;
                        break;
                    case 2:
                        System.out.println("Çekilecek para miktarı: ");
                        price= inp.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye yetersiz.");
                        }else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        break;
                    case 4:
                        continue;
                    default:
                        System.out.println("Geçerli seçeneği seçiniz");
                }
            }while (select!=4);
        }
    }
}