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
    private Square stage;
    private Triangle hat;
    private Circle head;
    private Circle smile;
    private Square smilemask;
    private Person audience2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        stage = new Square();
        hat = new Triangle();  
        head = new Circle();
        smile = new Circle();
        smilemask = new Square();
        audience2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            stage.moveHorizontal(-140);
            stage.moveVertical(60);
            stage.changeSize(120);
            stage.makeVisible();
    
            hat.changeSize(20, 20);
            hat.moveHorizontal(20);
            hat.moveVertical(-37);
            hat.changeColor("magenta");
            hat.makeVisible();
    
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
            
            audience2.moveHorizontal(180);
            audience2.moveVertical(65);
            audience2.changeColor("green");
            audience2.makeVisible();
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        stage.changeColor("black");
        hat.changeColor("black");
        smilemask.changeColor("black");
        head.changeColor("black");
        smile.changeColor("black");
        audience2.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        smilemask.changeColor("yellow");
        stage.changeColor("red");
        hat.changeColor("magenta");
        smile.changeColor("blue");
        audience2.changeColor("green");
        head.changeColor("yellow");
    }
}
