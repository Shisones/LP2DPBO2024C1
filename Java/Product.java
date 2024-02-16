package Java;

public class Product {
    protected String id_product;
    protected String name;
    protected String brand;
    protected int price;

    public Product() {
        this.id_product = "n/a";
        this.name = "n/a";
        this.brand = "n/a";
        this.price = -1;
    }

    public Product(String id_product, String name, String brand, int price) {
        this.id_product = id_product;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
}
