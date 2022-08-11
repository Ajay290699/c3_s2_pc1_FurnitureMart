import java.util.Scanner;

public class FurnitureItem {

    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem() {
        Scanner sc = new Scanner(System.in);
        furnitureCode = 0;
        furnitureType = "plastic";
        gradeOfFurniture = "grade";
        color = "red";
        furnitureUsage = "outdoor";
        System.out.println("Enter price");
        price = sc.nextDouble();
    }

    public double calculateDiscount(double discountPercentage) {
        if (furnitureUsage.equals("outdoor")) {
            double discountedPrice = price - (price * discountPercentage / 100);
            return discountedPrice;
        } else {
            return price;
        }

    }
}
