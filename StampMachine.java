/**
 *  Name: Tom Chiapete
 *  Course: CSCI 241 - Computer Science I
 *  Section: 001
 *  Assignment Number: 1
 *
 *  Project/Class Description:
 *  This class emulates an automated stamp machine found in the Post Office.
 *
 *  Known Bugs: None
 */

import java.util.*;

public class StampMachine
{

    // The cost of a first class stamp
    public static final double FIRST_CLASS_STAMP_PRICE = 0.37;

    // instance variables
    private double money; // the amount of money entered.

    /**
     * Constructor for objects of class StampMachine
     */
    public StampMachine()
    {
        money = 0.0;
    }

    // methods
    /**
     * Method to insert money into the machine
     */
    public void insert(double amount)
    {
        money = money + amount;   
    }
    
    /**
     * Method to return first class stamps
     */
    public int giveFirstClassStamps()
    {
        int firstClassStamps = (int) (money / FIRST_CLASS_STAMP_PRICE);
        money = money - firstClassStamps * FIRST_CLASS_STAMP_PRICE;
        return firstClassStamps;
    }
    
    /**
     * Method to return one cent stamps
     */
    public int givePennyStamps()
    {
        int pennyStamps = (int) Math.round(100 * money);
        money = 0.0;
        return pennyStamps;
    }
    
    /**
     * The main method requests that the user inserts the money, 
     * then returns the appropriate number of the first class and one cent 
     * stamps
     */
    public static void main(String [] args)
    {
        double amount; // the amount of the money entered
        
        // The stamp machine that we will use
        StampMachine stampTeller = new StampMachine();
        
        // The object that lets us read from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Read the amount of money entered
        System.out.print("Enter the amount of money (in dollars): ");
        amount = input.nextDouble();
        
        // Insert the money into the machine and return the stamps
        stampTeller.insert(amount);
        System.out.println("First Class stamps: " + 
            stampTeller.giveFirstClassStamps());
        System.out.println("Penny stamps: " + 
            stampTeller.givePennyStamps());
        System.out.println();
        
        // Read the amount of money entered
        System.out.print("Enter another amount of money (in dollars): ");
        amount = input.nextDouble();
        
        // Insert the money into the machine and retrieve the stamps
        stampTeller.insert(amount);
        System.out.println("First Class Stamps: " +
            stampTeller.giveFirstClassStamps());
        System.out.println("Penny stamps: " +
            stampTeller.givePennyStamps());
                                    
    }
}
