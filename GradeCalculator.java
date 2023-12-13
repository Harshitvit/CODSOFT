import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        // Marks in each subject
        int[] subjectMarks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            subjectMarks[i] = sc.nextInt();
        }

        // Total Marks
        int totalMarks = calculateTotalMarks(subjectMarks);

        //Average %
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);

        // Cal. Grade
        char grade = calculateGrade(averagePercentage);

        // Results
        displayResults(totalMarks, averagePercentage, grade);
    }

    static int calculateTotalMarks(int[] subjectMarks) {
        int totalMarks = 0;
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (totalMarks / (numSubjects * 100.0)) * 100.0;
    }

    static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
