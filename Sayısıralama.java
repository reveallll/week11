import java.util.Scanner;
public class Sayısıralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sırayla 3 sayı giriniz. (her bir sayıyı girdikten sonra 'enter' a basınız.");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ( (a>b) && (a>c)) {
            if (b > c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        } else if ((b>a) && (b>c)) {
            if (a>c) {
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>a");
            }
        } else if ((c>a) && (c>b)) {
            if (a>b) {
                System.out.println("c>a>b");
            } else {
                System.out.println("c>b>a");
            }
        }
    }
}