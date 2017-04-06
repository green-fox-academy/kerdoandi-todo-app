import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/6/2017.
 */
public class Tasks {

  List<String> taskList = new ArrayList<>();
  private static final String FILEPATH = "tasks.txt";
  String descripton;
  String status;


  public Tasks(String descripton, String status) {
    this.descripton = descripton;
    this.status = status;
    taskList = readAllLinesFromFile(FILEPATH);
  }


  @Override
  public String toString() {
    return "[ ] -" + descripton + ", " + status;
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

