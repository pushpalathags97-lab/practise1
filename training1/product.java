 public class  product {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50};
        int target = 50;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair exists: " + nums[i] + " + " + nums[j] + " = " + target);
                }
            }
        }
    }
}
    

