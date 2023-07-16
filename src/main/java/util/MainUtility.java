package util;

import model.Student;

public class MainUtility
{
    public static void createLaborant(String username,String password) throws Exception{
        String text = username + " " + password;
        FileUtility.writeToFile(FileName.laborant+".txt",text);
    }
    public static void createDekan(String username,String password) throws Exception{
        String text = username + " " + password;
        FileUtility.writeToFile(FileName.dekan+".txt",text);
    }
    public static void createStudent(Student student) throws Exception{
        FileUtility.writeToFile(FileName.student+".txt",student.toString());
    }
}
