import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AuthService {
    private static final String filename = "password.txt";

    public static boolean login(){
        Scanner sc = new Scanner(System.in);

        try{
            File file = new File(filename);
            if(!file.exists()){
                System.out.println("Set new password\nEnter new password: ");
                String pass = sc.nextLine();

                String hash = HashUtil.hash(pass);
                try (FileWriter fw = new FileWriter(filename)) {
                    fw.write(hash);
                }
                System.out.println("password set. login again.");
                return false;
            }

            System.out.print("enter password: ");
            String input = sc.nextLine();

            String storedHash = new BufferedReader(
                    new FileReader(filename)
            ).readLine();

            if(HashUtil.hash(input).equals(storedHash)){
                return true;
            }
            else{
                System.out.println("Wrong password");
                return false;
            }
        }

        catch(Exception e){
            System.out.println("Error in login");
            return false;
        }

    }
}
