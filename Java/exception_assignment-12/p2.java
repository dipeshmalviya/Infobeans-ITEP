/*
 * 2. File Upload System
 * 
 * A web app allows file upload. But the file path provided by the user does not
 * exist.
 * 
 * Which Java exception will occur?
 * 
 * How would you handle it so the program doesn’t crash?
 * 
 * Should you retry or show a friendly message to the user?
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class UploadSystem {
    public void readFile(String filepath) throws IOException {
        FileReader fr = new FileReader(filepath);
        fr.read();
        fr.close();

    }

}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path with ");
        String filepath = sc.nextLine();
        UploadSystem file1 = new UploadSystem();
        try {
            file1.readFile(filepath);
        } catch (IOException i) {
            System.out.println("Io exception handled");
        }

    }
}