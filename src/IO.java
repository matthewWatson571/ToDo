import java.io.*;
import java.util.Scanner;
/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class IO extends Doing{

    public void exportList() throws IOException {
        PrintWriter outFile= new PrintWriter(new FileWriter(fileName));
        for (int i=0; i<toDoList.size(); ++i ) {
            outFile.println(toDoList.get(i));
        }
        outFile.close();
        IO.clear();
        System.out.println("List Exported.");
    }
    public void clearList() {
        toDoList.clear();
        IO.clear();
        System.out.println("List Cleared");
    }
    public void loadList() throws IOException{
        Scanner s = new Scanner(new File(fileName));
        while (s.hasNext()){
            toDoList.add(s.nextLine());
        }
        System.out.println("List Loaded.");
        s.close();
    }

    public static void clear(){
     for (int i = 0; i < 50; ++i)
         System.out.println("\n"); //Somebody please tell me if this is a terrible thing to do.
 }


}