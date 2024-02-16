package Java; // Java package for compilation

// Clothing class that extends the Product class
public class Clothing extends Product {
    /* Attributes */
    protected String size; // Clothing size
    protected String material; // Clothing material
    protected char gender; // Clothing gender
    
    /* Constructors */ 

    // Empty Constructor
    public Clothing() {
        this.id = "n/a";
        this.name = "n/a";
        this.brand = "n/a";
        this.price = -1;

        this.size = "n/a";
        this.material = "n/a";
        this.gender = '-';
    }
    // Non-Empty Constructor
    public Clothing (
        String id, String name, String brand, int price,
        String size, String material, char gender
    ) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;

        this.size = size;
        this.material = material;
        this.gender = gender;
    }
    
    /* Get Methods */ 
    public String getSize() { return this.size; }
    public String getMaterial() { return this.material; }
    public char getGender() { return this.gender; }

    /* Set Methods */ 
    public void setSize(String size) { this.size = size; }
    public void setMaterial(String material) { this.material = material; }
    public void setGender(char gender) { this.gender = gender; }
}
