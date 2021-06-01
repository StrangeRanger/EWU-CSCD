import java.util.ArrayList;

public class DocumentInvoker {
    // Keeps a history of every command used.
    private ArrayList<Command> commands = new ArrayList<>();
    private Document           currentDoc;

    /**
     * Constructor: instantiates a Document object.
     * @param name Name of the new document.
     */
    public DocumentInvoker(String name) { currentDoc = new Document(name); }

    /**
     * Instantiate a 'DocumentWriteCommand' object to add 'text' to the document.
     * @param text Text to be added to the document.
     */
    public void Write(String text) {
        DocumentWriteCommand cmd = new DocumentWriteCommand(currentDoc, text);
        // Add the used command to array.
        commands.add(cmd);
    }

    /**
     * Instantiate a 'DocumentWriteCommand' object to erase 'text' from the document.
     * @param text Text to be erased from the document.
     */
    public void Erase(String text) {
        DocumentEraseCommand cmd = new DocumentEraseCommand(currentDoc, text);
        commands.add(cmd);
    }

    /**
     * Instantiate a 'DocumentBoldCommand' object to bold the text at 'index' in the
     * document.
     * @param line Index of text to be bolded.
     */
    public void Bold(int line) {
        DocumentBoldCommand cmd = new DocumentBoldCommand(currentDoc, line);
        commands.add(cmd);
    }

    /**
     * Instantiate a 'DocumentRemoveBoldCommand' object to un-bold the text at 'index'
     * in the document.
     * @param line Index of text to be un-bolded.
     */
    public void RemoveBold(int line) {
        DocumentRemoveBoldCommand cmd = new DocumentRemoveBoldCommand(currentDoc, line);
        commands.add(cmd);
    }

    /**
     * Undo the undo...
     * @param level Index...
     */
    public void Redo(int level) {
        Command tmp;
        System.out.println("---- Redo level " + level);
        tmp = commands.get(level);
        tmp.redo();
    }

    /**
     * Undo a previous action.
     * @param level Index...
     */
    public void Undo(int level) {
        Command tmp;
        System.out.println("---- Undo level " + level);
        tmp = commands.get(level);
        tmp.undo();
    }

    /** ... */
    public String Read() { return currentDoc.Read(); }

    /** ... */
    public void printCommmandBuffer() {
        StringBuffer txt = new StringBuffer();

        txt.append("----Commands issued-----");
        for (int i = 0; i < commands.size(); i++) {
            txt.append(i).append(":").append(commands.get(i)).append("\n");
        }
        System.out.println(txt);
    }
}
