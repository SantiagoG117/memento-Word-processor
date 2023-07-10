/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see memento.WordProcessor.Document
 * @see memento.WordProcessor.DocumentHistory
 * @see memento.WordProcessor.DocumentState
 * This class is responsible to test the functionality of the word processor.
 */

package memento.WordProcessor;

public class Demo {
    public static void show(){
        /*
        Declarations
         */
        var document = new Document();
        var history = new DocumentHistory();

        /*
        Operations:
         */

        //Set the state of the document:
        document.setContent("Content A");

//      The document takes a screenshot of its current state and saves it in an DocumentState object.
//      Then ask the history object to store the current state in history.
        history.recordState(document.createState());

        //Set the state of the document:
        document.setFontName("Font name A");

//      The document takes a screenshot of its current state and saves it in an DocumentState object.
//      Then ask the history object to store the current state in history.
        history.recordState(document.createState());


        //Set the state of the document
        document.setFontSize(1);


        // The document takes a screenshot of its current state and saves it in an DocumentState object.
        //Then ask the history object to store the current state in history.
        history.recordState(document.createState());

        //Clear all the previous states of the Document.
        document.restoreState(history.pop());
        document.restoreState(history.pop());
        document.restoreState(history.pop());
    }
}
