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
    private Circle sun;
    private Person barny;
    private Person audience1;
    private Person audience2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        stage = new Square();
        hat = new Triangle();  
        sun = new Circle();
        barny = new Person();
        audience1 = new Person();
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
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-190);
            sun.moveVertical(-80);
            sun.changeSize(80);
            sun.makeVisible();
            
            barny.moveHorizontal(-50);
            barny.moveVertical(-50);
            barny.makeVisible();
            drawn = true;
            
            audience1.moveHorizontal(-180);
            audience1.moveVertical(65);
            audience1.changeColor("blue");
            audience1.makeVisible();
            
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
        barny.changeColor("black");
        sun.changeColor("black");
        audience1.changeColor("black");
        audience2.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        barny.changeColor("black");
        stage.changeColor("red");
        hat.changeColor("magenta");
        audience1.changeColor("blue");
        audience2.changeColor("green");
        sun.changeColor("yellow");
    }
}
