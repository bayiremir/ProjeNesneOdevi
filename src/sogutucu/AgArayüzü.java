//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sogutucu;

import java.util.Scanner;

public class AgArayüzü {
    public AgArayüzü() {
    }

    public void menu() {
        KullanıcıMesaj kullanıcıM = new KullanıcıMesaj();
        NoticeObservable noticeObservable = new NoticeObservable();
        kullanıcıM.setObservable(noticeObservable);
        noticeObservable.addObserver(kullanıcıM);
        noticeObservable.notifyObserver();
        kullanıcıM.removeObserver();
        noticeObservable.notifyObserver();
        System.out.println("|   MENU SELECTION DEMO           |");
        System.out.println("| Options:                        |");
        System.out.println("|        1. Sıcaklığı Kontrol ET  |");
        System.out.println("|        2. Soğutucu Aç           |");
        System.out.println("|        3. Soğutucu Kapat        |");

        while(true) {
            while(true) {
                Scanner scan = new Scanner(System.in);
                int secim = scan.nextInt();
                switch(secim) {
                    case 1:
                        SıcaklıkAlgılayıcı z = SıcaklıkAlgılayıcı.GetInstance();
                        z.SıcaklıkOku();
                        System.out.println(" ");
                        break;
                    case 2:
                        Eyleyici x = new Eyleyici();
                        x.sogutucuAc();
                        System.out.println(" ");
                        break;
                    case 3:
                        Eyleyici y = new Eyleyici();
                        y.sogutucuKapa();
                        break;
                    default:
                        System.out.println("Var olan işlemleri seçin !!");
                        System.out.println(" ");
                }
            }
        }
    }
}
