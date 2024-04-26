import java.util.Scanner;
public class Chap3_exer_312 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sku for your new poduct: ");
        String itemSku = input.nextLine();
        System.out.println("Please enter the description for your new poduct: ");
        String itemDesc = input.nextLine();
        System.out.println("Please enter the quantity for your new poduct: ");
        int itemQuantity = input.nextInt();
        System.out.println("Please enter the price of your new poduct: ");
        double itemPrice = input.nextDouble();
        input.close();

        Invoice newItem = new Invoice(itemSku, itemDesc, itemQuantity, itemPrice);

        System.out.printf("Total cost of item is: %.2f", newItem.getInvoiceAmount());

    }
}
