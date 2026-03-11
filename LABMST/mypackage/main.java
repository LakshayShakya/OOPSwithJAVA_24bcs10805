package mypackage;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        studentManager sm = new studentManager();

        int choice;

        do {

            System.out.println("\n1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                sm.writeStudent();
            } 
            else if (choice == 2) {
                sm.readStudents();
            }

        } while (choice != 3);

    }
}
