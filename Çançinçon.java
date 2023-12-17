import java.util.Scanner;
public class Çançinçon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğum yılınızı giriniz: ");
        int dogum = input.nextInt();
        int hesap = (dogum%12);
        switch (hesap) {
            case 0:
                System.out.println("zodyağınız maymun");
                break;
            case 1:
                System.out.println("zodyağınız horoz");
                break;
            case 2:
                System.out.println("zodyağınız köpek");
                break;
            case 3:
                System.out.println("zodyağınız domuz");
                break;
            case 4:
                System.out.println("zodyağınız fare");
                break;
            case 5:
                System.out.println("zodyağınız öküz");
                break;
            case 6:
                System.out.println("zodyağınız kaplan");
                break;
            case 7:
                System.out.println("zodyağınız tavşan");
                break;
            case 8:
                System.out.println("zodyağınız ejderha");
                break;
            case 9:
                System.out.println("zodyağınız yılan");
                break;
            case 10:
                System.out.println("zodyağınız at");
                break;
            case 11:
                System.out.println("zodyağınız koyun");
                break;

        }

    }
}

