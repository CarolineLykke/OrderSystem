import java.util.ArrayList;
import java.util.Scanner;

public class Kurv {
    private int price;

    private ArrayList<String> varer;
    Scanner scan = new Scanner(System.in);



    public int getPrice() {
        return price;
    }
    public void chooseproducts(){
        price= 0;
        System.out.println("what do you want have, caffelatte, Americano, vand ");
        String output = scan.nextLine();
        if(output.equalsIgnoreCase("caffelatte")){
            price = 20;
        }
        if(output.equalsIgnoreCase("Americano")){
            price = 15;
        }
        if(output.equalsIgnoreCase("Vand")){
            price = 10;
        }
        System.out.println("do you want to add or remove a drink");

    }

    // Tilføj en vare til kurven
    public void tilfojVare(String vare) {

        varer.add(vare);
    }

    //fjern en vare i kurven
    public void fjernVare(String vare) {
        varer.remove(vare);
    }

    // Metode til at udskrive varerne i kurven
    public void visVarer() {
        System.out.println("Varer i kurven:");
        for (String vare : varer) {
            System.out.println(vare);
        }


    }
}