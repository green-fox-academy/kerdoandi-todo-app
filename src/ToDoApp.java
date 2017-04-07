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

    if (args.length == 0) {
      System.out.println("JAVA Todo application\n" + "=======================\n" + "\n" + "Command line arguments:\n" + " -l   Lists all the tasks\n" + " -a   Adds a new task\n" + " -r   Removes an task\n" + " -c   Completes an task\n");
    } else if (args[0].equals("-l")) {
      taskList.toListContent();
    } else if (args[0].equals("-a") && args.length == 2) {
      taskList.addTask(new Task(args[1],"undone"));
    } else if (args[0].equals("-a") && args.length != 2) {
      System.out.println("Unable to add: no task provided");
    } else if (args[0].equals("-c") && args.length == 2) {
      taskList.getTask(Integer.valueOf(args[1]) - 1).setStatusDone();
    } else if (args[0].equals("-r") && args.length == 2) {
      taskList.removeTask(Integer.valueOf(args[1]) - 1);
    } else if (!args[0].equals(argList)) {
      System.out.println("Unsupported argument");
    }
    taskList.overwriteFile();
  }
}



