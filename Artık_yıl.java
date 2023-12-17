import java.util.Scanner;
public class Artık_yıl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir yıl giriniz:");
        int yıl = input.nextInt();
        if ( ((yıl%4==0) && (yıl%100 != 0)) || (yıl%400==0)) {
            System.out.println("bu bir artık yıl");
        } else {
            System.out.println("artık yıl değil");
        }

    }

}
