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
      System.out.println("Python Todo application\n" + "=======================\n" + "\n" + "Command line arguments:\n" + " -l   Lists all the tasks\n" + " -a   Adds a new task\n" +  " -r   Removes an task\n" + " -c   Completes an task\n");
    }

    if (args[0].equals("-l") && args.length == 1) {
      taskList.toListContent();
    }
//
//    if (args[0].equals("-a") && args.length == 2) {
//      String newDescription = args[1];
//      tasks.addTask(newDescription);
//    } else if (args[0].equals("-a") && args.length != 2) {
//      System.out.println("Unable to add: no task provided");
//    }
//
//    if (args[0].equals("-c") && args.length == 2) {
//      System.out.println(tasks.toString());
//    }
  }






//  private static void writeToFile(List<String> data) {
//    Path path = Paths.get(filepath);
//    try {
//      Files.write(path, tasks);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }


  public static List<String> readAllLinesFromFile(String filepath) {
    List<String> rawLines = new ArrayList<>();
    try {
      Path path = Paths.get(filepath);
      rawLines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return rawLines;
  }

  private static void writeToFile(List<String> data) {
    Path path = Paths.get(filepath);
    try {
      Files.write(path, data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}




