public class SOLine {

    private Product product;
    private int quantity;
    private double soldTotalPrice;

    public SOLine(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
        this.soldTotalPrice = product.getPrice() * quantity;
    }

    public double getSoldTotalPrice(){
        return soldTotalPrice;
    }

    public void printLine(){
        System.out.println(
            product.getName() + " x " + quantity + " = " + soldTotalPrice
        );
    }
}