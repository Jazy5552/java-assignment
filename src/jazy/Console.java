
package jazy;
import java.util.Scanner;
public class Console {
    
    public String getMainMenu() {
       
       String menu = "";
       menu += "Welcome to MDC School Registration System!\n";
       menu += "------------------------------------------\n";
       menu += "Choose from the following menu options:\n";
       menu += "(1) Create a new student\n";
       menu += "(2) Create a course\n";
       menu += "(3) Register a student for a course\n";
       menu += "(4) Display student schedule\n";
       menu += "(5) Display course roster\n";
       menu += "------------------------------------------\n";
       return menu;
   }

    
    /*
    public static void main(String[] args) {
        Console console = new Console();
        RegistrationSystem rs = new RegistrationSystem();
        System.out.println(console.getMainMenu());
        
       Scanner in = new Scanner(System.in);
       int choice;
       
       System.out.println(">");
       choice = in.nextInt();
       
       if (choice == 1)
       {
           
           System.out.println("Enter your first name:");
           String first = in.nextLine();
           System.out.println("Enter your last name:");
           String last = in.nextLine();
           rs.createStudent(first, last);
       }
    }
    */
}
