//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sogutucu;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        KullaniciRepositaryPostgreSQL user = new KullaniciRepositaryPostgreSQL();
        Scanner input = new Scanner(System.in);
        AgArayüzü menümüz = new AgArayüzü();
        System.out.print("Kullanıcı Adı: ");
        String username = input.nextLine();
        System.out.print("Şifre: ");
        String password = input.nextLine();
        if (user.kullanıcıGiris(username, password)) {
            System.out.println("doğru giriş");
            System.out.println(" ");
            menümüz.menu();
        } else {
            System.out.println("yanlış şifre");
        }

    }
}
