package view;

import controller.StudentController;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        1: danh sach
        showAllStudent();

//        2: them moi student
//        addStudent();
    }
    public static void showAllStudent() {
        StudentController studentController = new StudentController();
        List<Student> students = studentController.getStudents();
        System.out.println("hien thi danh sach HV");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void addStudent() {
        System.out.println("Them moi HV");
        System.out.println("Moi ban nhap vao id");
        Scanner scanner = new Scanner(System.in);
        int id  = scanner.nextInt();
        System.out.println("Moi ban nhap vao code");
        String code = scanner.nextLine();
        System.out.println("Moi ban nhap vao ten");
        String name = scanner.nextLine();
        Student student = new Student(id, code, name);
//        view goi controller
        StudentController studentController = new StudentController();
        studentController.addStudent(student);

    }
}
