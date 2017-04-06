import java.util.ArrayList;
import java.util.List;

public class TaskList {
  static List<Task> taskList;

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
}

