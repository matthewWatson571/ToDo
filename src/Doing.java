import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Matthew.Watson on 10/11/16.
 */

public class Doing {
    public static ArrayList<String> toDoList = new ArrayList<>();
    public Scanner s = new Scanner(System.in);
    public String fileName = "toDo.txt";

    public void addToList() throws IOException {
        System.out.println("Would you like to add something to your To Do list?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            System.out.println("What would you like to add?");
            String listItem = s.nextLine();
            toDoList.add(listItem);
            IO.clear();
            System.out.println("you've added " + listItem);
            System.out.println("Would you like to add another item?");
            response = s.nextLine();
        }
    }

    public void removeFromList() {
        Scanner removeItem = new Scanner(System.in);
        System.out.println("would you like to remove an item from your list?");
        String response = s.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            int index = 0;
            for (int i = 0; i < toDoList.size(); ++i) {
                if(i==0){
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

    public void viewList() throws IOException {
        if (toDoList.isEmpty()){
                System.out.println("You have nothing to do!");
        }
        int index = 0;
        for (int i = 0; i < toDoList.size(); ++i) {
            System.out.println((index++ + 1) + ":" + toDoList.get(i));
        }
        System.out.println("\n");
    }


    public void priority() throws IOException {
        System.out.println("would you like to prioritize your list?");
        String response = s.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            IO.clear();
            viewList();
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
    public class GroceryList {//make this make a list

        public void groceryList() throws IOException{
            double newItem;
            String anotherItem;

            System.out.println("How much is your first item? ");
            newItem = s.nextDouble();
            ArrayList<Double> groceryList = new ArrayList<>();
            groceryList.add(newItem);
            System.out.println("Would you like to add another item?");
            anotherItem = s.nextLine();
            while (anotherItem.equalsIgnoreCase("y") || anotherItem.equalsIgnoreCase("yes")) {
                System.out.println("add item:");
                newItem = s.nextDouble();
                groceryList.add(newItem);
                System.out.println("would you like to add another item?");
                anotherItem = s.nextLine();
                double afterTax = 0;
                double total = 0;
                for (int i = 0; i < groceryList.size(); ++i) {
                    total += groceryList.get(i);
                    afterTax = (total * .06) + total;
                }
                BigDecimal convertedTotal = new BigDecimal(afterTax);
                BigDecimal roundedTotal = convertedTotal.setScale(2, RoundingMode.DOWN);
                IO.clear();
                IO.groceryOut(roundedTotal);
                System.out.println("Your total after tax is $" + roundedTotal);
            }
        }
    }
}

