import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy=0;
    double g=1;
    double BOOST_SPEED = -15;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        //if user  presses up arrow,
       
        //if we touch pipe,game over
        if(getOneIntersectingObject(Pipe.class)!= null)
        {
            displayGameover();
        }
        if(getOneIntersectingObject(TPipe.class)!= null)
        {
            displayGameover();
        }
        
        setLocation(getX(),(int)(getY()+dy));
        if(Greenfoot.isKeyDown("up") == true) {
            dy=BOOST_SPEED;
        Greenfoot.playSound("sfx_wing.wav");
        }
        if(dy>-10 && dy <10    ){
        setRotation(330);
        }
        else if(dy>11 && dy <400)      
        {
            setRotation(30);
        }
        else 
        {
            setRotation(0);
        }
            
        
        
        dy=dy+g;
        if(getY()>=getWorld().getHeight())
        {
            displayGameover();
        }
        
        // Add your action code here.
    }   
    
        private void displayGameover()
        {
            Gameover gameover = new Gameover();
            getWorld().addObject(gameover,getWorld().getWidth()/2,getWorld().getWidth()/2);           
            if(FlappyWorld.score==0){
        Greenfoot.playSound("score0.wav");
    }else
        {
        }
        
            Greenfoot.playSound("sfx_die.wav");
           
            Greenfoot.stop();
            
        }
}
