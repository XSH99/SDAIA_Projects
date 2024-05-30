/*
* Create a Main class with a main method to demonstrate the functionality of the StudentManager class.
In the main method:
1-Create several Student objects.
2-Add these students to the StudentManager.
3-Retrieve and display a student by their ID.
4-Display all students in the list.
5-Remove a student by their ID and display the list of students again to confirm removal.
 */

public class Main {
    public static void main(String[] args) {

        // Create StudentManager instance
        StudentManager studentManager = new StudentManager();

        // Create Student objects
        Student student1 = new Student("Ahmad", 1);
        Student student2 = new Student("Ali", 2);
        Student student3 = new Student("Nora", 3);

        // 2
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        // 3
        Student retrievedStudent = studentManager.getStudentById(3);
        if (retrievedStudent != null) {
            System.out.println("Retrieved Student: " + retrievedStudent.getName() + ", ID: " + retrievedStudent.getId());
        } else {
            System.out.println("Student not found.");
        }

        // 4
        System.out.println("All Students:");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }

        // 5
        boolean removed = studentManager.removeStudentById(3);
        if (removed) {
            System.out.println("Student with ID 3 removed.");
        } else {
            System.out.println("Student with ID 3 not found.");
        }

        // 
        System.out.println("All Students after removal:");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }

    }
}