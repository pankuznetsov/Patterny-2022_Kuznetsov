package observerLab;

public class TaxiObserver implements Observer {

    @Override
    public void update(String coordinates) {
        System.out.println("My coordinates are " + coordinates);
    }
}
