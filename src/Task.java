public class Task {
  private String description;
  private String status;

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

  public void setDescription(String description) {
    this.description = description;
  }
}
