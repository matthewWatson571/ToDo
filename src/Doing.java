import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Matthew.Watson on 10/11/16.
 */

public class Doing {
    public static ArrayList<String> toDoList = new ArrayList<>();

    public Scanner s = new Scanner(System.in);
    public void addToList() throws IOException {
        System.out.println("Would you like to add something to your To Do list?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            IO.clear();
            System.out.println("What would you like to add?");
            String listItem = s.nextLine();
            toDoList.add(listItem);
            IO.clear();
            System.out.println("you've added " + listItem);
            System.out.println("Would you like to add another item?");
            response = s.nextLine();
        }
            IO.clear();
    }

    public void removeFromList() {
        Scanner removeItem = new Scanner(System.in);
        System.out.println("would you like to remove an item from your list?");
        String response = s.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            int index = 0;
            for (int i = 0; i < toDoList.size(); ++i) {
                if (i == 0) {
                    IO.clear();
                }
                System.out.println((index++ + 1) + ":" + toDoList.get(i));
            }
            System.out.println("\n");
            System.out.println("Which item would you like to remove?");
            int removeOne = (removeItem.nextInt() - 1);
            toDoList.remove(removeOne);
            IO.clear();
            System.out.println("Item removed from list.");
        }
    }

    public void priority() throws IOException {
        System.out.println("would you like to prioritize your ToDo list?");
        String response = s.nextLine();
        IO io = new IO();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            IO.clear();
            io.viewList();
            System.out.println("Which item would you like to star as the highest priority?");
            int selection = (s.nextInt() - 1);
            String starred = "****" + toDoList.get(selection) + "****";
            toDoList.remove(selection);
            toDoList.add(0, starred);
            IO.clear();
            System.out.println(starred);
            System.out.println("\n");
        }
    }
}

