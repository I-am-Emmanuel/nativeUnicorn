import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        System.out.printf("%s%n", "Enter an integer:" );
        for(int grades = 1; grades >= 6; grades++){
        Scanner input = new Scanner(System.in);
            int grade = input.nextInt(); {
            switch (grade) {
                case 80:
                    System.out.printf("Your grade is A");
                    break;
                case 60:
                    System.out.printf("Your grade is B");
                    break;
                case 50:
                    System.out.printf("Your grade is C");
                    break;
                case 40:
                    System.out.printf("Your grade is D");
                    break;
                case 30:
                    System.out.print("Your grade is F");
                    break;
                default:
                    System.out.printf("No record grade for the inserted number");
                    break;

            }
                               }
        }
    }
}
