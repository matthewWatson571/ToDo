import java.io.*;
import java.util.Scanner;
/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class IO {
    public String fileName = "toDo.txt";
    public String fileName2 = "grocery.txt";
    public String fileName3 = "personal.txt";
    Scanner s = new Scanner(System.in);


    public void exportList() throws IOException {
        PrintWriter outFile= new PrintWriter(new FileWriter(fileName));
        for (int i=0; i<Doing.toDoList.size(); ++i ) {
            outFile.println(Doing.toDoList.get(i));
        }
        outFile.close();
        clear();
        System.out.println("List Exported to file ToDo.txt");
    }
    public void exportGroceryList() throws IOException {
        PrintWriter outFile= new PrintWriter(new FileWriter(fileName2));
        for (int i=0; i<Grocery.groceryList.size(); ++i ) {
            outFile.println(Grocery.groceryList.get(i));
        }
        outFile.close();
        clear();
        System.out.println("List Exported to file grocery.txt");
    }
    public void exportPersonalList() throws IOException {
        PrintWriter outFile= new PrintWriter(new FileWriter(fileName3));
        for (int i=0; i<Grocery.personalList.size(); ++i ) {
            outFile.println(Grocery.personalList.get(i));
        }
        outFile.close();
        clear();
        System.out.println("List Exported to file personal.txt");
    }

    public void clearList() {
        Doing.toDoList.clear();
        IO.clear();
        System.out.println("List Cleared");
    }

 public void loadToDoList() throws IOException{
       s = new Scanner(new FileReader(fileName));
        String itemLine;
        while (s.hasNextLine()){
            itemLine = s.nextLine();
            Doing.toDoList.add(itemLine);
        }
        clear();
     System.out.println("ToDo List Loaded.");
     s.close();
    }

    public void loadGroceryList() throws IOException{
        s = new Scanner(new FileReader(fileName2));
        String itemLine;
        while (s.hasNextLine()){
            itemLine = s.nextLine();
            Doing.toDoList.add(itemLine);
        }
        clear();
        System.out.println("Grocery List Loaded.");
        s.close();
    }

    public void loadPersonalList() throws IOException{
        s = new Scanner(new FileReader(fileName3));
        String itemLine;
        while (s.hasNextLine()){
            itemLine = s.nextLine();
            Doing.toDoList.add(itemLine);
        }
        clear();
        System.out.println("Personal List Loaded.");
        s.close();
    }
    public void viewList() throws IOException {
        if (Doing.toDoList.isEmpty()) {
            System.out.println("You have nothing to do!");
        }
        int index = 0;
        clear();
        for (int i = 0; i < Doing.toDoList.size(); ++i) {
            System.out.println((index++ + 1) + ":" + Doing.toDoList.get(i));
        }
        System.out.println("\n");
    }

    public static void clear(){
        for (int i = 0; i < 50; ++i)
            System.out.println("\n"); //Somebody please tell me if this is a terrible thing to do.
    }
}