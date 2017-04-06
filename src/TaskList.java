import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
  List<Task> taskList;

  public TaskList() {
    taskList = new ArrayList<>();
   }

  public void addTask(Task task) {
    taskList.add(task);
  }

  public void toListContent() {
    if (taskList.size() > 1) {
      for (Task task : taskList) {
        System.out.println("[ ] " + task.getDescription() + "\n");
      }
    } else {
        System.out.println("No todos for today! :)");
    }
  }

  public void splitLines(List<String> rawlines) {
    for (String s : rawlines) {
      String[] splittedList = s.split("%%");
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

  public void readAddToTaskList(String filepath) {
    List<String> rawLines = new ArrayList<>();
    try {
      Path path = Paths.get(filepath);
      rawLines = Files.readAllLines(path);

      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

