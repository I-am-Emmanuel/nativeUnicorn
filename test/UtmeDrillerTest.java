import org.junit.jupiter.api.Test;
import tddClass.UtmeDriller;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtmeDrillerTest {
    @Test
    public void bookPurchase(){
        UtmeDriller books =  new UtmeDriller(2000, 200);
        int result = books.purchase(4);
        assertEquals(8000, result);
    }
}
