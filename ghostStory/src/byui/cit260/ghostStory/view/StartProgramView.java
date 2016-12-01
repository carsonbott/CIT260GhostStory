/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.view;

import byui.cit260.ghostStory.control.GameControl;
import byui.cit260.ghostStory.exceptions.GameControlException;
import byui.cit260.ghostStory.model.Player;
import java.util.Scanner;

/**
 *
 * @author carsonbott
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter the name of the Private Investigator: ";
        // display banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {

        System.out.println(
                "\nAs a Private Investigator you get many"
                + "\n strange cases, but none as strange as"
                + "\n this one. Just a few days ago a client"
                + "\n called asking you to investigate the"
                + "\n cases of ten deaths that all happened"
                + "\n in a single house. Upon arriving at the"
                + "\n crime scene, you find it to be an old,"
                + "\n delapitated mansion. It looks like this"
                + "\n place hasn't been lived in for years."
                + "\n You double check the address, hopping"
                + "\n that you just made a wrong turn along the"
                + "\n way. Nope, this is it. You hesitantly"
                + "\n step out of the comfort of your old car,"
                + "\n your heart sinking with every step you"
                + "\n take. You take a deep breath as you open"
                + "\n the door and enter a large dark entryway."
                + "\n Behind you the door slams shut, locking"
                + "\n you inside the ancient home. You try to"
                + "\n open the door, but it wont budge. Turning"
                + "\n around you see a pale figure, dressed in"
                + "\n a Victorian Era suit, equipt with a monacle"
                + "\n and a bushy moustache. The figure stands"
                + "\n reaglly, a soft light eminating from his"
                + "\n transparent form. As the game's title"
                + "\n suggests, he is a ghost."
        );
    }

    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for ang get PI's name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit game
            }
            // do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);
    }

    private String getPlayersName() {

        Scanner keyboard = new Scanner(System.in); // get keyboard imput
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and traling blanks (spaces)

            if (value.length() < 1) { // value is blank
                System.out.println("\nYour invesigator needs a name, yo!");
                continue;
            }
            break; // end loop
        }
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid playrer's name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        // call createPlayer() control function
        try {
            Player player = GameControl.createPlayer(playersName);

            if (player == null) { // iff unsuccessful
                System.out.println("\nError creating player.");
                return false;
            }

            // display next view
            this.displayNextView(player);

        } catch (GameControlException gce) {

        }
        return true; // success !
    }

    private void displayNextView(Player player) {
        System.out.println("\nWelcome to Ghost Story " + player.getName()
                + "\n Continue if you dare..."
        );

        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //display the main menu
        mainMenuView.display();
    }
}
