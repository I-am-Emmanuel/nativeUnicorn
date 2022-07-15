public class Asterik2 {
    public static void main(String[] args) {
        for (int counter = 5; counter >= 1; counter--) {
            for (int counter2 = 5; counter2 != counter; counter2--) {
                System.out.print(" ");
            }
            for (int counter3 = 1; counter3 <= counter; counter3++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
