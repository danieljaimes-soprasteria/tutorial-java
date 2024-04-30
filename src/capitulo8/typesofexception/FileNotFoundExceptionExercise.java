package capitulo8.typesofexception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExercise {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("C://file.txt");
            char [] a = new char[50];
            fr.read(a);
            for(char c : a)
                System.out.print(c);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("File could not be read/write.");
        }
    }
}
