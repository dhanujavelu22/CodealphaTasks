package dhanuintern2;
import java.util.ArrayList;
import java.util.Scanner;

public class studentgrade {
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Integer> grades = new ArrayList<>();
		        System.out.print("Enter the number of students: ");
		        int numStudents = scanner.nextInt();

		        for (int i = 1; i <= numStudents; i++) {
		            System.out.print("Enter grade for student " + i + ": ");
		            int grade = scanner.nextInt();
		            grades.add(grade);
		        }
		        double average = calculateAverage(grades);
		        int highest = findHighest(grades);
		        int lowest = findLowest(grades);
		        System.out.println("\nResults:");
		        System.out.println("Average Score: " + average);
		        System.out.println("Highest Score: " + highest);
		        System.out.println("Lowest Score: " + lowest);

		        scanner.close();
		    }
		    public static double calculateAverage(ArrayList<Integer> grades) {
		        int sum = 0;
		        for (int grade : grades) {
		            sum += grade;
		        }
		        return (double) sum / grades.size();
		    }
		    public static int findHighest(ArrayList<Integer> grades) {
		        int highest = grades.get(0);
		        for (int grade : grades) {
		            if (grade > highest) {
		                highest = grade;
		            }
		        }
		        return highest;
		    }
		    public static int findLowest(ArrayList<Integer> grades) {
		        int lowest = grades.get(0);
		        for (int grade : grades) {
		            if (grade < lowest) {
		                lowest = grade;
		            }
		        }
		        return lowest;
		    }

	}




