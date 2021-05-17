//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sogutucu;

import java.util.Random;

public class SıcaklıkAlgılayıcı {
    Random rnd = new Random();
    int uretilenSıcaklik;
    int varOlanS;
    int uretS;
    private static SıcaklıkAlgılayıcı _instance;

    private SıcaklıkAlgılayıcı() {
    }

    //singleton deseni
    public static SıcaklıkAlgılayıcı GetInstance() {
        if (_instance == null) {
            _instance = new SıcaklıkAlgılayıcı();
        }

        return _instance;
    }

    public int sicaklikUret() {
        this.varOlanS = this.rnd.nextInt(35);
        return this.varOlanS;
    }

    public int SıcaklıkOku() {
        this.varOlanS = this.sicaklikUret();
        System.out.println("Ortamın sıcaklığı  : " + this.varOlanS);
        return this.varOlanS;
    }

    public int sicaklikGonder() {
        this.uretilenSıcaklik = this.rnd.nextInt(35);
        if (this.varOlanS > this.uretilenSıcaklik) {
            System.out.println("Soğutucunun ısısı : " + this.uretilenSıcaklik);
            System.out.println("Var olan sıcaklık: " + this.varOlanS);
            System.out.println("Ortam soğutuluyor.");
        } else {
            System.out.println("Soğutucunun ısısı : " + this.uretilenSıcaklik);
            System.out.println("Var olan sıcaklık : " + this.varOlanS);
            System.out.println("Ortam ısıtılıyor.");
        }

        return this.uretilenSıcaklik;
    }
}
