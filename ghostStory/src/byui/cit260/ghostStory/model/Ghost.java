/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author carsonbott
 */
public enum Ghost implements Serializable{
    
    Butler("A pompus looking ghost with a monacle"),
    Mr_Ghastly("Another ghost"),
    Mrs_Haunter("Mr Ghastly's wife, or so you presume"),
    Gengar("A ghost type pokemon");
    
    private final String description;
    private final Point coordinates;

    Ghost(String description) {
        this.description = description;
        coordinates = new Point (1,1);
    }

    public String getDescription() {
        return description;
    }


    public Point getCoordinates() {
        return coordinates;
    }


   

    
    
    
    
}
