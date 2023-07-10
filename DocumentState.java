/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see memento.WordProcessor.Document
 * @see memento.WordProcessor.DocumentHistory
 * @see memento.WordProcessor.Demo
 * Memento class: Responsible for storing the state of the Document at a given time. We can store all the future
 * attributes of the Document in this class.
 */

package memento.WordProcessor;

public class DocumentState {
    //Attributes
     /*
         By setting the attributes as final, we make sure that their values won't be accidentally changed in out program.
     */
    private final String CONTENT;
    private final String FONTNAME;
    private final int FONTSIZE;

    //Constructor
    public DocumentState(String content, String fontName, int fontSize) {
        this.CONTENT = content;
        this.FONTNAME = fontName;
        this.FONTSIZE = fontSize;
    }

    @Override
    public String toString() {
        return "content='" + CONTENT + '\'' +
                ", fontName='" + FONTNAME + '\'' +
                ", fontSize='" + FONTSIZE;
    }

    //Getters and setters
    public String getCONTENT() {
        return CONTENT;
    }

    public String getFONTNAME() {
        return FONTNAME;
    }

    public int getFONTSIZE() {
        return FONTSIZE;
    }
}
