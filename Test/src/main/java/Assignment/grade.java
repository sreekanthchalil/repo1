// Class to store student marks and calculate total
class Student {
    private int mark1;
    private int mark2;
    private int mark3;

    // Constructor to initialize marks
    public Student(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    // Method to calculate total marks
    public int getTotal() {
        return mark1 + mark2 + mark3;
    }

    // Method to calculate grade based on total
    public String getGrade() {
        int total = getTotal();
        double average = total / 3.0;

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }
}

// Main class to test Student
public class StudentGrade {
    public static void main(String[] args) {
        // Create 2 students using constructor
        Student student1 = new Student(85, 90, 88);
        Student student2 = new Student(65, 70, 75);

        // Get and print total and grade for Student 1
        int total1 = student1.getTotal();
        System.out.println("Student 1 Total Marks: " + total1);
        System.out.println("Student 1 Grade: " + student1.getGrade());

        System.out.println();

        // Get and print total and grade for Student 2
        int total2 = student2.getTotal();
        System.out.println("Student 2 Total Marks: " + total2);
        System.out.println("Student 2 Grade: " + student2.getGrade());
    }
}