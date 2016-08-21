import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FlappyWorld extends World
{
    int pipecounter=0;
    int pipe_spacing=150;
    public static int score=0;
    int FIRST_PIPE = 225;
    int flappycounter=0;
    Score scoreobj = null;
    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 400, 1,false); 
        
        setPaintOrder(Gameover.class,Score.class , FlappyBird.class,Pipe.class);
        FlappyBird flappy = new FlappyBird();
        Gameover g = new Gameover();
        addObject(flappy,100,getHeight()/2);
        //create score
        scoreobj = new Score();
        scoreobj.setScore(0);
        addObject(scoreobj,100,100);
    }
    public void act(){
        pipecounter++;
        
        if(pipecounter%100==0)
        {
            createpipe();
            
        }
        
        //GreenfootSound sound = new GreenfootSound("newmusic.wav");
        //sound.play();
        //Greenfoot.playSound("newmusic.wav");
        if(pipecounter >= FIRST_PIPE)
        {
           if(flappycounter%100==0)
        {
         score++;
         scoreobj.setScore(score); 
        Greenfoot.playSound("sfx_point.wav");
        
        } 
            
            flappycounter++;
        
            
        }
      
    }
    private void createpipe()
    {
        Pipe pipe = new Pipe();
        TPipe tpipe= new TPipe();
            GreenfootImage image =pipe.getImage();
            int n =Greenfoot.getRandomNumber(getHeight()/2);
            if(n>=199)
            n=0;
            addObject(pipe,getWidth(),getHeight()/2 + (image.getHeight()/2) + n);
            
           //(pipe.getY()-getHeight()/2 + (image.getHeight())+n)
            addObject(tpipe,getWidth(),getHeight()/2 + (image.getHeight()/2) + n-pipe_spacing-image.getHeight());
        
    } 
}
