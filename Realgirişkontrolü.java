import java.util.Scanner;
public class Realgirişkontrolü {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("kullanıcı adınızı giriniz :");
        String a = input.nextLine();
        System.out.println("şifrenizi giriniz : ");
        String b = input.nextLine();

        if (a.equals("patika") && b.equals("java123")) {
            System.out.println("Giriş yapıldı.");

        }
        else {
            System.out.println("hatalı kullanıcı adı veya şifre.");
        }





    }
}
