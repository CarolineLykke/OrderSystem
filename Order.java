import java.util.Random;
import java.util.Scanner;

public class Order {

    Scanner scan = new Scanner(System.in);
   Kurv kurv;
    private  String fuldnavn;
    private int tlfnummmer;
    private int orderNumber;


    public void  CustomerInfo() {
        System.out.println("What is your information, when we are done with your coffee");

        System.out.println("Enter your name:");
        fuldnavn  = scan.nextLine();
        System.out.println("phoneNumber");
        tlfnummmer = scan.nextInt();
    }

    public String Ordrenummer() {
        // Opret en tilfældig generator
        Random rand = new Random();

        // Generer et tilfældigt heltal mellem 1 og 99999 (inklusiv)
        int randomNum = rand.nextInt(99999) + 1;

        // Formater tallet som en streng med præcis 5 cifre ved at tilføje førende nuller
        String formattedNum = String.format("%05d", randomNum);
        char character = '#';

        System.out.println(fuldnavn+" your ordernumber is :" + character + formattedNum);

        return (fuldnavn+" your ordernumber is :" + character + formattedNum);
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









