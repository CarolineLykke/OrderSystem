public class Main {
    public static void main(String[] args) {

        Kurv minKurv = new Kurv();
        Order order= new Order();


        // Tilføj varer til kurven
        minKurv.chooseproducts();



        // Vis indholdet af kurven
        minKurv.visVarer();
        order.CustomerInfo();
        order.Ordernumber();
        order.cancelOrder();






    }

}
