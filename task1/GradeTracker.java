package task1;

import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of STUDENTS : ");
        int numStudents = scanner.nextInt();
        int numSubjects;

        
            System.out.print("Enter the number of SUBJECTS : ");
            numSubjects = scanner.nextInt();
            

        String[][] grades = new String[numStudents][numSubjects];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n\tEnter grades of student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter grade for subject " + (j + 1) + ": ");
                grades[i][j] = scanner.next();
            }
        }
        double[] averages = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                switch (grades[i][j].toUpperCase()) {
                    case "A":
                        sum += 4.0;
                        break;
                    case "B":
                        sum += 3.0;
                        break;
                    case "C":
                        sum += 2.0;
                        break;
                    case "D":
                        sum += 1.0;
                        break;
                    default:
                        sum += 0.0;
                }
            }
            averages[i] = sum / numSubjects;
        }
        System.out.println("\n\tAverage grades for each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ": " + averages[i]);
        }
        double highest=0;
        for(int i=0;i<numStudents;i++){
        	if(averages[i]>highest){
        		highest=averages[i];
        	}
        }
        double lowest=averages[0];
        for(int i=0;i<numStudents;i++){
        	if(averages[i]<lowest){
        		lowest=averages[i];
        	}
        }
        System.out.println("\n\tHighest Score is : "+highest);
        System.out.println("\tLowest Score is : "+lowest);

        scanner.close();
    }
}
