import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TPipe extends Actor
{
    int PIPE_SPEED = 4;
    /**
     * Act - do whatever the TPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-PIPE_SPEED,getY());
        // Add your action code here.
    }    
}
