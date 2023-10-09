import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tcNo, password;
        int hak=3, balanced = 1500, islem, yatirilanMiktar, cekilenMiktar;
        while (hak > 0){
            Scanner giris=new Scanner(System.in);
            System.out.print("Tc Kimlik numaranızı giriniz: ");
            tcNo=giris.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password=giris.nextLine();
            if(tcNo.equals("123456789") && password.equals("1234")){
                System.out.println("Bilgileriniz Doğru! Başarıyla Giriş Yaptınız!");
                do {
                    System.out.println("1- Bakiye Görüntüle\n" +
                            "2- Para Yatır\n"+
                            "3- Para Çek\n"+
                            "4- Çıkış\n");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    islem=giris.nextInt();
                    if(islem==1){
                        System.out.println("\nBakiyeniz: "+balanced);
                    } else if (islem==2) {
                        System.out.print("Kaç para yatırmak istiyorsunuz ? Miktarı Giriniz: ");
                        yatirilanMiktar=giris.nextInt();
                        balanced+=yatirilanMiktar;
                        System.out.print(yatirilanMiktar+" Tl ile beraber yatırdınız. Hesabınızda "+balanced+" Tl vardır.");
                    } else if (islem==3) {
                        System.out.print("Kaç Para çekmek istiyorsunuz? Çekmek istediğiniz miktarı yazınız: ");
                        cekilenMiktar= giris.nextInt();
                        balanced-=cekilenMiktar;
                        System.out.println("Hesabınızdan "+cekilenMiktar+" Tl çektiniz. Hesabınızda Kalan Miktar: "+balanced);
                    } else if (islem==4) {
                        System.out.println("Çıkış Yapılıyor. İyi Günler!");
                        break;
                    }
                }while(islem!=4);
                break;
            }
            else {
                hak--;
                System.out.println("Yanlış girdiniz. Tekrar Deneyin. Kalan Hakkınız: "+hak);
                if(hak==0){
                    System.out.print("Hesabınız bloke olmuştur!");
                }
            }
        }
    }
}