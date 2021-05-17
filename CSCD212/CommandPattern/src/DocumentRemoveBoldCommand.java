public class DocumentRemoveBoldCommand implements Command {
    private Document document;
    private int      line;

    /**
     * @param document Document object passed from the DocumentInvoker class.
     * @param line     Index to be un-bolded.
     */
    public DocumentRemoveBoldCommand(Document document, int line) {
        this.document = document;
        this.line     = line;
        document.RemoveBold(line);
    }

    @Override
    public void undo() {
        document.Bold(line);
    }

    @Override
    public void redo() {
        document.RemoveBold(line);
    }
}
