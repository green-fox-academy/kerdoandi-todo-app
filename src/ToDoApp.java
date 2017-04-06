import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoApp {
  private static String filepath = "tasks.txt";

  public static void main(String[] args) {
    TaskList taskList = new TaskList();

    if (args.length == 0) {
      System.out.println("Python Todo application\n" + "=======================\n" + "\n" + "Command line arguments:\n" + " -l   Lists all the tasks\n" + " -a   Adds a new task\n" + " -r   Removes an task\n" + " -c   Completes an task\n");
    }
  }
}



