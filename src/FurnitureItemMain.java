public class FurnitureItemMain {

    public static void main(String[] args) {

        FurnitureItem fItem = new FurnitureItem();
        System.out.println("Furniture code :" + fItem.furnitureCode);
        System.out.println("Furniture type :" + fItem.furnitureType);
        System.out.println("Furniture grade :" + fItem.gradeOfFurniture);
        System.out.println("Furniture color :" + fItem.color);
        System.out.println("Furniture Usage :" + fItem.furnitureUsage);
        System.out.println("Furniture price :" + fItem.price);
        System.out.println("Dicounted price :" + fItem.calculateDiscount(5));
    }
}
