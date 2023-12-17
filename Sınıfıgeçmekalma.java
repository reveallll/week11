import java.util.Scanner;
public class Sınıfıgeçmekalma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("mat notunuzu giriniz : ");
        int mat = input.nextInt();
        System.out.println("türkçe notunuzu giriniz : ");
        int tur = input.nextInt();
        System.out.println("fiz notunuzu giriniz : ");
        int fiz = input.nextInt();
        System.out.println("kimya notunuzu giriniz : ");
        int kim = input.nextInt();
        System.out.println("müzik notunuzu giriniz :");
        int music = input.nextInt();

        double ortalama = (mat + tur + fiz + kim + music) / 5.0;

        if (ortalama < 55) {
            System.out.println("kaldın");
        }
        else {
            System.out.println("geçtin");
        }





    }
}
