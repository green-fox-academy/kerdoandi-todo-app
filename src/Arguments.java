import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/7/2017.
 */
public class Arguments {
  List<String> argList;


  public Arguments() {
    argList = new ArrayList<>();
  }

  public List<String> getArgList() {
    return argList;
  }

  public void setArgList(List<String> argList) {
    this.argList = argList;
  }

  public void addArgs(String newArg) {
    argList.add(newArg);
  }
}







