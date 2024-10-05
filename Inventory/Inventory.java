package Inventory;

import java.util.ArrayList;

// personal inventory for each player
// consists of list of items 

// aggregation in relation to Item


public class Inventory {
    // TO CHECK! we dont need a constructor here - right?
    // QUESTION? how to create different default inventories for OP and SP 

    private ArrayList<Item>;

    public Inventory() {

    }

    // Show all items in inventory
    // Loop through array to show items
    // add "Back"-option to go back to meny

    public void displayInventory(){

    }


    // Player can browse items in player's price range
    // 

    // ideas: maybe create a shop and call the shop here - one for OP, another for SP
    // ideas: maybe enum?

    // ACTIONS:
    // choose number? Are you sure that you want to buy this one?
    // add item to players inventory to default items
    // reduce amount of money

    public void buyItem() {

    }

    // Player can sell item that player doesnt need
    // Player will get money 

    // ACTIONS:
    // display all items -- enums??
    // scanner for choice
    // are you sure? 
    // yes -- remove from array, money + Item.gold
    // no --- go back

    public void sellItem() {

    }


    // Advanced method for superPlayer -- create customisable item
    public void customisableItemConstructor(){
        
    }

}
