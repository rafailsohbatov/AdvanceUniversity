package main;

import model.Student;
import util.MainUtility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("dekan or laborant");
        switch (scan.next()) {
            case "dekan":
                System.out.println("1.Dekan yarat\n2.Telebe siyahisina baxmaq");
                switch (scan.nextInt()) {
                    case 1:

                        MainUtility.createDekan("rafail","12345");
                        System.out.println("Successfully Created");
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Bu cur secim yoxdur");
                }
                break;
            case "laborant":
                System.out.println("1.Laborant yarat\n2.Telebe yarat");
                switch (scan.nextInt()) {
                    case 1:

                        MainUtility.createLaborant("", "12345");
                        System.out.println("Successfully Created");
                        break;
                    case 2:
                        Student student = new Student();
                        System.out.println("Name - daxil edin");
                        student.setName(scan.next());
                        System.out.println("Surname - daxil edin");
                        student.setSurname(scan.next());
                        System.out.println("Point - daxil edin");
                        student.setPoint(scan.nextByte());
                        MainUtility.createStudent(student);
                        break;
                    default:
                        System.out.println("Bu cur secim yoxdur");
                }
                break;
            default:
                System.out.println("Bu cur secim yoxdur");
        }
    }
}
