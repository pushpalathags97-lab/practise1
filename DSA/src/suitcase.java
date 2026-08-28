public class suitcase {
    static String[] items = {"pant", "shirt", "shoes", "top", "bag"};
    static String[] weights = {"15", "10", "25", "50", "20"};
    static int weightsLimit = 100;

    public static void findcombinations(int index, int currentweights, String currentplate) {
        if (currentweights > weightsLimit) {
            return;
        }
        if (index == items.length) {
            if (!currentplate.isEmpty()) {
                System.out.println(currentplate + "->Total:" + currentweights + "cal");
            }
            return;
        }
        findcombinations(index + 1, +currentweights,
                currentplate );
        findcombinations(index + 1, currentweights+ Integer.parseInt(weights[index])
                , currentplate+items[index]+"");
    }

    public static void main(String[] args) {
        System.out.println("possible combination of food  items within  the calories limit");
        findcombinations(0, 0, " ");

    }
}



