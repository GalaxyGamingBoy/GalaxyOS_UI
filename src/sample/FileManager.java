package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    //Handle Username Files
    public static void WriteUsernameFile(String Username){
        try {
            File username = new File("username.txt");
            username.delete();
            FileWriter myWriter = new FileWriter(username);
            myWriter.write(Username);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void WriteDefaultUsernameFile(){
        try {
            File username = new File("username.txt");
            username.delete();
            FileWriter myWriter = new FileWriter(username);
            myWriter.write("admin");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static String ReadUsernameFiles() throws FileNotFoundException {
        File myObj = new File("username.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            return data;
        }
        myReader.close();
        return null;
    }

    //Password Readers

    public static void WritePasswordFile(String Username){
        try {
            File username = new File("password.txt");
            username.delete();
            FileWriter myWriter = new FileWriter(username);
            myWriter.write(Username);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void WriteDefaultPasswordFile(){
        try {
            File username = new File("password.txt");
            username.delete();
            FileWriter myWriter = new FileWriter(username);
            myWriter.write("admin");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static String ReadPasswordFiles() throws FileNotFoundException {
        File myObj = new File("password.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            return data;
        }
        myReader.close();
        return null;
    }


}
