public class Main {
    public static void main(String[] args) {

        Kurv minKurv = new Kurv();
        Order order= new Order();


        // Tilføj varer til kurven
        minKurv.tilfojVare("Vare 1");
        minKurv.tilfojVare("Vare 2");
        minKurv.tilfojVare("Vare 3");
        minKurv.fjernVare("Vare 2");

        // Vis indholdet af kurven
        minKurv.visVarer();
        order.CustomerInfo();
        order.Ordernumber();
        order.cancelOrder();






    }

}
