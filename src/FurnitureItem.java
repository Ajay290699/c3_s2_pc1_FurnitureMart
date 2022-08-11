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
        System.out.println("Enter furniture code");
        furnitureCode = sc.nextInt();
        System.out.println("Enter furniture type (stool, chair, cupboard, table) :");
        sc.nextLine();
        furnitureType = sc.nextLine();
        System.out.println("Enter furniture grade 1, 2, 3 :");
        gradeOfFurniture = sc.nextLine();
        System.out.println("Enter furniture color (red, green, blue) :");
        color = sc.nextLine();
        System.out.println("Enter furniture type (outdoor/indoor) :");
        furnitureUsage = sc.nextLine();
        System.out.println("Enter price :");
        price = sc.nextDouble();
    }

    public double calculateDiscount(double discountPercentage) {
        if (furnitureUsage.equalsIgnoreCase("outdoor")) {
            double discountedPrice = price - (price * discountPercentage / 100);
            return discountedPrice;
        } else {
            return price;
        }

    }
}
