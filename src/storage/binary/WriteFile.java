package storage.binary;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile implements IWriteFile {
//    singleton, chi tao 1 doi tuong
//    1: tao static instance
    private static WriteFile instance;

    private WriteFile() {
    }

    public synchronized static WriteFile getInstance() {
        if (instance == null) {
            instance = new WriteFile();
        }
        return instance;
    }
    public void writeFile(List<Student> students) {
        File file = new File("students.dat");
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
