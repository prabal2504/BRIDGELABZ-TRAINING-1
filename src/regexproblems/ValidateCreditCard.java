package regexproblems;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String card = "4123456789012345";

        String regex = "^(4|5)[0-9]{15}$";

        if (card.matches(regex)) {
            System.out.println("Valid Credit Card");
        } else {
            System.out.println("Invalid Credit Card");
        }
    }
}