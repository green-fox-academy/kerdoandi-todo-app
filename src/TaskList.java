import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
  public static String filepath = "tasks.txt";
  List<Task> taskList;

  public TaskList() {
    taskList = new ArrayList<>();
   }

  public void addTask(Task task) {
    taskList.add(task);
  }

  public void toListContent() {
    if (taskList.size() > 1) {
      int counter = 0;
      for (Task task : taskList) {
        counter++;
        System.out.println(counter + " - " + "[ ] " + task.getDescription());
      }
    } else {
        System.out.println("No todos for today! :)");
    }
  }

  public void splitLines(List<String> lines) {
    for (String s : lines) {
      String[] splittedList = s.split(Task.TASK_SPLITTER);
      String taskDescript = splittedList[0];
      String taskStatus;
      if (splittedList.length > 1) {
        taskStatus = splittedList[1];
      } else {
        taskStatus = "undone";
      }
      taskList.add(new Task(taskDescript, taskStatus));
    }
  }

  public void readAddToTaskList() {
    List<String> rawLines = new ArrayList<>();
    try {
      Path path = Paths.get(filepath);
      rawLines = Files.readAllLines(path);
      splitLines(rawLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String toString() {
    String result = "";
    for (Task t : taskList) {
      result += t.toString() + "\n";
    }
    return result;
  }

  private static void writeToFile(List<String> data) {
    Path path = Paths.get(filepath);
    try {
      Files.write(path, data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void overwriteFile() {
    try {
      File file = new File(filepath);
      FileWriter fileWriter = new FileWriter(file);
      fileWriter.write(this.toString());
      fileWriter.flush();
      fileWriter.close();
    } catch (IOException e) {
      System.out.println("unable to update the file");
    }
  }
}

