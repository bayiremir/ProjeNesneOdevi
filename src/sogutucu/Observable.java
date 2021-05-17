//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sogutucu;

public interface Observable {
    void addObserver(IObserver var1);  //Kullancıları duyuruya eklemek için

    void removeObserver(IObserver var1);

    void notifyObserver();   // Duyuru ya kayıtlı kullanıcılara mesaj göndermek için
}
