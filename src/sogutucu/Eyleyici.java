//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sogutucu;

public class Eyleyici implements IEyleyici {
    public Eyleyici() {
    }

    public void sogutucuAc() {
        System.out.println("Soğutucu açıldı ! ");
        SıcaklıkAlgılayıcı gelenSıc = SıcaklıkAlgılayıcı.GetInstance();
        gelenSıc.sicaklikGonder();
    }

    public void sogutucuKapa() {
        System.out.println("Soğutucu kapatıldı ! ");
        System.out.println(" ");
        System.exit(0);
    }
}
