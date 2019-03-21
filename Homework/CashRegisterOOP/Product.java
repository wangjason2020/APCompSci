public class Product {

    String name;
    int code;
    boolean isTaxed;
    double price;
    int inventory;
    String type;

    public Product(String newName, int newCode, boolean newTax, double newPrice, int newInventory, String newType) {

        name = newName;
        code = newCode;
        isTaxed = newTax;
        price = newPrice;
        inventory = newInventory;
        type = newType;

        System.out.printf("%d units of %s, are priced at %.2f, is %s, and is in our %s department.\n",inventory,name,price,isTaxed ? "taxable" : "not taxable",type);
    }
}
