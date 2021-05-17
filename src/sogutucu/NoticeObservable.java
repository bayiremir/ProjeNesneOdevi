//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sogutucu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoticeObservable implements Observable {
    private List<IObserver> observerList = new ArrayList();
    private String message = "Notice... !";

    public NoticeObservable() {
    }

    public void addObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    public void removeObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    public void notifyObserver() {
        Iterator var1 = this.observerList.iterator();

        while(var1.hasNext()) {
            IObserver observer = (IObserver)var1.next();
            observer.notify(this.message);
        }

    }
}
