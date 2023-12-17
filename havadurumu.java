import java.util.Scanner;
public class havadurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sıcaklığı giriniz: \n");

        int heat = input.nextInt();
        if (heat <5){
            System.out.println("kayak yapmalısın.");

        } else if (heat >= 100) {
            System.out.println("Allah rahmet eylesin");
        }
        else if (heat<=25) {
            if (heat <= 15) {
                System.out.println("sinemeya git");

            }
            if (heat >= 10) {
                System.out.println("pikniğe gidebilirsin");
            }

        } else {
            System.out.println("yüzmeye git");
        }
    }
}
