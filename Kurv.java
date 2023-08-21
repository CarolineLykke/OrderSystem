import java.util.ArrayList;

public class Kurv {
    private ArrayList<String> varer;

    public void Kurv() {
        varer = new ArrayList<>();
    }

    // Tilføj en vare til kurven
    public void tilfojVare(String vare) {
        varer.add(vare);
    }

    //fjern en vare i kurven
    public void fjernVare(String vare){
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
