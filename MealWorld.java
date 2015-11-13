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
        prepareWorldWindow();
    }

    public void prepareWorldWindow()
    {
        GreenfootImage myImageHelper = getBackground(); // a class Variable=>need a Greenfoot Image object to do the work
        Color previousColor = myImageHelper.getColor(); // remember the previous drawing color

        myImageHelper.setColor(Color.RED); // make the drawing color red
        myImageHelper.fillRect(getWidth()/2,0,10,getHeight()); // draw the center line
        myImageHelper.drawString("BUFFET",getWidth() / 4 , getHeight() - 30); // left half description
        // OR showText("BUFFET", getWidth() / 4 , getHeight() - 30 ); // could also use
        showText("MY PLATE", getWidth()*3 / 4 , getHeight() - 30 ); // could also be used for tight

        myImageHelper.setColor(previousColor);
    }

    public void printNameAndTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        showText("Alex Singleton " + dateFormat.format(date), getWidth() / 3 , 10 );
    }
}
