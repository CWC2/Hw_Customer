package chung.chien;

public class Customer {
    String id;
    int cost;
    int discount;
    int total;

    public Customer(String id, int cost, int discount, int total) {
        this.id = id;
        this.cost = cost;
        this.discount = discount;
        this.total = total;
    }

    public void print() {
        System.out.println("Customer{" +
                "id='" + id + '\'' +
                ", cost=" + cost +
                ", discount=" + discount +
                ", total=" + total +
                '}');
    }
}
