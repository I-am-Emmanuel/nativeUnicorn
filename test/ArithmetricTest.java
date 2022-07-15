import org.junit.jupiter.api.Test;
import tddClass.Arithmetric;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmetricTest {
    @Test
    public void arithmetricwork() {
        Arithmetric subject = new Arithmetric();
        int result = subject.add(17, 13);
        assertEquals(30, result);
    }
    @Test
    public void subtractthreeNumbers() {
        Arithmetric subject = new Arithmetric();
        assertEquals(30, subject.subtract(35, 5));
    }

        @Test
                public void addthreenumbers() {
            Arithmetric subject = new Arithmetric();
            int result = subject.add(30, 12, 50);
            assertEquals(92, result);
        }
//        @Test
//        public void sumthreenumbers() {
//            Arithmetric subject = new Arithmetric();
//            int result = subject.add(62,10,8);
//                    assertEquals(80, result);


    //private int threeNumbers(int firstNumber, int secondNumber, int thirdumber) {
        //return add()
    }
