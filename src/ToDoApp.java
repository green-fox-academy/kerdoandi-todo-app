import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/6/2017.
 */
public class ToDoApp {
  public static void main(String[] args) {

    String filepath = "tasks.csv";

    System.out.println("Python Todo application\n" +
            "=======================\n" +
            "\n" +
            "Command line arguments:\n" +
            " -l   Lists all the tasks\n" +
            " -a   Adds a new task\n" +
            " -r   Removes an task\n" +
            " -c   Completes an task\n");


    System.out.println(readAllLinesFromFile(filepath));

  }


  public static List<String> readAllLinesFromFile(String filepath) {

    List<String> tasksListFromFile = new ArrayList<>();
    try {
      Path path = Paths.get(filepath);
      tasksListFromFile = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return tasksListFromFile;
  }
}

