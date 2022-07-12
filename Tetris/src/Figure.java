public class Figure {
    private int x;
    private int y;
    private int [][] matrix;

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void left() { // left movement

    }

    public void right() { //right movement

    }

    public void up() { //up movement

    }

    public void down() { // down movement

    }

    public void downMaximum() {  // the figure falling up to down

    }

    public void rotate() {  // the figure rotation

    }

    public boolean isCurrentPositionAvaliable() {  //check statement
        return true;
    }

    public void landed() { //colling if the figure can't move more

    }
}
