import java.util.Scanner;

public class FurnitureItemImpl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FurnitureItem f1Item = new FurnitureItem();

        System.out.println("Enter furniture code");
        f1Item.furnitureCode = sc.nextInt();
        System.out.println("Enter furniture type (stool, chair, cupboard, table) :");
        sc.nextLine();
        f1Item.furnitureType = sc.nextLine();
        System.out.println("Enter furniture grade 1, 2, 3 :");
        f1Item.gradeOfFurniture = sc.nextLine();
        System.out.println("Enter furniture color (red, green, blue) :");
        f1Item.color = sc.nextLine();
        System.out.println("Enter furniture type (outdoor/indoor) :");
        f1Item.furnitureUsage = sc.nextLine();
        System.out.println("Enter price :");
        f1Item.price = sc.nextDouble();


        System.out.println("Furniture code :" + f1Item.furnitureCode);
        System.out.println("Furniture type :" + f1Item.furnitureType);
        System.out.println("Furniture grade :" + f1Item.gradeOfFurniture);
        System.out.println("Furniture color :" + f1Item.color);
        System.out.println("Furniture Usage :" + f1Item.furnitureUsage);
        System.out.println("Furniture price :" + f1Item.price);
        System.out.println("Dicounted price :" + f1Item.calculateDiscount());
    }
}
