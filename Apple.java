import greenfoot.*;

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends GenericFoodItem
{
    public Apple()
    {
        super();
        caloriesForItem = 95;
    }

    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (inLeftHalf)
        {
            turn(10);
        }
        else
        setRotation(0);
    }
}
    

