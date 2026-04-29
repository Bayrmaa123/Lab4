public class DiscountCard {

    private String code;
    private double percent;

    public DiscountCard(String code, double percent){
        this.code = code;
        this.percent = percent;
    }

    public double getPercent(){
        return percent;
    }
}