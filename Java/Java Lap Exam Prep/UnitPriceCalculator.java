import java.util.Scanner;

public class UnitPriceCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // grams weights
        System.out.println("Enter weight in grams: ");
        int grams = sc.nextInt();

        //price per KG
        System.out.println("Enter price per kg: ");
        double priceperKg = sc.nextDouble();

        double kilograms = ((double)grams / 1000);
        double totalCost = kilograms * priceperKg;

        char category = totalCost > 500 ? 'A' : 'B';

        System.out.printf("Weight: %.3f kg%n", kilograms);
        System.out.printf("Total Cost: %.2f%n", totalCost);
        System.out.println("Category: " + category);
    }
}