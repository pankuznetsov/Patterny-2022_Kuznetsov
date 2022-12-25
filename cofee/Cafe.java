package cofee;

public abstract class Cafe {
    protected Coffee coffee;

    public final void doOrder(Coffee coffee) {
        setCoffee(coffee);
        makeCoffee();
    }

    protected abstract void makeCoffee();

    protected void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }
}

class ConcreteCafe extends Cafe{

    @Override
    protected void makeCoffee() {
        System.out.println("Your coffee " + coffee.toString());
    }
}