import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DairyService {
    public static void addEntry(){
        Scanner sc = new Scanner(System.in);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // year-month-day
        String dateOnly = sdf.format(date);

        System.out.println("Write your thoughts...\n");
        String txt = sc.nextLine();

        try (FileWriter fw = new FileWriter("diary.txt", true)) {
            fw.write(dateOnly + "|" + txt + "\n");
        }
        catch(Exception e){
            System.out.println("Invalid");
        }
    }

    public static void viewEntry(){
        try (BufferedReader br = new BufferedReader(new FileReader("diary.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");

                DiaryEntry entry = new DiaryEntry(parts[0],parts[1]);
                System.out.println(entry);

            }

        } catch (FileNotFoundException e) {
            System.out.println("No diary entries yet.");
            return;
        } catch (IOException e) {
            System.out.println("Error reading diary file.");
            return;
        }
    }
}
