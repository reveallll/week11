import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please wirte first number: \n");
        int a = input.nextInt();
        System.out.println("please write second number : \n");
        int b = input.nextInt();

        System.out.println("1 - Toplama \n 2 - çıkarma \n 3 - çarpma \n 4 - bölme \n");
        System.out.println("lütfen yapmak istediğiniz işlemin numarasını giriniz.");
        int c = input.nextInt();

        if (c == 1) {
            System.out.println("Toplama sonucu: "+ (a+b));


        } else if (c == 2) {
            System.out.println("Çıkarma sonucu : " + (a-b));



        } else if (c == 3) {

            System.out.println("çarpma sonucu : "+ (a*b));

        } else if (c == 4) {
            if (b != 0 ) {
                System.out.println("bölme sonucu : " + (a/b));
            } else {
                System.out.println("bir sayı 0 a bölünemez!");

            }

        } else {
            System.out.println("bu işlem tanımlı değildir.");
        }


        }
    }
