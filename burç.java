import java.util.Scanner;
public class burç {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğdunuz ayı giriniz : \n");
        int ay = input.nextInt();
        System.out.println("doğdunuz günü giriniz : \n");
        int gun = input.nextInt();;


        switch (ay) {
            case 1:
                if(gun>=1 && gun<=31) {
                    if (gun<22) {
                        System.out.println("oğlak burcusunuz");
                    } else {
                        System.out.println("kova burcusunuz");

                    }
                } else{
                    System.out.println("geçresiz gün");
                }
                break;
            case 2:
                if(gun>=1 && gun<=29) {
                    if (gun<20) {
                        System.out.println("kova burcusunuz");
                    } else {
                        System.out.println("balık burcusunuz");

                    }
                } else{
                    System.out.println("geçersiz gün");
                }
                break;
            case 3:
                if(gun>=1 && gun<=31) {
                    if (gun<22) {
                        System.out.println("balık burcusunuz");
                    } else {
                        System.out.println("koç burcusunuz");

                    }
                } else {
                    System.out.println("geçersiz gün" );
                }
                break;
            case 4:
                if(gun>=1 && gun<=30) {
                    if (gun<20) {
                        System.out.println("koç burcusunuz");
                    } else {
                        System.out.println("boğa burcusunuz");

                    }

                } else {
                    System.out.println("geçresiz gün");
                }
                break;
            case 5:
                if(gun>=1 && gun<=30) {
                    if (gun<21) {
                        System.out.println("boğa burcusunuz");
                    } else {
                        System.out.println("ikizler burcusunuz");

                    }

                } else {
                    System.out.println("geçersiz gün");
                }
                break;
            case 6:
                if(gun>=1 && gun<=31) {
                    if (gun<22) {
                        System.out.println("ikizler burcusunuz");
                    } else {
                        System.out.println("yengeç burcusunuz");

                    }
                } else {
                    System.out.println("geçersiz gün");
                }
                break;
            case 7:
                if(gun>=1 && gun<=31) {
                    if (gun<22) {
                        System.out.println("yengeç burcusunuz");
                    } else {
                        System.out.println("aslan burcusunuz");

                    }
                } else {
                    System.out.println("geçersiz gün");
                }
                break;
            case 8:
                if(gun>=1 && gun<=31) {
                    if (gun<22) {
                        System.out.println("aslan burcusunuz");
                    } else {
                        System.out.println("başak burcusunuz");

                    }
                } else {
                    System.out.println("geçersiz gün");
                }
                break;
            case 9:
                if(gun>=1 && gun<=30) {
                    if (gun<23) {
                        System.out.println("başak burcusunuz");
                    } else {
                        System.out.println("terazi burcusunuz");

                    }
                } else {
                    System.out.println("geçersiz gün");
                }
                break;
            case 10:
                if(gun>=1 && gun<=31) {
                    if (gun<22) {
                        System.out.println("terazi burcusunuz");
                    } else {
                        System.out.println("akrep burcusunuz");

                    }
                } else {
                    System.out.println("geçersiz gün");
                }
                break;
            case 11:
                if(gun>=1 && gun<=30) {
                    if (gun<21) {
                        System.out.println("akrep burcusunuz");
                    } else {
                        System.out.println("yay burcusunuz");

                    }
                } else {
                    System.out.println("geçersiz gün");
                }
                break;
            case 12:
                if(gun>=1 && gun<=31) {
                    if (gun<21) {
                        System.out.println("yay burcusunuz");
                    } else {
                        System.out.println("oğlak burcusunuz");

                    }
                } else {
                    System.out.println("geçersiz gün");
                }
                break;

        }
    }
}