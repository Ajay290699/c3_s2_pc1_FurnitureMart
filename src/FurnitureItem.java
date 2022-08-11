public class FurnitureItem {

    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem() {
        furnitureCode = 0;
        furnitureType = "";
        gradeOfFurniture = "";
        color = "";
        furnitureUsage = "";
        price = 0;
    }

    public double calculateDiscount() {
        if (furnitureUsage.equals("outdoor")) {
            double discountedPrice = price - (price * 5 / 100);
            return discountedPrice;
        } else {
            return price;
        }

    }
}
