import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gun extends Actor
{
    /**
     * Act - do whatever the gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
               if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            moveUp();
        } else if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            moveDown();
        } else if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            moveLeft();
        } else if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            moveRight();
        }
    } 
    
    public gun(){
        show();
        

        
    }
    public void show(){
    GreenfootImage img = new GreenfootImage("gun1.png");
             img.scale(503, 308);
             setImage(img);
    }
    
     public void moveUp(){
        setLocation(getX(), getY() - 5);
    }
    
    public void moveDown(){
        setLocation(getX(), getY() + 5);
    }
    
    public void moveLeft(){
        if(getX() > 250){
        move(-5);
    }
    }
    
    public void moveRight(){
        move(5);
    }
}
