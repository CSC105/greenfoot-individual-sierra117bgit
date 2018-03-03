import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird1 extends Actor
{
    /**
     * Act - do whatever the bird1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    int lives = 5;
    public void act() 
    {
       if(lives > 0){
        count ++;
        moveRight();    
        show(count%36 + 1);
                     World w = getWorld();
             if(count > 100){
             if(getX() > 1100){
                 w.removeObject(this);
              }
              lives -= 0; 
            }
        }  else{
            gameOver();
        }  
    }
    public bird1(){
        show(1);
    }
    
    public void show(int n){

            GreenfootImage img = new GreenfootImage("flamingo-right/Flamingo" + n + ".png");
             img.scale(90, 150);
             setImage(img);
    }
    

    public void moveRight(){
        move(2);
    }
    
    public void gameOver(){
        Greenfoot.playSound("gameover.wav");
        
    }

}
