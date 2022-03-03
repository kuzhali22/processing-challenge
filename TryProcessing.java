import processing.core.PApplet;

public class TryProcessing extends PApplet{
    private static final int WIDTH = 800 ;
    private static final int HEIGHT = 600;
    private static final int DIAMETER = 15;
    // x position of the ball
    int x = 0;

    // instances of ball class
    Ball b1, b2,b3,b4;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        b1 = new Ball(this,x,HEIGHT*1/5 ,DIAMETER,DIAMETER);
        b2 = new Ball(this,x,HEIGHT*2/5 ,DIAMETER,DIAMETER);
        b3 = new Ball(this,x,HEIGHT*3/5 ,DIAMETER,DIAMETER);
        b4 = new Ball(this,x,HEIGHT*4/5 ,DIAMETER,DIAMETER);
    }

    public void draw() {
        b1.raiseSpeed(1);
        b1.drawEllipse();
        b2.raiseSpeed(2);
        b2.drawEllipse();
        b3.raiseSpeed(3);
        b3.drawEllipse();
        b4.raiseSpeed(4);
        b4.drawEllipse();
    }
}


