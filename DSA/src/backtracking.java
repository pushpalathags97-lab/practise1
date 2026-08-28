public class backtracking {
    static String[] foods = {"Rice", "dal", "Panner", "salad", "dessert"};
    static String[] calories = {"150", "100", "250", "50", "200"};
    static int calorieLimit = 1000;

    public static void findcombinations(int index, int currentCalories, String currentplate) {
        if (currentCalories > calorieLimit) {
            return;
        }
        if (index == foods.length) {
            if (!currentplate.isEmpty()) {
                System.out.println(currentplate + "->Total:" + currentCalories + "cal");
            }
            return;
        }
        findcombinations(index + 1, +currentCalories,
                currentplate );
        findcombinations(index + 1, currentCalories+ Integer.parseInt(calories[index])
                , currentplate+foods[index]+"");
    }

    public static void main(String[] args) {
        System.out.println("possible combination of food  items within  the calories limit");
        findcombinations(0, 0, " ");

    }
}

