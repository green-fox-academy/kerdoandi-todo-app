public class ToDoApp {
  public static void main(String[] args) {


    if (args.length == 0) {

    System.out.println("Python Todo application\n" +
            "=======================\n" +
            "\n" +
            "Command line arguments:\n" +
            " -l   Lists all the tasks\n" +
            " -a   Adds a new task\n" +
            " -r   Removes an task\n" +
            " -c   Completes an task\n");
    }


    Tasks tasks = new Tasks();

    if (args[0].equals("-l") && args.length == 1) {
      System.out.println(tasks.toString());
    }
  }
}



