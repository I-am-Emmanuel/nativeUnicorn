import java.security.SecureRandom;

public class RandomN0 {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for(int i = 1; i <= 20; i++) {

            int side = 1 + randomNumbers.nextInt(6);
            System.out.println(side);
            if (i % 5 == 0 ) {
                System.out.println();
            }
        }
    }
}
