import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tasks {

  static List<String> taskList = new ArrayList<>();
  private static String filepath = "tasks.txt";


  public Tasks() {
    taskList = readAllLinesFromFile(filepath);
   }


  @Override
  public String toString() {
    if (taskList.size() > 1) {
      int counter = 0;
      String description = "";
      for (int i = 0; i < taskList.size(); i++) {
        counter++;
        description += counter + " - " + taskList.get(i) + "\n";
      }
      return description;
    } else {
      return "No todos for today! :)";
    }
  }

  void addTask(String newTask) {
    taskList.add(newTask);
    writeToFile(taskList);
  }

  private static void writeToFile(List<String> data) {
    Path path = Paths.get(filepath);
    try {
      Files.write(path, taskList);
    } catch (IOException e) {
      e.printStackTrace();
    }
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

