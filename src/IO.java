import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        Desktop.getDesktop().open(new File(fileName));
    }

    public void loadList() throws IOException{
        Scanner s = new Scanner(new File(fileName));
        while (s.hasNext()){
            toDoList.add(s.nextLine());
        }
        s.close();
    }
}
