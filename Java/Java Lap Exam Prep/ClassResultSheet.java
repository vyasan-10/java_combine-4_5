import java.util.Scanner;

public class ClassResultSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] marks = new int[6];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks" + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int total = 0;

        for (int mark : marks){
            if (mark > highest){
                highest = mark;
            }
            if (mark < lowest){
                lowest = mark;
            }
            total += mark;
        }
        double average = (double) total / marks.length;

        int aboveAverage = 0;

        for (int mark : marks){
            if (mark > average){
                aboveAverage++;
            }
        }
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Number of Students Above Average: " + aboveAverage);
    }
}
