public class Student {

    // instance variables
    private String name;
    private double gpa;
    private int grade;

    // constructor
    public Student(String studentName, double studentGpa, int studentGrade) {
        name = studentName;
        gpa = studentGpa;
        grade = studentGrade;
    }

    // method that introduces the Student
    public void introduce() {
        if (grade > 8) {
            System.out.println("Hello my name is " + name + " and I'm in High School");
        } else if (grade > 5) {
            System.out.println("Hello my name is " + name + " and I'm in Middle School");
        } else {
            System.out.println("Hello my name is " + name + " and I'm in Elementary School");
        }
    }

    // method that prints Student info
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
    }
}
