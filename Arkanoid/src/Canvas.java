public class Canvas {

    private char [][] matrix;

    private int width;
    private int height;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
    }
// Put one point on the canvas with coordinates (x,y) and color - c.
    public void setPoint (double x, double y, char c) {
        int x0 = (int) Math.round(x);
        int y0 = (int) Math.round(y);
        if (x0 < 0 || y0 < 0 || y0 > matrix.length || x0 > matrix[y0].length) {
            return;
        } else {
            matrix [x0][y0] = c;
        }
    }
// draw the passed figure in the pointed coordinates with c color
    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        int height = matrix.length;
        int width = matrix[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] != 0){
                    setPoint(x+j, y+i, c);
                }
            }
        }
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
