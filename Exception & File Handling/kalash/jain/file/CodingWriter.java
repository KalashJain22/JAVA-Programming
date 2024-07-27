package kalash.jain.file;

import java.io.FileWriter;
import java.io.IOException;

public class CodingWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("This is the best java course\n");
            for(int i = 0; i < 1000; i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File written successfuly");
        } catch(IOException exception) {
            System.out.printf("Exception occured, %s", exception.getMessage());
        }
    }
}
