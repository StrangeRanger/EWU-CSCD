import java.util.ArrayList;

public class Document {
    // Each index represents a new line of text in the document.
    private final ArrayList<String> textArray = new ArrayList<>();
    private final String            name;  // Name of the document.

    /**
     * Constructor.
     * @param name Name of the new document.
     */
    public Document(String name) { this.name = name; }

    /**
     * Add 'text' to 'textArray' (the document).
     * @param text The text to be added.
     */
    public void Write(String text) { textArray.add(text); }

    /**
     * Remove 'text' from 'textArray' (the document).
     * @param text The text to be removed.
     */
    public void Erase(String text) { textArray.remove(text); }

    /**
     * Bold the 'text' at a specified index.
     * @param line The index to be bolded.
     */
    public void Bold(int line) {
        StringBuffer txt = new StringBuffer();

        txt.append("<b>").append(textArray.get(line)).append("</b>");
        textArray.set(line, txt.toString());
    }

    /**
     * Un-bold the 'text' at a specified index.
     * @param line The index to be un-bolded.
     */
    public void RemoveBold(int line) {
        String txt = textArray.get(line);
        txt        = txt.substring(3, txt.length() - 4);

        textArray.set(line, txt);
        System.out.println(txt);
    }

    /**
     * Return all the text in 'textArray'.
     * @return A string comprised of all the text from 'textArray'.
     */
    public String Read() {
        StringBuffer txt = new StringBuffer();

        txt.append("------Contents of: ").append(name).append("------\n");
        for (String s: textArray) { txt.append(s).append("\n"); }
        return txt.toString();
    }
}
