package facade;

public class TradingRobot {
    private TradingProvider tradingProvider = new TradingProvider();
    private MarketProvider marketProvider = new MarketProvider();

    public void order(Order order) {
        tradingProvider.sendOrder(
                order.getName(),
                marketProvider.getPrice(order.getName()),
                order.getVolume(),
                OperationType.BUY
        );
    }
}
