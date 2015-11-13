import greenfoot.*;
import java.awt.Color; // needed for color
import java.util.Date; // needed for
import java.text.DateFormat; // date and
import java.text.SimpleDateFormat; // time

/**
 * Write a description of class MealWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MealWorld extends World
{

    /**
     * Constructor for objects of class MealWorld.
     * 
     */
    public MealWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        printNameAndTime();
    }

    public void printNameAndTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        showText("Alex Singleton " + dateFormat.format(date), getWidth() / 3 , 10 );
    }
}
