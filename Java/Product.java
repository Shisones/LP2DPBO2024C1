package Java; // Java package for compilation

// Product Class
public class Product {
    /* Attributes */
    protected String id; // Product ID
    protected String name; // Product Name
    protected String brand; // Product Brand
    protected int price; // Product Price
    
    /* Constructors */

    // Empty Constructor
    public Product() {
        this.id = "n/a";
        this.name = "n/a";
        this.brand = "n/a";
        this.price = -1;
    }
    // Non-Empty Constructor
    public Product(String id, String name, String brand, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    /* Get Methods */ 
    public String getID() { return this.id; }
    public String getName() { return this.name; }
    public String getBrand() { return this.brand; }
    public int getPrice() { return this.price; }

    /* Set Methods */ 
    public void setID(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setPrice(int price) { this.price = price; }

}
