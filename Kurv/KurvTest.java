import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KurvTest {

     @Test
    public void Kurv() {
        Kurv kur = new Kurv();
        Item item1 = new Item("æble",10.0);
        Item item2 = new Item("pære", 12.0);
        kur.addItem(item1);
        kur.addItem(item2);
        assertEquals(kur.getItems().size(),2);
    }
    }
