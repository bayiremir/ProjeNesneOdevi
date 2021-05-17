//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sogutucu;

public class KullanıcıMesaj implements IObserver {
    private Observable observable;

    public KullanıcıMesaj() {
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    public void notify(String message) {
        System.out.println(message + " Soğutucuyu açıp açıp kapamayın!! O kadar sağlam deeeell ! ");
    }

    public void removeObserver() {
        this.observable.removeObserver(this);
    }
}
