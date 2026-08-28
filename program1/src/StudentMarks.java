import java.util.ArrayList;

public class StudentMarks {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(86);
        marks.add(92);
        marks.add(78);
        marks.add(90);
        marks.add(65);
        marks.add(88);
        marks.add(76);

        // Display all marks
        System.out.println("Marks: " + marks);

        // Highest mark
        int highest = java.util.Collections.max(marks);
        System.out.println("Highest Mark: " + highest);

        // Lowest mark
        int lowest = java.util.Collections.min(marks);
        System.out.println("Lowest Mark: " + lowest);

        // Average
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        double avg = (double) sum / marks.size();
        System.out.println("Average: " + avg);

        // Remove marks below 80
        marks.removeIf(m -> m < 80);

        // Display updated list
        System.out.println("After removing marks below 80: " + marks);

        // Check whether 90 is removed or not
        boolean removed = !marks.contains(90);
        System.out.println("Is 90 removed? " + removed);
    }
}



