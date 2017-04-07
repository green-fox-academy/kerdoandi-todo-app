import java.util.ArrayList;
import java.util.List;

public class Arguments {
  private List<String> argList;
  Arguments() {
    argList = new ArrayList<>();
  }

  void addArgs(String newArg) {
    argList.add(newArg);
  }

  @Override
  public String toString() {
    return "argList: " + argList;
  }
}







