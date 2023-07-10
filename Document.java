/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see memento.WordProcessor.DocumentHistory
 * @see memento.WordProcessor.DocumentState
 * @see memento.WordProcessor.Demo
 * Originator class: Provides the necessary features we need from a word processor.
 * The Document has three fields, but we may add additional attributes in the future.
 * The user should be able to undo the changes to any of the attributes of the
 * class.
 */

package memento.WordProcessor;

import javax.print.Doc;

public class Document {
    //Attributes
    private String content;
    private String fontName;
    private int fontSize;

    //Public methods:

    /**
     * Saves the current state of the Document in an DocumentState object
     * Dependency relationship with the DocumentState class
     * @return an object of the DocumentState class
     */
    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

    /**
     *
     * @param state Takes the previous state of the Document and sets it as the current state
     */
    public void restoreState(DocumentState state){
        setContent(state.getCONTENT());
        setFontSize(state.getFONTSIZE());
        setFontName(state.getFONTNAME());
    }


    @Override
    public String toString() {
        return "Document:" +
                "content = " + content + '\'' +
                ", fontName = " + fontName + '\'' +
                ", fontSize = " + fontSize;
    }

    //Getters and setters
    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

}