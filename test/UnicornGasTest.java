import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tddClass.UnicornGas;

import static org.junit.jupiter.api.Assertions.*;

public class UnicornGasTest {

    UnicornGas unicorn; //Class declaration instance variable

    @BeforeEach // Before Each field
    void setup(){unicorn = new UnicornGas(true);} // initializing the Before Each field.

    @Test
    @DisplayName("Giving Discount per liter on gas sales")
    public void checkGasAvailability() {
        unicorn.buyGas();
        assertTrue(unicorn.getGas());
    }

    @Test
    public void calculate5LitresDiscountPayment() {
        unicorn.buyFuel(5);
        assertEquals(588, unicorn.getAmount());
    }

    @Test
    public void calculate2LitresDiscountPayment() {
        UnicornGas unicorn = new UnicornGas(true);
        unicorn.buyFuel(2);
        assertEquals(235.2, unicorn.getAmount());
    }

      @Test
    public void calculate4litresdiscountPayment() {
        UnicornGas unicorn = new UnicornGas(true);
        unicorn.buyFuel(9);
        assertEquals(1058.4, unicorn.getAmount());
        }

}




