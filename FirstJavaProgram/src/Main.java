import java.io.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hiiiiiiiiiiiiiooo");
        List<String> name = new ArrayList<>();

        name.add("rinshad");
        name.add("aginas");
        name.add("amir");
        name.add("minhaj");

        for (String b : name){
            System.out.println(b);

        }
        try {
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\sample11.txt"));
            String line;
            while ((line = file.readLine()) != null){
                System.out.println(line);
            }
            file.close();
        } catch (IOException e){
            System.out.println("");
            e.printStackTrace();
        }

    }
}