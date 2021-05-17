/** A command designed to add bolded to in the document. */
public class DocumentBoldCommand implements Command {
    private Document document;
    private int      line;

    /**
     * @param document Document object passed from the DocumentInvoker class.
     * @param line     Index to be bolded.
     */
    public DocumentBoldCommand(Document document, int line) {
        this.document = document;
        this.line     = line;
        document.Bold(line);
    }

    @Override
    public void undo() {
        document.RemoveBold(line);
    }

    @Override
    public void redo() {
        document.Bold(line);
    }
}
