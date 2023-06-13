import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double cost, vatCoeff = 0.0, vatCost, costWVat;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost");
        cost = input.nextDouble();
        if(cost > 0 && cost < 1000)
        {
            vatCoeff = 0.18;
        }
        else if(cost > 1000)
        {
            vatCoeff = 0.08;
        }
        vatCost = cost * vatCoeff;
        costWVat = cost + vatCost;
        System.out.println("Cost without VAT: " + cost);
        System.out.println("VAT Coefficient: " + vatCoeff);
        System.out.println("VAT Cost: " + vatCost);
        System.out.println("Cost with added VAT: " + costWVat);
    }
}
