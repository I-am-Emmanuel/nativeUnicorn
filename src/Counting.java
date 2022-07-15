import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; --j) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}


