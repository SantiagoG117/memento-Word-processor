/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see memento.WordProcessor.Demo
 * @see memento.WordProcessor.Document
 * @see memento.WordProcessor.DocumentState
 * Caretaker class: Responsible for the state management of the document. It tracks the changes of the Document.
 */

package memento.WordProcessor;

import java.util.Stack;

public class DocumentHistory {
    //Attributes
    private Stack<DocumentState> mementos = new Stack<>();
    private final DocumentState EMPTY_STATE = new DocumentState("","",0);


    //Public methods:

    /**
     *
     * @param state Takes the current state of the Document and stores it in the stack
     */
    public void recordState(DocumentState state) {
        mementos.push(state);
    }

    /**
     * Removes the current state of the Document from the history
     * If the history is already empty returns a DocumentState object with an empty content.
     * If the history only have one state left, removes the current state and returns a DocumentState object with an empty content.
     * @return the previous state of the Editor.
     */

    public DocumentState pop(){
        if (mementos.isEmpty())
            return EMPTY_STATE;
        if (lastItemOn(mementos)){
            mementos.pop();
            return EMPTY_STATE;
        }
        mementos.pop();
        return mementos.peek();

    }

    //Private methods:
    private boolean lastItemOn(Stack stack){
        return  stack.size() == 1;
    }



}
