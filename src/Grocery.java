import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/14/16.
 */
public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();
    public static ArrayList<String> personalList = new  ArrayList<>();
    Scanner s = new Scanner(System.in);
    IO io = new IO();

    public void addToGroceryList() throws IOException {
        System.out.println("Would you like to add something to your Grocery list?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            IO.clear();
            System.out.println("What would you like to add?");
            String listItem = s.nextLine();
            groceryList.add(listItem);
            IO.clear();
            System.out.println("you've added " + listItem);
            System.out.println("Would you like to add another item?");
            response = s.nextLine();
        }
            io.exportGroceryList();
    }

    public void addToPersonalList() throws IOException {
        System.out.println("Would you like to add something to your Personal item list?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            IO.clear();
            System.out.println("What would you like to add?");
            String listItem = s.nextLine();
            personalList.add(listItem);
            IO.clear();
            System.out.println("you've added " + listItem);
            System.out.println("Would you like to add another item?");
            response = s.nextLine();
        }

    }
    public void viewGroceryList() throws IOException {
        if (Grocery.groceryList.isEmpty()) {
            System.out.println("You have nothing on your grocery list, good for you!");
        }
        int index = 0;
        IO.clear();
        for (int i = 0; i < Grocery.groceryList.size(); ++i) {
            System.out.println((index++ + 1) + ":" + Grocery.groceryList.get(i));
        }
        System.out.println("\n");
    }
    public void viewPersonalList() throws IOException {
        if (Grocery.personalList.isEmpty()) {
            System.out.println("You have nothing on your Personal item list");
        }
        int index = 0;
       IO.clear();
        for (int i = 0; i < Grocery.personalList.size(); ++i) {
            System.out.println((index++ + 1) + ":" + Grocery.personalList.get(i));
        }
        System.out.println("\n");
    }
}
