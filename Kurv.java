import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kurv {
    private List<Item> itemList;

    public Kurv() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public void showDrinks(){
        //System.out.println("Drinks in your cart");
        for (Item item : itemList) {
            System.out.println(item);
        }

    }

    public List<Item> getItems(){
        return itemList;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }
}