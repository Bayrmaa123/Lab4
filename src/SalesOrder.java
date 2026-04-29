import java.util.ArrayList;

public class SalesOrder {

    private ArrayList<SOLine> lines;
    private Employee employee;
    private Customer customer;
    private DiscountCard card;

    public SalesOrder(Employee employee, Customer customer, DiscountCard card){
        this.employee = employee;
        this.customer = customer;
        this.card = card;
        this.lines = new ArrayList<>();
    }

    public void addLine(SOLine line){
        lines.add(line);
    }

    public double getTotal(){
        double sum = 0;

        for(SOLine l : lines){
            sum += l.getSoldTotalPrice();
        }

        return sum;
    }

    public double getDiscount(){
        return getTotal() * card.getPercent() / 100;
    }

    public double getFinalTotal(){
        return getTotal() - getDiscount();
    }

    public void printReceipt(){

        System.out.println("=== RECEIPT ===");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Employee: " + employee.getName());

        for(SOLine l : lines){
            l.printLine();
        }

        System.out.println("----------------");
        System.out.println("Total: " + getTotal());
        System.out.println("Discount: " + getDiscount());
        System.out.println("Final: " + getFinalTotal());
    }
}