public class Field {
    private int width;
    private int height;
    private int[][] matrix;
    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void print() { //need to print your current status

    }

    public void removeFullLines() { //need to remove all filled lines and turn down next line

    }

    public Integer getValue(int x, int y) { //return the value what was in matrix
        return null;
    }

    public void setValue(int x, int y, int value) { // set the value into matrix

    }
}
