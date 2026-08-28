public class triangular {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i<= rows; i++) {
            for (int j = 1; j<=6-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
