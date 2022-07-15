public class AddingArray {
    public static void main(String[] args) {
        int [] numbers = {52, 19, 55, 72, -67, 89, -99, -13, 66, 92};
        int total = 0;

        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
            System.out.println(total);
        }
    }
