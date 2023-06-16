import java.util.Objects;

public class Product implements Goods {  //"SOLID-S"
    protected int id;
    protected String name;
    protected double price;
    protected String manufacturer;

    public Product(int id, String name, double price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name + "(" + manufacturer + ") - " + price + " руб.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        Product o = (Product) obj;
        return id == o.getId();
    }
}
