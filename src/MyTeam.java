public class MyTeam {
    public static void main(String[] args) {
        int[][] squad1 = {{1}, {2, 5, 13, 3}, {8, 4, 10}, {15, 7, 11}};
        int[][] squad2 = {{17}, {22, 29,6, 16, 34}, {18, 20, 14}, {9,12}};

        System.out.println("Shirt number for my first eleven squad");
        outputSquad(squad1);
        System.out.println("Shirt number for my second team squad");
        outputSquad(squad2);
    }

    public static void outputSquad(int [][] allsquads) {
        for(int formation = 0; formation < allsquads.length; formation++) {
            for(int formation2 = 0; formation2 < allsquads[formation].length; formation2++){
                System.out.printf("%d ", allsquads[formation][formation2]);
            }
            System.out.println();
        }
    }
}
