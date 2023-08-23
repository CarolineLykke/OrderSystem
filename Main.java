public class Main {
    public static void main(String[] args) {

        Kurv cart = new Kurv();
        Order order = new Order();


        Item drikkelse1 = new Item("Caffelatte", 20.0);
        Item drikkelse2 = new Item("Americano", 15.0);
        Item drikkelse3 = new Item("Vand", 10.0);

        cart.addItem(drikkelse1);
        cart.addItem(drikkelse2);
        cart.addItem(drikkelse3);

        System.out.println("What is in tour bascket: ");

     cart.showDrinks();
        System.out.println("Total price: " + cart.getTotalPrice());

        /*cart.removeItem(banana);

        System.out.println("Total price after removing Banana: " + cart.getTotalPrice());*/

        order.CustomerInfo();
        order.Ordernumber();
        order.cancelOrder();
    }

}
