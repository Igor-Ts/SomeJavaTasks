public abstract class BaseObject {

    private double x;
    private double y;
    private double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public abstract void draw();

    public abstract void move();

    //This method will determine whether the objects "crossed" or not.
    public boolean isIntersec(BaseObject o){
        double disX = x - o.x;
        double disY = y - o.y;
        double disSqrt = Math.sqrt(disX * disY + disX * disY);
        double disSqrt2 = Math.max(radius, o.radius);
        return disSqrt <= disSqrt2;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
