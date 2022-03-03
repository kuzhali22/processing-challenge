import processing.core.PApplet;

public class ProcessingTest extends PApplet {
    private static final int WIDTH = 800 ;
    private static final int HEIGHT = 600 ;
    private static final int DIAMETER = 15 ;
    int x = 0;
    int y = 0;
    int a = 0;
    int b = 0;

    public static void main(String[] args) {
        PApplet.main("ProcessingTest",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircle();
    }

    // Draw circles with different speed and at different heights
    private void drawCircle(){
        ellipse(x, HEIGHT*1/5, DIAMETER, DIAMETER);
        ellipse(y,HEIGHT*2/5, DIAMETER, DIAMETER);
        ellipse(a, HEIGHT*3/5, DIAMETER, DIAMETER);
        ellipse(b, HEIGHT*4/5, DIAMETER, DIAMETER);
        x++;
        y+=2;
        a+=3;
        b+=4;
    }


}
