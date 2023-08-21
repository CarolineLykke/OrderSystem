package Kurv;

import java.util.ArrayList;
import java.util.List;

public class Kurv {
    private List<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }
}

