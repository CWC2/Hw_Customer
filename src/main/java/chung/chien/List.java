package chung.chien;

public class List {
    public static void main(String[] args) {
        Customer cus1 = new Customer("0013",490,0,490);
        Customer cus2 = new Customer("0052",1000,100,900);
        Customer cus3 = new Customer("0081",290,0,290);
        Customer cus4 = new Customer("2122",2000,200,1800);

        cus1.print();
        cus2.print();
        cus3.print();
        cus4.print();

    }
}
