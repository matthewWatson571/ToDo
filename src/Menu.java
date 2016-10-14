import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Menu {
    IO io = new IO();
    Grocery g= new Grocery();
    Doing d = new Doing();

    public void menuSwitch() throws IOException {
        Doing one = new Doing();
        IO two = new IO();
        String fileName = "Help.txt";
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = Menu.showMenu();
            switch (menuItem) {

                case 1:
                    addListMenu();
                    break;
                case 2:
                    one.removeFromList();
                    break;
                case 3:
                    two.clear();
                    viewListMenu();
                    break;
                case 4:
                    one.priority();
                    break;
                case 5:
                    two.clear();
                    loadListMenu();
                    break;
                case 6:
                    two.exportList();
                    break;
                case 7:
                    two.clearList();
                    break;
                case 8:
                    Desktop.getDesktop().open(new File(fileName));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }


    public void loadListMenu() throws IOException {
        System.out.println("Which list would you like to load?");
        int menuItem = -1;
        if (menuItem != 0) {
            menuItem = Menu.showListMenu();
            switch (menuItem) {

                case 1:
                    io.loadToDoList();
                    break;
                case 2:
                    io.loadGroceryList();
                    break;
                case 3:
                    io.loadPersonalList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose 1, 2, or 3");
            }
        }
    }

    public void addListMenu() throws IOException {
        System.out.println("Which list would you like to add to?");
        int menuItem = -1;
        if (menuItem != 0) {
            menuItem = Menu.showListMenu();
            switch (menuItem) {
                case 1:
                    d.addToList();
                    break;
                case 2:
                    g.addToGroceryList();
                    break;
                case 3:
                    g.addToPersonalList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose 1, 2, or 3");
            }
        }
    }
    public void viewListMenu() throws IOException {
        System.out.println("Which list would you like to view?");
        int menuItem = -1;
        if (menuItem != 0) {
            menuItem = Menu.showListMenu();
            switch (menuItem) {
                case 1:
                    IO.clear();
                    io.viewList();
                    break;
                case 2:
                    IO.clear();
                    g.viewGroceryList();
                    break;
                case 3:
                    IO.clear();
                    g.viewPersonalList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose 1, 2, or 3");
            }
        }
    }
    public static int showMenu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("---ToDoly---");
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
    static int showListMenu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("0. Exit to Main Menu");
        System.out.println("1. ToDo List");
        System.out.println("2. Grocery List");
        System.out.println("3. Personal Item List");
        choice = input.nextInt();
        return choice;
    }

}