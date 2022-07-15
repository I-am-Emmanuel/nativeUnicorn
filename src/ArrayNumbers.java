import java.util.WeakHashMap;

public class ArrayNumbers {
    public static void main(String[] args) {
        int[][] patterns1 = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6}};
        int[][] patterns2 = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5}, {1, 2, 3, 4}, {1, 2, 3}, {1, 2}, {1}};
        //int[][] patterns3 = {{-,1}, {     2, 1,}, {   3, 2, 1}, {  4, 3, 2, 1}, { 5, 4, 3, 2, 1},{6, 5, 4, 3, 2, 1}};
       // int[][] patterns4 = {{1, 2, 3, 4, 5, 6}, { 1, 2, 3, 4, 5}, {  1, 2, 3, 4}, {   1, 2, 3}, {    1, 2},{      1}};

        System.out.println("Pattern A");
        outputPattern(patterns1);
        System.out.println("Pattern B");
        outputPattern(patterns2);
        //System.out.println("Pattern C");
       // outputPattern(patterns3);
       // System.out.println("Pattern D");
       // outputPattern(patterns4);
    }

    public static void outputPattern(int[][] pattern) {
        for(int patterns1 = 0; patterns1 < pattern.length; patterns1++) {
            for (int patterns2 = 0; patterns2 < pattern[patterns1].length; patterns2++) {
            //    for (int patterns3 = 1; patterns3 < pattern[patterns2].length; patterns3++) {
             //       for (int patterns4 = 1; patterns4 < pattern[patterns1].length; patterns4++) ;
                    System.out.printf("%d", pattern[patterns1][patterns2]);
                    // System.out.printf("%d", pattern[patterns3][patterns4]);
                    //}
                }
                System.out.println();
            }

        }
    }

