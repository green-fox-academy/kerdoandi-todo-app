public class ToDoApp {


  public static void main(String[] args) {
    TaskList taskList = new TaskList();
    taskList.readAddToTaskList();

    if (args.length == 0) {
      System.out.println("Python Todo application\n" + "=======================\n" + "\n" + "Command line arguments:\n" + " -l   Lists all the tasks\n" + " -a   Adds a new task\n" + " -r   Removes an task\n" + " -c   Completes an task\n");
    } else if (args[0].equals("-l")) {
      taskList.toListContent();
    } else if (args[0].equals("-a") && args.length == 2) {
      taskList.addTask(new Task(args[1],"undone"));
    } else if (args[0].equals("-a") && args.length != 2) {
      System.out.println("Unable to add: no task provided");
    }
    taskList.overwriteFile();
  }
}



