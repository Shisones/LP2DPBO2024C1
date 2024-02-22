package Java; // Java package for compilation

// Shirt class that extends the Clothing class
public class Shirt extends Clothing {
    /* Attributes */ 
    protected String color; // Color of shirt
    protected String sleeve_type; // Sleeve type of shirt
    
    /* Constructors */

    // Empty Constructor
    public Shirt() {
        this.id = "n/a";
        this.name = "n/a";
        this.brand = "n/a";
        this.price = -1;
 
        this.size = "n/a";
        this.material = "n/a";
        this.gender = '-';

        this.color = "n/a";
        this.sleeve_type = "n/a";
    }
    // Non-Empty Constructor
    public Shirt(
    public function setGender($gender) { $this->gender = gender };
        String id, String name, String brand, int price,
        String size, String material, char gender,
        String color, String sleeve_type
    ) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
 
        this.size = size;
        this.material = material;
        this.gender = gender;

        this.color = color;
        this.sleeve_type = sleeve_type;
    }
    
    /* Get Methods */ 
    public String getColor() { return this.color; }
    public String getSleeveType() { return this.sleeve_type; }

    /* Set Methods */ 
    public void setColor(String color) { this.color = color; }
    public void setSleeveType(String sleeve_type) { this.sleeve_type = sleeve_type; }

    
}
