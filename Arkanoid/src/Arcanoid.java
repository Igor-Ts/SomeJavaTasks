import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Arcanoid {

    public static Arcanoid game;

    private Ball ball;
    private Stand stand;

    private ArrayList<Brick> bricks;

    private int width;
    private int height;

    public Arcanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) throws Exception {
        game = new Arcanoid(20, 30);

        Ball ball = new Ball(10, 29, 2,  95);
        game.setBall(ball);

        Stand stand = new Stand(10, 30);
        game.setStand(stand);

        game.getBricks().add(new Brick(3, 3));
        game.getBricks().add(new Brick(7, 5));
        game.getBricks().add(new Brick(12, 5));
        game.getBricks().add(new Brick(16, 3));

        game.run();
    }

    public void run () throws Exception {
        //create canvas to draw.
        Canvas canvas = new Canvas(width, height);

        //create object observer and start them
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //Execute the cycle while the game is not ended
        while (!isGameOver)
        {
            //"observer" contains events about key tapping?
            if (keyboardObserver.hasKeyEvents())
            {
                KeyEvent event = keyboardObserver.getEventFromTop();

                //if "left" - move figure to the left
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    stand.moveLeft();
                    //if "right" - move figure to the right
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    stand.moveRight();
                    //if "space" - ball start
                else if (event.getKeyCode() == KeyEvent.VK_SPACE)
                    ball.start();
            }

            //move all objects
            move();

            //check bumping
            checkBricksBump();
            checkStandBump();

            //check may the ball to fly through bottom
            checkEndGame();

            //draw all objects
            canvas.clear();
            draw(canvas);
            canvas.print();

            //pause
            Thread.sleep(300);
        }

        //"Game Over"
        System.out.println("Game Over!");
    }

    public void move() {
        stand.move();
        ball.move();
    }

    public void draw (Canvas canvas) {
        ball.draw(canvas);
        stand.draw(canvas);
        for (Brick br: bricks) {
            br.draw(canvas);
        }

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Ball getBall() {
        return ball;
    }

    public Stand getStand() {
        return stand;
    }

    public ArrayList<Brick> getBricks() {
        return bricks;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public void setBricks(ArrayList<Brick> bricks) {
        this.bricks = bricks;
    }


}
