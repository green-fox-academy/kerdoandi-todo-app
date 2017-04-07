public class Task {
  private String description;
  private String status;
  static final String TASK_SPLITTER = "%%";

  Task(String description, String status) {
    this.description = description;
    this.status = status;
  }

  String getStatus() {
    return this.status;
  }

  void setStatusDone() {
    this.status = "done";
  }

  String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    String result = getDescription() + TASK_SPLITTER + getStatus();
    return result;
  }
}
