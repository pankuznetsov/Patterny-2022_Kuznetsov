package facade;

import java.util.HashMap;

public class MarketProvider {
    private HashMap<String, Integer> prices = new HashMap();

    public void setPrices(HashMap<String, Integer> prices) {
        this.prices = prices;
    }

    public Integer getPrice(String name) {
        return prices.get(name);
    }

    public HashMap<String, Integer> onMarketUpdate() {
        return prices;
    }
}
