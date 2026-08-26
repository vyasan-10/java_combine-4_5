import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCaseFlipDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        File originalFile;

        // STEP 1: Ask for a valid file name
        while (true) {
            System.out.print("Enter the file name : ");
            String fileName = keyboard.nextLine();
            originalFile = new File(fileName);

            if (originalFile.exists() && originalFile.isFile()) {
                System.out.println("File found.\n");
                break;
            }
            System.out.println("File not found. Please try again.\n");
        }

        // STEP 2: Display first five lines
        System.out.println("FIRST FIVE LINES OF THE ORIGINAL FILE");
        System.out.println("-------------------------------------");
        displayFirstFiveLines(originalFile);

        File tempFile = new File("temp.txt");

        try {
            Scanner reader = new Scanner(originalFile);
            PrintWriter writer = new PrintWriter(tempFile);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                line = flipCase(line);
                writer.println(line);
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while processing the file.");
            keyboard.close();
            return;
        }

        // STEP 3: Copy temp.txt back into original file
        try {
            Scanner reader = new Scanner(tempFile);
            PrintWriter writer = new PrintWriter(originalFile);

            while (reader.hasNextLine()) {
                writer.println(reader.nextLine());
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while copying the file.");
            keyboard.close();
            return;
        }

        // STEP 4: Display modified file
        System.out.println();
        System.out.println("FIRST FIVE LINES AFTER FLIPPING THE CASE");
        System.out.println("----------------------------------------");
        displayFirstFiveLines(originalFile);

        // STEP 5: Delete temp file
        tempFile.delete();
        keyboard.close();
    }

    // Helper method: Display first five lines
    public static void displayFirstFiveLines(File file) {
        try {
            Scanner reader = new Scanner(file);
            int count = 0;
            while (reader.hasNextLine() && count < 5) {
                System.out.println(reader.nextLine());
                count++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open the file.");
        }
    }

    // Helper method: Flip case of characters
    public static String flipCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                result.append(Character.toUpperCase(ch));
            else
                result.append(ch);
        }
        return result.toString();
    }
}
