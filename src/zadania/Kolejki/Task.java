package zadania.Kolejki;

public class Task implements Comparable<Task>{
    private String name;
    private String description;
    private TaskPriority priority;

    public Task(String name, String description, TaskPriority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Task task) {
        return -((Integer)this.getPriority().getWeight())
                .compareTo((Integer)task.getPriority().getWeight());
    }
}
