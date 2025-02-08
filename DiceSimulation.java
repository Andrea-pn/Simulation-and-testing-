import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        // Initialize variables
        int[] frequency = new int[6]; // Array to store frequency of each face
        int totalRolls = 1000;
        Random random = new Random();

        // Simulate rolling the dice 1000 times
        for (int i = 0; i < totalRolls; i++) {
            double randomValue = random.nextDouble(); // Generate a random number between 0 and 1
            if (randomValue < 1.0 / 6) {
                frequency[0]++; // Face 1
            } else if (randomValue < 2.0 / 6) {
                frequency[1]++; // Face 2
            } else if (randomValue < 3.0 / 6) {
                frequency[2]++; // Face 3
            } else if (randomValue < 4.0 / 6) {
                frequency[3]++; // Face 4
            } else if (randomValue < 5.0 / 6) {
                frequency[4]++; // Face 5
            } else {
                frequency[5]++; // Face 6
            }
        }

        // Display the results in a table format
        System.out.println("Face\tFrequency\tPercentage");
        int totalFrequency = 0;
        double totalPercentage = 0.0;
        for (int i = 0; i < frequency.length; i++) {
            int face = i + 1;
            int freq = frequency[i];
            double percentage = (freq / (double) totalRolls) * 100;
            totalFrequency += freq;
            totalPercentage += percentage;
            System.out.printf("%d\t%d\t\t%.1f%%\n", face, freq, percentage); // Updated to one decimal place
        }

        // Print the totals
        System.out.printf("Total\t%d\t\t%.1f%%\n", totalFrequency, totalPercentage); // Updated to one decimal place
    }
}