package observerLab;

import java.util.Random;
import java.util.TimerTask;

public class GenerateNewCoordinates extends TimerTask {
    private int firstCoordinate;
    private int secondCoordinate;

    private TaxiObservable observable;

    private Random random = new Random();

    public GenerateNewCoordinates(int firstCoordinate, int secondCoordinate, TaxiObservable observable) {
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.observable = observable;
    }

    @Override
    public void run() {
        firstCoordinate += random.nextInt(5);
        secondCoordinate += random.nextInt(5);
        observable.setInitialCoordinates(firstCoordinate + " " + secondCoordinate);
        observable.notifyObservers();
    }
}
