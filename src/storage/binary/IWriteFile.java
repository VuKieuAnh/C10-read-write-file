package storage.binary;

import model.Student;

import java.util.List;

public interface IWriteFile {
    void writeFile(List<Student> students);
}
