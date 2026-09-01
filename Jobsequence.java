import java.util.*;

class Job {
    char id;
    int deadline;
    int profit;

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Jobsequence {

    public static void main(String[] args) {

        Job[] jobs = {
                new Job('A', 2, 100),
                new Job('B', 1, 19),
                new Job('C', 2, 27),
                new Job('D', 1, 25),
                new Job('E', 3, 15)
        };

        // max deadline
        int maxDeadline = 0;

        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        // maxi profit
        int maxProfit = 0;

        for (Job job : jobs) {
            if (job.profit > maxProfit) {
                maxProfit = job.profit;
            }
        }

        System.out.println("Maximum Deadline: " + maxDeadline);
        System.out.println("Maximum Profit: " + maxProfit);

        // Array to store profit for each deadline
        int[] profitArray = new int[maxDeadline + 1];

        // Store maximum profit for each deadline
        for (Job job : jobs) {

            if (job.profit > profitArray[job.deadline]) {
                profitArray[job.deadline] = job.profit;
            }
        }

        // display the array
        System.out.println("Profit Array:");

        for (int i = 1; i <= maxDeadline; i++) {
            System.out.println("Deadline " + i + " = " + profitArray[i]);
        }
    }
}