import java.util.Scanner;




public class DairyApp {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Login...");
        if(!AuthService.login()){
            //System.out.println("error");
            return;
        }



        while(true) {
            System.out.print("Welcome to CLI Diary Application \nEnter the below option \n1.Add new entry \n2.View entry\n3.Exit\nEnter your option: ");
            int n = sc.nextInt();
            System.out.println("---------------");
            sc.nextLine();
            switch (n) {
                case 1:
                    DairyService.addEntry();
                    break;
                case 2:
                    DairyService.viewEntry();
                    break;
                case 3:
                    System.out.println("Byee");
                    return;
            }
        }

    }
}
