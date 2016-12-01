/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.model;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author carsonbott
 */
public class Map implements Serializable{
    
    public static final int ROW = 2;
    public static final int COLUMN = 2;
    private Location[][] matrix = new Location[ROW][COLUMN];
    

    public Map() {
    }
    
    public void initilizeMap() {
        
        Random random = new Random();
        
        for (int row = 0; row < ROW; row++) {
            for (int column = 0; column < COLUMN; column++) {
                Location location = new Location();
                location.setRow(row);
                location.setColumn(column);
                location.setVisited(false);
                
                location.setLocationType(LocationType.values()[random.nextInt(LocationType.values().length)]);
                
                matrix[row][column] = location;
                
            }
        }
        
    }

    /*public void initilizeMap() {
        
       /* if (ROW < 1 || COLUMN < 1) {
            System.out.println("The number of rows and columns must be over 0");
            return;
        } 
        
        //this.rowCount = rowCount;
        //this.columnCount = columnCount;
        
        // create 2-D array for Location objects
        //this.location = new Location[ROW][COLUMN];
        
        for (int row = 0; row < ROW; row++) {
            for (int column = 0; column < COLUMN; column++) {
                // create and intialize new Location object instance
                Location location = new Location();
                location.setRow(row);
                location.setColumn(column);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                matrix[row][column] = location;
            }
        }
        
    } */
    
    public Location getLocationAt(int row, int column) {
        return matrix[row][column];
    }
    
    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    public int getROW() {
        return ROW;
    }

    //public void setROW(int ROW) {
        //this.ROW = (int) ROW;
    //}

    public int getCOLUMN() {
        return COLUMN;
    }

    //public void setColumnCount(int columnCount) {
        //this.columnCount = (int) columnCount;
    //}

    @Override
    public int hashCode() {
        int hash = 7;
        //hash = 83 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
       // hash = 83 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Map other = (Map) obj;
        
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + ROW + ", columnCount=" + COLUMN + '}';
    }
    
    
    
}
