import java.util.Scanner;
public class uçakbileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gideceğiniz mesafe miktarını giriniz");
        int mesafe = input.nextInt();
        System.out.println("yaşınızı giriniz:");
        int yas = input.nextInt();
        System.out.println("gidiş dönüş aldıysanız 2 aksi halde 1 yazızız.");
        int gidisdonus = input.nextInt();

        switch(gidisdonus) {
            case 1:
                if (yas<12) {
                    double tutar = (mesafe*0.10) * 0.5;
                    System.out.println("tutar: "+tutar);
                } else if (yas >=12 && yas<=24) {
                    double tutar = (mesafe * 0.10) * 0.9;
                    System.out.println("tutar : "+tutar);
                } else{
                    double tutar = (mesafe*0.10);
                    System.out.println("tutar: "+ tutar);
                }
                break;
            case 2:
                if (yas<12) {
                    double tutar = ((mesafe*0.10) * 0.5) * 0.8;
                    System.out.println("tutar: "+tutar);
                } else if (yas >=12 && yas<=24) {
                    double tutar = (((mesafe * 0.10) * 0.9) * 0.8);
                    System.out.println("tutar : "+tutar);
                } else{
                    double tutar = (mesafe*0.10) * 0.8;
                    System.out.println("tutar: "+tutar);
                }
                break;
            default:
                System.out.println("yanlış değer gridiniz");

        }
    }
}
