package mypackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class studentManager {
    static Scanner sc = new Scanner(System.in);

    public static void writeStudent(){
        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            FileWriter fw = new FileWriter("students.txt", true);

            fw.write(id + "," + name + "," + marks + "\n");

            fw.close();

            System.out.println("Student saved.");

        } catch (InputMismatchException e) {
            System.out.println("Wrong input type.");
        } 
        catch (IOException e) {
            System.out.println("File error.");
        }
        
    }

    public static void readStudents() {
        try {
        BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    } 
    catch (IOException e) {
        System.out.println("Error reading file or file does not exist.");
    }
    }



}