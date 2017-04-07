import java.util.ArrayList;

public class ToDoApp {
  public static void main(String[] args) {
    TaskList taskList = new TaskList();
    taskList.readAddToTaskList();
    Arguments argList = new Arguments();
    argList.addArgs("-l");
    argList.addArgs("-a");
    argList.addArgs("-c");
    argList.addArgs("-r");
    argList.addArgs("-la");

    if (args.length == 0) {
      System.out.println("JAVA Todo application\n" + "=======================\n" + "\n" + "Command line arguments:\n" + " -l   Lists all the tasks\n" + " -a   Adds a new task\n" + " -r   Removes an task\n" + " -c   Completes an task\n");
    } else if (args[0].equals("-la")) {
      taskList.toListContent();
    } else if (args[0].equals("-l")) {
      taskList.toListUndoneTask();
    } else if (args[0].equals("-a") && args.length == 2) {
      taskList.addTask(new Task(args[1],"undone"));
      taskList.toListContent();
    } else if (args[0].equals("-a") && args.length != 2) {
      System.out.println("Unable to add: no task provided");
    } else if (args[0].equals("-c") && args.length == 2) {
      try {
        taskList.getTask(Integer.valueOf(args[1]) - 1).setStatusDone();
        taskList.toListContent();
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Unable to check: index is out of bound");
      } catch (NumberFormatException n) {
        System.out.println("Unable to check: index is not a number");
      }
    } else if (args[0].equals("-r") && args.length == 2) {
      try {
        taskList.removeTask(Integer.parseInt(args[1]) - 1);
        taskList.toListContent();
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Unable to remove: index is out of bound");
      } catch (NumberFormatException n) {
        System.out.println("Unable to remove: index is not a number");
      }
    } else if (!argList.equals(args[0])) {
      System.out.println("Unsupported argument");
    }
    taskList.overwriteFile();
  }
}



