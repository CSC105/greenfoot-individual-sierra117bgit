import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aim extends Actor
{
    bird1[] birds = new bird1[100];
    int madeBirds = 0; 
    int i = 0;
    int count = 0;
    boolean pressed =false;
    boolean added = false;
    boolean shouldAdd = false;
    String status = "stable";
    int lastShootTime = count;
    int birdHitTime = count;
    int countBirds = 0;
    int delayTime = 0;
    int countDeadBirds = 0;
    public void act(){
        count();
        check();
        
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            moveUp();
        } else if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            moveDown();
        } else if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            moveLeft();
        } else if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            moveRight();
        } 
        
        if(!pressed){
            if(Greenfoot.isKeyDown("Space")){
                shoot();
                lastShootTime = count;
            }
            pressed = true;
       }
       
       if(!added){
           if(shouldAdd && countBirds < 5){
               addBird();
               added = true;
            }
        }
    } 
    
   public void count(){
        count = count + 1;
    }
    
    
    public aim(){
        show();
    }
    
    public void show(){
        
        GreenfootImage img = new GreenfootImage("point.png");
        img.scale(3, 3);
        setImage(img);
    }
    
    public void moveUp(){
        setLocation(getX(), getY() - 5);
    }
    
    public void moveDown(){
        setLocation(getX(), getY() + 5);
    }
    
    public void moveLeft(){
        
            move(-5);
        
    }
    public void moveRight(){
        if(getX() <= 1040){
        move(5);
        }   
    }      
    public void shoot(){
        
        Actor a = this.getOneIntersectingObject(bird1.class);
         if(a != null){
            this.getWorld().removeObject(a);
            birdHitTime = count;
            delayTime = Greenfoot.getRandomNumber(4);
            countBirds -= 1;
            countDeadBirds += 1;
            
         }
        status = "shooting";
        Greenfoot.playSound("shoot.wav");
        show();
        
    }
    
    public void check(){
        if(count - lastShootTime > 90){
            status = " Stable";
            pressed = false;
        } else{
            status = "disabled";
        }
        

        
        if(count - birdHitTime > delayTime*60){
            if(madeBirds == 0){
            shouldAdd = true;
            added = false;
            madeBirds += 1;
        }
        } 
        show();
    }
    
    
    public void addBird(){

            int ix = Greenfoot.getRandomNumber(100) -50;
            int iy = Greenfoot.getRandomNumber(100) -50;
            birds[i] = new bird1();
            getWorld().addObject(birds[i],ix,460 + iy);
            i++;
            countBirds++;        
            madeBirds -= 1;
    }

}
