package main;

import model.Student;
import util.FileName;
import util.MainUtility;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("dekan or laborant");
            switch (scan.next()) {
                case "dekan":
                    System.out.println("Username daxil edin");
                    String usernameDekan = scan.next();
                    System.out.println("Passwordu daxil edin");
                    String passwordDekan = scan.next();
                    if (MainUtility.login(usernameDekan, passwordDekan, FileName.dekan.name() + ".txt")) {
                        System.out.println("1.Dekan yarat\n2.Telebe siyahisina baxmaq");
                        switch (scan.nextInt()) {
                            case 1:
                                MainUtility.createDekan("rafail", "12345");
                                System.out.println("Successfully Created");
                                break;
                            case 2:
                                List<String> list = MainUtility.findAll();
                                Iterator<String> iterator = list.iterator();
                                while (iterator.hasNext()) {
                                    System.out.println(iterator.next());
                                }
                                break;
                            default:
                                System.out.println("Bu cur secim yoxdur");
                        }
                    } else {
                        System.out.println("Incorrect Username Or Password");
                    }
                    break;
                case "laborant":
                    System.out.println("Username daxil edin");
                    String usernameLaborant = scan.next();
                    System.out.println("Passwordu daxil edin");
                    String passwordLaborant = scan.next();
                    if (MainUtility.login(usernameLaborant, passwordLaborant, FileName.laborant.name() + ".txt")) {
                        System.out.println("1.Laborant yarat\n2.Telebe yarat");
                        switch (scan.nextInt()) {
                            case 1:
                                System.out.println("Yeni Laborantin username-ni daxil edin");
                                String username1 = scan.next();
                                System.out.println("Yeni Laborantin passwordu-ni daxil edin");
                                String password1 = scan.next();
                                MainUtility.createLaborant(username1, password1);
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
                                System.out.println("Successfully Created");
                                break;
                            default:
                                System.out.println("Bu cur secim yoxdur");
                        }
                    } else {
                        System.out.println("Incorrect Username Or Password");
                    }
                    break;
                default:
                    System.out.println("Bu cur secim yoxdur");
            }
        } catch (InputMismatchException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        main(args);
    }
}
