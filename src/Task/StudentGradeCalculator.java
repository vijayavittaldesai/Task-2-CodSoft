package Task;
import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects ");
        int sub = sc.nextInt();
        int marks[] = new int[sub];

        for (int i = 0; i < sub; i++) {
            System.out.println("Enter subject " + (i + 1) + " marks");
            marks[i] = sc.nextInt();
        }

        Student student = new Student("John Doe", marks);
        student.calculateGrade();
        student.display();
    }
}

class Student {
    private String name;
    private int[] marks;
    private int total;
    private float average;
    private char grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public void calculateGrade() {
        int sub = marks.length;
        for (int mark : marks) {
            total += mark;
        }
        average = (float) total / sub;

        if (average >= 90 && average <= 100)
            grade = 'S';
        else if (average >= 80 && average < 90)
            grade = 'A';
        else if (average >= 70 && average < 80)
            grade = 'B';
        else if (average >= 60 && average < 70)
            grade = 'C';
        else if (average >= 50 && average < 60)
            grade = 'D';
        else if (average >= 40 && average < 50)
            grade = 'E';
        else
            grade = 'F';
    }

    public void display() {
        System.out.println("\nRESULTS");
        System.out.println("Student Name: " + name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " marks = " + marks[i]);
        }
        System.out.println("Total of " + marks.length + " subjects = " + total);
        System.out.println("Average of " + marks.length + " subjects = " + average);
        System.out.println("Grade = " + grade);
    }
}
