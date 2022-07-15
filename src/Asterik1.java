public class Asterik1 {
    public static void main(String[] args) {
        System.out.println("(A)");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("(B)");
        for(int i = 1; i <= 10; i++){
            for(int j = 10; j >= i; --j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("(C)");
        int s;
        for (int i = 1; i <= 10; i++){
            for(s = 1; s < i; s++){
            }
            for (int j = 10; j >= i; --j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("(D)");
        for (int i =1; i <= 10; i++ ){
            for(s = 10; s > i; --s){
            }
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
