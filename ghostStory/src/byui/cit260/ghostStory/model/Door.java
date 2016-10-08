/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author carsonbott
 */
public class Door  implements Serializable{
    
    private String locked;

    public Door() {
    }
    
    

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.locked);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Door other = (Door) obj;
        if (!Objects.equals(this.locked, other.locked)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Door{" + "locked=" + locked + '}';
    }
    
    
    
}
