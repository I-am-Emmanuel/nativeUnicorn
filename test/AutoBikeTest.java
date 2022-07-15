import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tddClass.Autobike;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutoBikeTest {
    @Test
    @DisplayName("testing My new AutoBike")
    public void testingpower() {
        Autobike chevroletV2 = new Autobike(true);
        chevroletV2.turnbikeOn();
        assertTrue(chevroletV2.getpower());
    }

   @Test
    public void testpoweroff() {
            Autobike chevroletV2 = new Autobike(false);
            chevroletV2.turnbikeOn();
            assertFalse(chevroletV2.getpower());

        }


    }

