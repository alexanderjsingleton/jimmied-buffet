import greenfoot.*;

/**
 * Write a description of class GenericFoodItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenericFoodItem extends Actor
{
    protected boolean inLeftHalf = true;
    protected int        caloriesForItem    = 10;
    /**
     * Act - do whatever the GenericFoodItem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouseMovedOn();
        checkClickedOn();
    }

    public void checkClickedOn()
    {
        int amount;
        int total;
        if (Greenfoot.mouseClicked(this))
        {
            if ( inLeftHalf )
            {
                amount = getX();
                total = getWorld().getWidth();
                setLocation(total - amount , getY());
                inLeftHalf = false;
                ((MealWorld)getWorld()).adjustTotalCalories(caloriesForItem);
            }  // end if ( inLeftHalf )
            else
            {
                amount = getWorld().getWidth() - getX();
                setLocation(amount,getY());
                inLeftHalf = true;
                ((MealWorld)getWorld()).adjustTotalCalories(-caloriesForItem);
            }    // end else
        }   // end     if (Greenfoot.mouseClicked(this))

    }  // end checkClickedOn

    public void checkMouseMovedOn()
    {
        if (Greenfoot.mouseMoved(this))
        {
            getWorld().showText("Calories " + caloriesForItem,70,30);
        }
    }
}
