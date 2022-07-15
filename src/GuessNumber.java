import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:" );
        int number = input.nextInt();
        if (number < 98 || number > 98) {
            System.out.println("No, You are wrong. Please, try again!"); }
        else{
            System.out.println("Yes, you are correct!");
        }

    }


}
