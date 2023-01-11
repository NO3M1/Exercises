import exercitii2.Masina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMasina {

    @Test
    public void testAccelereaza() {
        Masina audi = new Masina("Audi", 4, "Alb", true);
        for (int index = 0; index < 10; index++) {
            audi.accelereaza();
        }
        audi.franeaza();
        assertEquals(9, audi.getViteza(), "Vitezele nu sunt egale");
    }
}
