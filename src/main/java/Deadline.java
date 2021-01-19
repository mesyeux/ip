public class Deadline extends Task {
    private final String dateBy; //deadline of task

    public Deadline(String description, int id, String dateBy) {
        super(description, id);
        this.dateBy = dateBy;
    }

    public String getDeadline() { //get deadline in format of String eg. (by: Sunday)
        return "(by: " + dateBy + ")";
    }

    @Override
    public String toString() {
        if (this.isDone) {
            return "[D][X] " + this.description;
        } else {
            return "[D][ ] " + this.description;
        }
    }
}
