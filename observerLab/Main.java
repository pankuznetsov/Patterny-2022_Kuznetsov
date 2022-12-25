package observerLab;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        TaxiObservable taxiObservable = new TaxiObservable();
        taxiObservable.registerObserver(new TaxiObserver());
        Timer timer = new Timer();
        timer.schedule(new GenerateNewCoordinates(1, 2, taxiObservable), 0, 1000);
    }
}
