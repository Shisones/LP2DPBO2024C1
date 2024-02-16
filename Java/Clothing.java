package Java;

public class Clothing extends Product {
    protected String size;
    protected String material;
    protected char gender;

    public Clothing () {
        this.id_product = "n/a";
        this.name = "n/a";
        this.brand = "n/a";
        this.price = -1;

        this.size = "n/a";
        this.material = "n/a";
        this.gender = '-';
    }

    public Clothing (
        String id_product, String name, String brand, int price,
        String size, String material, char gender
    ) {
        this.id_product = id_product;
        this.name = name;
        this.brand = brand;
        this.price = price;

        this.size = size;
        this.material = material;
        this.gender = gender;
    }

}
