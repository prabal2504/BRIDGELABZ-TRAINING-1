class Order {
    protected int orderId;
    protected double baseAmount;
    protected static double deliveryCharge = 40;

    public Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    public double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order {

    public RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}


class PremiumOrder extends Order {

    public PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        double discount = baseAmount * 0.20;
        return (baseAmount - discount) + deliveryCharge;
    }
}


public class Main {
    public static void main(String[] args) {


        Order o1 = new RegularOrder(1, 500);
        Order o2 = new PremiumOrder(2, 500);

        System.out.println("Regular Order Bill: " + o1.calculateBill());
        System.out.println("Premium Order Bill: " + o2.calculateBill());
    }
}