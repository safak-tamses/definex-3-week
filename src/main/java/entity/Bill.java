package entity;

public class Bill {
    int customer_id;
    double price=0;
    RegisteredDate registered_date;

    public Bill(int customer_id, double price, RegisteredDate registered_date) {
        this.customer_id = customer_id;
        this.price = price;
        this.registered_date = registered_date;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer_id=" + customer_id +
                ", price=" + price +
                ", registered_date=" + registered_date +
                '}';
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RegisteredDate getRegistered_date() {
        return registered_date;
    }

    public void setRegistered_date(RegisteredDate registered_date) {
        this.registered_date = registered_date;
    }
}
