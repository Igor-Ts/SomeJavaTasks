public class Brick extends BaseObject {

    //picture to draw
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };
    public Brick(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void draw() {

    }

    @Override
    public void move() {

    }
}
