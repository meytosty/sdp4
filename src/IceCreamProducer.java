import java.util.ArrayList;
import java.util.List;

public class IceCreamProducer {
    private List<IceCreamObserver> observers = new ArrayList<>();

    public void addObserver(IceCreamObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IceCreamObserver observer) {
        observers.remove(observer);
    }

    public void produceIceCream(String flavor) {
        System.out.println("Producing a new batch of " + flavor + " ice cream...");
        notifyObservers(flavor);
    }

    private void notifyObservers(String flavor) {
        for (IceCreamObserver observer : observers) {
            observer.update(flavor);
        }
    }
}
