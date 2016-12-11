/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.control;


import byui.cit260.ghostStory.model.Item;

/**
 *
 * @author carsonbott
 */
public class InventoryControl {
    
    static Item[] createInventory() {
        
        //created array (list) of inventory items
        Item[] inventory = new Item[3];
        
        Item key = new Item();
        key.setName("Key");
        key.setDescription("This should probably open something...");
        key.setAmmount(0);
        inventory[ItemEnum.key.ordinal()] = key;
        
        Item sock = new Item();
        sock.setName("Sock");
        sock.setDescription("Old, smelly, and 100% cotton!");
        sock.setAmmount(0);
        inventory[ItemEnum.sock.ordinal()] = sock;
        
        Item book = new Item();
        book.setName("Book");
        book.setDescription("You can't seem to find the 'on' switch...");
        book.setAmmount(0);
        inventory[ItemEnum.book.ordinal()] = book;
        
        return inventory;
    }
    
            public enum ItemEnum {
        key,
        sock,
        book;
    }
    
}
