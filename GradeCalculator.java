import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Take total maximum marks.
        System.out.println("Enter total maximum marks for all subjects:");
        int totalMaxMarks = scanner.nextInt();
        
        // Input: Take marks obtained in each subject.
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + (i + 1) + ":");
            marks[i] = scanner.nextInt();
        }
        
        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        // Calculate Average Percentage: Divide the total marks by the total maximum marks.
        double averagePercentage = ((double) totalMarks / (totalMaxMarks * numSubjects)) * 100;
        
        // Grade Calculation: Assign grades based on the average percentage achieved.
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
