package util;

import model.Student;

import java.util.Iterator;
import java.util.List;

public class MainUtility {
    public static void createLaborant(String username, String password) throws Exception {
        String text = username + " " + password;
        FileUtility.writeToFile(FileName.laborant + ".txt", text);
    }

    public static void createDekan(String username, String password) throws Exception {
        String text = username + " " + password;
        FileUtility.writeToFile(FileName.dekan + ".txt", text);
    }

    public static void createStudent(Student student) throws Exception {
        FileUtility.writeToFile(FileName.student + ".txt", student.toString());
    }

    public static boolean login(String username, String password, String fileName) throws Exception {
        List<String> list = FileUtility.readFromFile(fileName);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String[] arr = iterator.next().split(" ");
            if (username.equalsIgnoreCase(arr[0]) && password.equalsIgnoreCase(arr[1])) {
                return true;
            }
        }
        return false;
    }

    public static List<String> findAll() throws Exception{
        List<String> list = FileUtility.readFromFile(FileName.student.name()+".txt");
        Iterator<String> iterator = list.iterator();

        return list;
    }
}
