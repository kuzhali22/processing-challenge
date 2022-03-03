import processing.core.PApplet;

// Ball class with properties of ball and  methods to draw it on the screen
public class Ball extends PApplet {
    // instance of pApp class
    private PApplet pApp;
    //x position
    int x;
    //y position
    int y;
    // width of the ball
    int width;
    // height of the ball
    int height;

    //class constructor
    public Ball(PApplet pApp,int x,int y,int width,int height){
        this.pApp = pApp;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // method to raise the ball speed
    public void raiseSpeed(int speed){
        this.x = x + speed;
    }


    // method to draw ball
    public void drawEllipse() {
        pApp.ellipse(x,y,width,height);
    }

}
