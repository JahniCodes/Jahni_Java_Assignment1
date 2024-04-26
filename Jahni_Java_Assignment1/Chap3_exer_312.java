public class Chap3_exer_312 {
    /*Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
     An Invoice should include four pieces of information as instance variables—a part number (type String),
      a part description (type String), a quantity of the item being purchased (type int) and a price per item (double).
      Your class should have a constructor that initializes the four instance variables.
      Provide a set and a get method for each instance variable.
      In addition, provide a method named getInvoiceAmount that calculates the invoice amount
      (i.e., multiplies the quantity by the price per item), then returns the amount as a double value.
      If the quantity is not positive, it should be set to 0.
      If the price per item is not positive, it should be set to 0.0.
      Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities. */

    private String partNumber;
    private String partDesc;
    private int quantity;
    private double price;

    public Chap3_exer_312(String partNumber, String partDesc, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDesc = partDesc;
        this.quantity = quantity;
        this.price = price;
    }

    //GETTERS
    public String getPartNumber() {
        return this.partNumber;
    }

    public String getPartDesc() {
        return this.partDesc;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    //SETTERS
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //METHODS
    public double getInvoiceAmount() {

        double price = this.price;
        int quantity = this.quantity;
        if (this.price <= 0.0) {
            price = 0.0;
        } else if (this.quantity <= 0) {
            quantity = 0;
        }
        double total = price * quantity;
        return total;
    }
}