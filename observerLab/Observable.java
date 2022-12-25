package observerLab;

import java.util.ArrayList;
import java.util.List;

public interface Observable {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}

class TaxiObservable implements Observable {

    private List<Observer> taxi = new ArrayList<>();
    private String initialCoordinates;

    public void setInitialCoordinates(String coordinates) {
        this.initialCoordinates = coordinates;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        taxi.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        taxi.remove(o);
    }

    @Override
    public void notifyObservers() {
        taxi.forEach(o -> o.update(initialCoordinates));
    }
}
