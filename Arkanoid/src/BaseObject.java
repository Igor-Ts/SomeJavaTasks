public abstract class BaseObject {

    protected double x;
    protected double y;
    protected double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();

    //This method will determine whether the objects "crossed" or not.
    public boolean isIntersec(BaseObject o){
        double disX = x - o.x;
        double disY = y - o.y;
        double disSqrt = Math.sqrt(disX * disX + disY * disY);
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
// We check if the passed (o) and our (this) objects intersect.
    public void checkBorders(double minx, double maxx, double miny, double maxy)
    {
        if (x < minx) x = minx;
        if (x > maxx) x = maxx;
        if (y < miny) y = miny;
        if (y > maxy) y = maxy;
    }
}
