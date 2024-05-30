/*
*Create a class StudentManager with the following private attribute:
1- ArrayList<Student> students - a list to store students.
 Implement the following public methods:
void addStudent(Student student) 1- Adds a new student to the list.
Student getStudentById(int id) 2- Returns a student based on their ID.
ArrayList<Student> getAllStudents() 3- Returns a list of all students.
boolean removeStudentById(int id) 4- Removes a student from the list using their ID.
* */
import java.util.ArrayList;

public class StudentManager {
    //1
    private ArrayList<Student> students = new ArrayList<>();

    // 1
    public void addStudent(Student student) {
        students.add(student);
    }

    // 2
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Return null if student not found
    }

    // 3
    public ArrayList<Student> getAllStudents() {
        return students;
    }

    // 4
    public boolean removeStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return true; // Return true if student was found and removed
            }
        }
        return false; // Return false if student not found
    }


}
