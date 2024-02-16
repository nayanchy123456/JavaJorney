package exception;

public class abc {
	public static void main(String[] args) {
        try {
            int number = 5; 
            checkEven(  number);
            System.out.println(number + " is even.");
        } 
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
}
}


// buffered writer
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {
        String fileName = "example.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Writing multiple lines to the file
            writer.write("Hello, BufferedWriter example in Java!");
            writer.newLine(); // Add a new line
            writer.write("This is the second line.");

            System.out.println("Data has been written to the file.");

        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}

 // bufffered reader
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        String fileName = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Reading data from the file
            System.out.println("Reading data from the file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}


// file reader
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        String fileName = "example.txt";

        try (FileReader fileReader = new FileReader(fileName)) {
            int character;

            // Reading data from the file
            System.out.println("Reading data from the file:");

            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}


// file writer
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        String fileName = "example.txt";

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            // Writing data to the file
            fileWriter.write("Hello, FileWriter example in Java!\n");
            fileWriter.write("This is the second line.");

            System.out.println("Data has been written to the file.");

        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}


