/** A command designed to erase some text from the document. */
public class DocumentEraseCommand implements Command {
    private Document document;
    private String   text;

    /**
     * @param document Document object passed from the DocumentInvoker class.
     * @param text     Text to be erased from the document.
     */
    public DocumentEraseCommand(Document document, String text) {
        this.document = document;
        this.text     = text;
        document.Erase(text);
    }

    @Override
    public void undo() {
        document.Write(text);
    }

    @Override
    public void redo() {
        document.Erase(text);
    }
}
