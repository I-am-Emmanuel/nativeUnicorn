public class TestingArray {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 6;
        numbers[1] = 17;
        numbers[2] = 42;
        numbers[3] = 63;
        numbers[4] = 91;
        numbers[5] = 22;
        numbers[6] = 71;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
