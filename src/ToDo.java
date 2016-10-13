import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;
/**
 * Created by Matthew.Watson on 10/11/16.
 */
public class ToDo {
    public static void main(String[] args) throws IOException{
        Doing one = new Doing();
        IO two = new IO();
        String fileName="Help.txt";
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {

                case 1:one.addToList();
                    break;
                case 2:one.removeFromList();
                    break;
                case 3:one.viewList();
                    break;
                case 4:one.priority();
                    break;
                case 5:two.loadList();
                    break;
                case 6:two.exportList();
                    break;
                case 7:one.clearList();
                    break;
                case 8:Desktop.getDesktop().open(new File(fileName));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }

    static int menu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("---Main Menu---");
        System.out.println("0. Exit the program");
        System.out.println("1. Add an Item");
        System.out.println("2. Remove an Item");
        System.out.println("3. View List");
        System.out.println("4. Prioritize List");
        System.out.println("5. Load list from File");
        System.out.println("6. Export list to File");
        System.out.println("7. Clear the List");
        System.out.println("8. HELP!");
        System.out.println();
        System.out.println("Please Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }
}