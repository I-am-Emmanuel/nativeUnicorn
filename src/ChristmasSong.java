import java.util.Scanner;

public class ChristmasSong {
    static int Verse;
    static int Secondverse;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Christmas Song\nPress 1 to listen to the song by verses");
        //for (int i = 1; i <= 1; i++) {
        Verse = input.nextInt();
        switch (Verse) {
            case 1:
                System.out.println("On the first day of christmas, my true love sent to me\nA partridge in a pear tree");
                break;
                //switch (Secondverse) {
              //  case 1:

            //}

        }
    }
}

