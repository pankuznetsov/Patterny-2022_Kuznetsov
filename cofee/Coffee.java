package cofee;

public class Coffee {
    public boolean haveMilk;
    boolean isCold;
    CoffeeType type;

    public Coffee() {
        this.haveMilk = false;
        this.isCold = false;
        this.type = CoffeeType.CLASSIC;
    }

    public Coffee(boolean haveMilk, boolean isCold, CoffeeType type) {
        this.haveMilk = haveMilk;
        this.isCold = isCold;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "haveMilk=" + haveMilk +
                ", isCold=" + isCold +
                ", type=" + type +
                '}';
    }
}

