public class DocumentWriteCommand implements Command {
    private Document document;
    private String   text;

    /**
     * @param document Document object passed from DocumentInvoker class.
     * @param text     Text to be added to the document.
     */
    public DocumentWriteCommand(Document document, String text) {
        this.document = document;
        this.text     = text;
        document.Write(text);
    }

    @Override
    public void undo() {
        document.Erase(text);
    }

    @Override
    public void redo() {
        document.Write(text);
    }
}
