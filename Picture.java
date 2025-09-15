/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Triangle eye1;
    private Person someguy;
    private Circle head;
    private Circle smile;
    private Square smilemask;
    private Triangle eye2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        eye1 = new Triangle();
        someguy = new Person();  
        head = new Circle();
        smile = new Circle();
        smilemask = new Square();
        eye2 = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
    
            head.changeColor("yellow");
            head.moveHorizontal(-100);
            head.moveVertical(-50);
            head.changeSize(250);
            head.makeVisible();
            
            smile.moveHorizontal(-10);
            smile.moveVertical(80);
            smile.changeColor("blue");
            smile.makeVisible();
            
            smilemask.changeColor("yellow");
            smilemask.moveHorizontal(-90);
            smilemask.moveVertical(20);
            smilemask.changeSize(70);
            smilemask.makeVisible();
            drawn = true;
            
            eye2.moveHorizontal(100);
            eye2.moveVertical(-25);
            eye2.changeColor("blue");
            eye2.makeVisible();
            
            eye1.moveHorizontal(-20);
            eye1.moveVertical(-25);
            eye1.makeVisible();
            eye1.changeColor("blue");
            
            someguy.changeSize(20, 20);
            someguy.moveHorizontal(-20);
            someguy.moveVertical(-160);
            someguy.changeColor("magenta");
            someguy.makeVisible();
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        someguy.changeColor("black");
        head.changeColor("black");
        smile.changeColor("white");
        smilemask.changeColor("black");
        eye2.changeColor("white");
        eye1.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        head.changeColor("yellow");
        smile.changeColor("blue");
        smilemask.changeColor("yellow");
        someguy.changeColor("magenta");
        eye1.changeColor("blue");
        eye2.changeColor("blue");
    }
}
