/**
 * Represents a command to delete a task from the task list
 */

public class DeleteCommand extends Command {
    /**
     * Constructor takes in a <code>fullCommand</code>, the full user input
     * consisting of the desired command, and a <code>action</code> which
     * in this case should specify "delete"
     * @param fullCommand the full user input
     * @param action should be "delete"
     */
    public DeleteCommand(String fullCommand, String action) {
        super(fullCommand, action);
    }

    /**
     * Deletes a task from the given task list
     * @param tasks the task list consisting the task to be deleted
     * @throws DukeException
     */
    @Override
    public void execute(TaskList tasks) throws DukeException {
        Ui.printLine();
        int taskNo = Integer.parseInt(String.valueOf(fullCommand.charAt(7))) - 1;
        String toPrint = tasks.remove(taskNo);
        Ui.print(
                Aligner.align("Alright! I've removed this task:"));
        Ui.print(
                Aligner.align(toPrint));
        Ui.print(
                Aligner.align("Now you have a whopping "
                        + tasks.size()
                                + " task(s) in the list."));
        Ui.printLine();
    }
}