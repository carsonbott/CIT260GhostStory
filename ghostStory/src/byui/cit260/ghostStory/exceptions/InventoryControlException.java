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
public class InventoryControlException extends Exception {

    /**
     * Creates a new instance of <code>InventoryControlException</code> without
     * detail message.
     */
    public InventoryControlException() {
    }

    /**
     * Constructs an instance of <code>InventoryControlException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InventoryControlException(String msg) {
        super(msg);
    }

    public InventoryControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryControlException(Throwable cause) {
        super(cause);
    }

    public InventoryControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
