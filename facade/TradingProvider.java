package facade;

import java.util.HashMap;

enum OperationType {
    SELL,
    BUY
}

public class TradingProvider {
    private int id = 0;
    HashMap<Integer, Order> depthOfMarket = new HashMap<>();
    private int balance = 0;

    //После покупки цена на акцию растет, а после продажи падает
    int sendOrder(
            String name,
            int price,
            int volume,
            OperationType operationType
    ) {
        id++;
        depthOfMarket.put(id, new Order(name, price, volume, operationType));
        return id;
    }

    void cancelOrder(int id) {
        depthOfMarket.remove(id);
    }
}
