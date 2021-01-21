public class Task {
    protected final String description;
    protected boolean isDone;

    Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    void markAsDone() {
        this.isDone = true;
    }

    String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        if (isDone) {
            return "[X] " + description;
        } else {
            return "[ ] " + description;
        }
    }
}
