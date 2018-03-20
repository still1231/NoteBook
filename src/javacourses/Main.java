package javacourses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static sun.net.ftp.impl.FtpClient.create;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Person> records = new ArrayList<>();


    public static void main(String[] args) {
        commandLoop();
    }

    private static void commandLoop() {
        for (; ; ) {
            String cmd = askString("cmd>:");
            switch (cmd.toLowerCase()) { // tolowercase - perevodit v malen'kie
                case "exit":
                    return;
                case "create":
                    create();
                    break;
                case "list":
                    list();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
    private static void list() {
        for (Person p : records) {
            System.out.println(p);
        }
    }

    private static void create() {

        for (; ; ) {

            String type = askString("type:");

            switch (type) {
                case "exit":
                    return;
                case "person":
                    createPerson();
                    return;
                default:
                    System.out.println("Unknown type");
            }
        }
    }
    private static void createPerson() {
        Person person = new Person();

        person.setFirstname(askString("type name:"));
        person.setLastName(askString("type lastname"));
        person.setPhone(askString("type Phone"));

        records.add(person);
    }
    private static String askString(String message) {
        System.out.println(message);
        return scanner.next();
    }
}





