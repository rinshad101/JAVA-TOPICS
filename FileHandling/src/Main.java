import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n📌 Welcome to Note-Taking App");
            System.out.println("1. Write a note");
            System.out.println("2. Read all notes");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    writeNote(scanner);
                    break;
                case 2:
                    readNotes();
                    break;
                case 3:
                    System.out.println("📌 Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }
    }

    // ✅ Writing Notes to File
    private static void writeNote(Scanner scanner) {
        System.out.print("Enter your note: ");
        String note = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write("- " + note);
            writer.newLine();
            System.out.println("✅ Note saved successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file.");
            e.printStackTrace();
        }
    }

    // ✅ Reading Notes from File
    private static void readNotes() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("❌ No notes found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            System.out.println("\n📌 Your Notes:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading the file.");
            e.printStackTrace();
        }
    }
}
