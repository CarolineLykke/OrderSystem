import java.util.Random;
import java.util.Scanner;

public class Order {

    Scanner scan = new Scanner(System.in);
   Kurv kurv;
    private  String fuldnavn;
    private  String adresse;
    private int tlfnummmer;
    private int orderNumber;


    public void  CustomerInfo() {
        System.out.println("you need to write your info");

        System.out.println("Enter your name:");
        fuldnavn  = scan.nextLine();
        System.out.println("Enter address");
        adresse = scan.nextLine();
        System.out.println("phoneNumber");
        tlfnummmer = scan.nextInt();

    }
    public void  Ordernumber() {

        Random random = new Random();
        orderNumber = random.nextInt(10000);
        char character = '#';


        System.out.println(fuldnavn+" your ordernumber is :" + character + orderNumber);





    }
    public void cancelOrder() {
        Scanner out = new Scanner(System.in);
        System.out.println("you want to cancel order");
        String output = out.nextLine();
        if(output.equalsIgnoreCase("yes")) {
          // String input = kurv.visVarer();
           int orderNumber1 = orderNumber;
            System.out.println("your order:"+orderNumber1+" is deleted");

        }else{
            System.out.println("order will proceed");




        }


    }

}









