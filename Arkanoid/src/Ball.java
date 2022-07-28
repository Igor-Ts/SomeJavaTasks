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

    }

    @Override
    public void move() {

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
