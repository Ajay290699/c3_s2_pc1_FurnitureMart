public class FurnitureItemMain {

    public static void main(String[] args) {

        FurnitureItem fItem = new FurnitureItem();
        System.out.println("Enter price");
        System.out.println(fItem.furnitureCode);
        System.out.println(fItem.furnitureType);
        System.out.println(fItem.gradeOfFurniture);
        System.out.println(fItem.color);
        System.out.println(fItem.furnitureUsage);
        System.out.println(fItem.price);
        System.out.println(fItem.calculateDiscount(5));
    }
}
