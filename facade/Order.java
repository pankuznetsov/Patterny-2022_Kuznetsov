package facade;

public class Order {
    private String name;
    private int volume;
    OperationType operationType;

    public Order(String name, int volume, OperationType operationType) {
        this.name = name;
        this.volume = volume;
        this.operationType = operationType;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public OperationType getOperationType() {
        return operationType;
    }
}
