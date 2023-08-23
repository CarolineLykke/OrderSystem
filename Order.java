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
        System.out.println("What is your information, when we are done with your coffee");

        System.out.println("Enter your name:");
        fuldnavn  = scan.nextLine();
        /*System.out.println("Enter address");
        adresse = scan.nextLine();*/
        System.out.println("phoneNumber");
        tlfnummmer = scan.nextInt();

    }
    public String  Ordernumber() {

        Random random = new Random();
        orderNumber = random.nextInt(10000);
        char character = '#';

        return fuldnavn+" your ordernumber is :" + character + orderNumber;

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









