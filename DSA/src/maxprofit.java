public class maxprofit {
    public static void main(String[] args) {
        int profit[] = {-2, 3, -1, 4, -5};

        int max = profit[0];

        for (int i = 1; i < profit.length; i++) {
            if (profit[i] > max) {
                max = profit[i];
            }
        }

        System.out.println("Maximum profit = " + max);
    }
}

