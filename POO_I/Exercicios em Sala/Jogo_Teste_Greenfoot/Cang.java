import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cang extends Actor
{
    private int contador = 0;
    /**
     * Act - do whatever the Cang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        else if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
        
        if (Greenfoot.isKeyDown("up")){
            move(5);
        }
        else if (Greenfoot.isKeyDown("down")){
            move(-5);
        }
        remover();
    }
    
    private void remover(){
        if (isTouching(Borb.class)){
            removeTouching(Borb.class);
            
            contador += 1;
        }
        
        if (contador == 4){
            getWorld().showText("Parabéns, você pegou " + contador + " borboletas", 500, 400);
            Greenfoot.stop();
        }
    }
    
}
