public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "" +
                "Drink : " + name +
                ", the price : " + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
