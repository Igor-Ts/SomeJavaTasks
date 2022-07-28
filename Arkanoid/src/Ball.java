public class Ball extends BaseObject {

    private double speed;
    //direction (in degrees from 0 till 360)
    private double direction;

    //current movement vector value(dx,dy)
    private double dx;
    private double dy;

    //able to move or not
    private boolean isFrozen;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;

        this.isFrozen = true;
    }



    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');
    }

    @Override
    public void move() {
        if (isFrozen) {

        } else {
            x += dx;
            y += dy;
            checkRebound(1, Arcanoid.game.getWidth(), 1, Arcanoid.game.getHeight() + 5);
        }
    }

    public void start() {
        isFrozen = false;
    }

    public void setDirection() {
        double angel = Math.toRadians(direction);
        dx = Math.cos(angel) * speed;
        dy = -Math.sin(angel) * speed;
    }
// check if the ball whether the ball flew over the wall.
    public void checkRebound(int minx, int maxx, int miny, int maxy) {
        if (x < minx) {
            x = minx + (minx - x);
            dx = -dx;
        }

        if (x > maxx) {
            x = maxx - (x - maxx);
            dx = -dx;
        }

        if (y < miny) {
            y = miny + (miny - y);
            dy = -dy;
        }

        if (y > maxy) {
            y = maxy - (y - maxy);
            dy = -dy;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public boolean isFrozen() {
        return isFrozen;
    }
}
