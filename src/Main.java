public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Milk", "111", 5000);
        Product p2 = new Product("Bread", "222", 3000);

        Employee emp = new Employee("Bat");
        Customer cus = new Customer("Saraa", "UB", "99112233");

        DiscountCard card = new DiscountCard("A1", 10);

        SalesOrder order = new SalesOrder(emp, cus, card);

        order.addLine(new SOLine(p1, 2));
        order.addLine(new SOLine(p2, 1));

        order.printReceipt();
    }
}