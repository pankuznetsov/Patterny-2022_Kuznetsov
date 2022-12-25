package cofee;

public class Main {
    public static void main(String[] args) {
        ConcreteCafe cafe = new ConcreteCafe();
        cafe.doOrder(new Coffee());
        cafe.doOrder(new Coffee(
                false,
                true,
                CoffeeType.LATTE
        ));
    }
}
