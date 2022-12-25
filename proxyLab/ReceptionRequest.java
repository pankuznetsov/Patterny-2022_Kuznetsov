package proxyLab;

public class ReceptionRequest implements StorageRequest {

    @Override
    public Product doRequest(String name, int price) {
        startRequest();
        Product product = new Product(price, name);
        endRequest();
        return product;
    }

    private void startRequest() {
        System.out.println("Starting request");
    }

    private void endRequest() {
        System.out.println("End request");
    }
}
