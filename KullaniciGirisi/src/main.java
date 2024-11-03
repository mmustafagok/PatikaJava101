import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        String userName, password, newPassword, select;


        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.print("Sifreniz: ");
        password = inp.nextLine();

        if (userName.equals("Mustafa") && password.equals("1903")){
            System.out.println("Giriş yapıldı!");
        }else{
            System.out.println("Bilgileriniz yanlış! Şifrenizi sıfırlamak ister misiniz? Yes/No");
            select = inp.nextLine();

            switch (select){
                case "Yes":
                    System.out.println("Yeni şifreyi giriniz: ");
                    newPassword = inp.nextLine();
                    if (newPassword.equals("1903")){
                        System.out.println("Eski şifrenizle aynı olamaz");
                    }else{
                        System.out.println("Şifre başarıyla değiştirildi");
                    }
                    break;
                case "No":
                    System.out.println("İyi günler");
                    break;
                default:
                    System.out.println("Geçersiz");
            }

        }

    }

}
