public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Andrew", 4.0, 10);
        student1.introduce();
        student1.printStudentInfo();

        Student student2 = new Student("John", 3.8, 7);
        student2.introduce();
        student2.printStudentInfo();
    }
}
