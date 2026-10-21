
public class Sale {
    int saleId;
    String customerName;
    String productName;
    double price;
    double discountRate;

    public Sale(int saleId, String customerName, String productName, double price, double discountRate) {
        this.saleId = saleId;
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
        this.discountRate = discountRate;
    }

    public int getId() {
        return saleId;
    }

    public String getCustomer() {
        return customerName;
    }

    public String getProduct() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discountRate;
    }

    public double calculateFinalPrice() {
        return price - (price * discountRate);
    }
}