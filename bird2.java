import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird2 extends Actor
{
    /**
     * Act - do whatever the bird1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0; 
    boolean faceleft= true;
    public void act() 
    {
    count ++;
        if(getX() > 0 && faceleft){
            moveLeft();
        } else if(getX() == 0 && faceleft){
            turnRight();
        } else if(getX() >= 890 && !faceleft){
            turnLeft();
        }else if(getX() != 900 && !faceleft){
            moveRight();
        } 
    show(count%36 + 1);
    }
    public bird2(){
        show(1);
    }
    
    public void show(int n){
        if(faceleft){
            GreenfootImage img = new GreenfootImage("flamingo-left/Flamingo" + n + ".png");
             img.scale(180, 300);
             setImage(img);
        } else{
            GreenfootImage img = new GreenfootImage("flamingo-right/Flamingo" + n + ".png");
             img.scale(180, 300);
             setImage(img);
        }
           
    }
    
    public void moveLeft(){
        move(-8);
    }
    public void moveRight(){
        move(8);
    }
    
    public void turnRight(){
        faceleft = false;   
    }
    public void turnLeft(){
        faceleft = true;
    }
}
