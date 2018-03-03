import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    static int time = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 700, 1);
       
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        gun gun = new gun();
        addObject(gun,561,530);
        gun.setLocation(602,518);
        aim aim = new aim();
        addObject(aim, 100,100);
        gun.setLocation(593,509);
        aim.setLocation(204,227);
        aim.setLocation(207,247);
        aim.setLocation(215,243);
        gun.setLocation(682,646);
        aim.setLocation(387,426);
        gun.setLocation(974,668);
        aim.setLocation(721,461);


        timer timer = new timer();
        addObject(timer,1048,78);
        timer.setLocation(1073,50);
        target target = new target();
        addObject(target,743,435);
        target.setLocation(755,463);
        target.setLocation(721,462);
    }
    

}
