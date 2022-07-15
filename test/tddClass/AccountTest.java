package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    @DisplayName("Deposit/Withdrwal and Balances")
    public void depositMoney() {
        //given
        Account hemark = new Account();
        //when
        hemark.deposit(500);
        hemark.deposit(490);
        //check
        assertEquals(990, hemark.getbalance());

        //when
        hemark.deposit(900);
        hemark.withdraw(599);
        //check
        assertEquals(1291, hemark.newbalance());
    }
    @Test
        public void testnegativewithdrawal() {
    Account hemark = new Account();
        //when
        hemark.deposit(900);
        //given
        hemark.negativewithdraw(1291);
        assertEquals("insufficient funds", hemark.getnewbalance());

    }

}

