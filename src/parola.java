import java.util.Scanner;
public class parola {
    public static void main(String[] args) {

    String username,password;
    Scanner inp= new Scanner(System.in);

    System.out.print("Kullanıcı adınızı giriniz : ");
    username= inp.nextLine();

    System.out.print("Şifrenizi giriniz : ");
    password= inp.nextLine();

        if (username.equals("yusuftalha") && password.equals("talha"));{
        System.out.print("Yanlış giriş yaptınız !");
    } else {
    System.out.print("Kullanıcı adı veya şifreyi yanlış girdiniz");
        }
    }
}
