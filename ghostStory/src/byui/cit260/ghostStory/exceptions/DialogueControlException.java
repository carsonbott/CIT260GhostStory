/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.exceptions;

/**
 *
 * @author carsonbott
 */
public class DialogueControlException extends Exception {

    /**
     * Creates a new instance of <code>DialogueControlException</code> without
     * detail message.
     */
    public DialogueControlException() {
    }

    /**
     * Constructs an instance of <code>DialogueControlException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DialogueControlException(String msg) {
        super(msg);
    }

    public DialogueControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DialogueControlException(Throwable cause) {
        super(cause);
    }

    public DialogueControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
