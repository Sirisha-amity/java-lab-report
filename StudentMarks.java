import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;
        int highest;

        System.out.println("Enter marks of 5 students:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = (double) sum / 5;

        highest = marks[0];
        for (int i = 1; i < 5; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        int aboveAverage = 0;
        for (int i = 0; i < 5; i++) {
            if (marks[i] > average) {
                aboveAverage++;
            }
        }

        System.out.println("Average Marks = " + average);
        System.out.println("Highest Marks = " + highest);
        System.out.println("Number of Students Scoring Above Average = " + aboveAverage);

        sc.close();
    }
}
