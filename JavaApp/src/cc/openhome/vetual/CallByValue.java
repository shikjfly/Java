package cc.openhome.vetual;

public class CallByValue {
    public static void main(String[] args) {
        Customer c1 = new Customer("Justing");
        System.out.println(c1.name);
        some(c1);
        System.out.println(c1.name);
    }
    static void some(Customer c) {
//        c.name = "XXOO";
        c = new Customer("SSSSSSSSSSSSS");
    }
}
class Customer{
    String name;
    Customer(String name) {
        this.name = name;
    }        
}