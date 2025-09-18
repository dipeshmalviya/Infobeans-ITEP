/*
 * 9. Throws Keyword
 * 
 * 👉 Write a method readFile(String fileName) that uses FileReader. Declare it
 * with throws IOException and handle it in main().
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class A {
    public void readFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        fr.read();
        fr.close();

    }

  
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name with extension");
        String filename=sc.nextLine();
        A a1 = new A();
        try {
            a1.readFile(filename);
        } catch (IOException i) {
            System.out.println("Io exception handled");
        }
        

    }
}