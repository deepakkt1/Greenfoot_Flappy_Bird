import greenfoot.*;
import java.awt.Color;  
import java.awt.Font;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
        public Score(){
            GreenfootImage newimage = new GreenfootImage(100,50);
            newimage.setColor(Color.blue);
            newimage.fill();
            setImage(newimage);
            
            
        }
        public void setScore(int score)
        {
            GreenfootImage newimage = getImage();
            Font f = new Font("Comic Sans MS",Font.PLAIN,32);
            newimage.clear();
            Color c = new Color(127,127,127,127);
            newimage.setColor(c);
            newimage.fill();
            newimage.setColor(Color.black);
            newimage.setFont(f);          
            newimage.drawString(" "+score,30,30);
            setImage(newimage);
        }
}
