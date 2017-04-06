public class Task {
  private String description;
  private String status;
  public static final String TASK_SPLITTER = "%%";

  public Task(String description, String status) {
    this.description = description;
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    String result = getDescription() + TASK_SPLITTER + getStatus();
    return result;
  }
}
