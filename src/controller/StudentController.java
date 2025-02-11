package controller;

import model.Student;
import storage.binary.IWriteFile;
import storage.binary.ReadFile;
import storage.binary.WriteFile;
import storage.binary.WriteFileExcel;

import java.util.List;

public class StudentController {
//    controller goi storage
    ReadFile readFile = new ReadFile();
    IWriteFile writeFile = WriteFile.getInstance();
//    thao tac CRUD
    List<Student> students = ReadFile.readFile("students.dat") ;
//    Danh sach
    public List<Student> getStudents() {
        return students;
    }
//    them moi
    public void addStudent(Student student) {
        students.add(student);
        writeFile.writeFile(students);
    }
}
