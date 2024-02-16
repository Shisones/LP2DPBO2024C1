package Java;

public class Shirt extends Clothing {
    protected String color;
    protected char sleeve_type;

    public Shirt() {
        this.id_product = "n/a";
        this.name = "n/a";
        this.brand = "n/a";
        this.price = -1;
 
        this.size = "n/a";
        this.material = "n/a";
        this.gender = '-';

        this.color = "n/a";
        this.sleeve_type = '-';
    }
    
    public Shirt(
        String id_product, String name, String brand, int price,
        String size, String material, char gender,
        String color, char sleeve_type
    ) {
        this.id_product = id_product;
        this.name = name;
        this.brand = brand;
        this.price = price;
 
        this.size = size;
        this.material = material;
        this.gender = gender;

        this.color = color;
        this.sleeve_type = sleeve_type;
    }
     
    
}
