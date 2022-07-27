public class Stand extends BaseObject{

    //picture to draw
    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

    }
}
