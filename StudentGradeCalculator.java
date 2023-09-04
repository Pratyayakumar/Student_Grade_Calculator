
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int subjectCount = inputScanner.nextInt();
        
        int totalMarks = 0;
        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = inputScanner.nextInt();
            totalMarks += marks;
        }
        
        double averagePercentage = (double) totalMarks / subjectCount;
        String grade = calculateGrade(averagePercentage);
        
        System.out.println("\nExam Results:");
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Final Grade: " + grade);
        
        inputScanner.close();
    }
    
    private static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
