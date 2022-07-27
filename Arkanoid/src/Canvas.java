public class Canvas {

    private char [][] matrix;

    private int width;
    private int height;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
