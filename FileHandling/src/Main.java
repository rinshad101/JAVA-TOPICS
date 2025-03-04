import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "notes.txt";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean numm = true;

        while (numm) {
            System.out.println("\n Welcome to Note-Taking App");
            System.out.println("1. Write a note");
            System.out.println("2. Read all notes");
            System.out.println("3. Delete notes");
            System.out.println("4. Exit");
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
                    deleteNote();
                    break;
                case 4:
                    System.out.println(" Exiting... Goodbye!");
                    scanner.close();
                    numm = false;
                    return;
                default:
                    System.out.println(" Invalid option. Try again.");
            }
        }
    }

    //  Writing Notes to File
    private static void writeNote(Scanner scanner) {
        System.out.print("Enter your note: ");
        String note = scanner.nextLine();
        String timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write("["+ timestamp +"]  -" + note);
            writer.newLine();
            System.out.println(" Note saved successfully.");
        } catch (IOException e) {
            System.out.println(" Error writing to file.");
            e.printStackTrace();
        }
    }

    //  Reading Notes from File
    private static void readNotes() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println(" No notes found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            System.out.println("\n Your Notes:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(" Error reading the file.");
            e.printStackTrace();
        }
    }
    // deleting all note
    private static void deleteNote(){
        File file = new File(FILE_NAME);
        if (file.exists()){
            if (file.delete()){
                System.out.println("notes  deleted successfully");
            } else {
                System.out.println("can't delete note");
            }
        } else {
            System.out.println("cannot find note....");
        }
    }
}
