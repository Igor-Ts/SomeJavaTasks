import java.util.ArrayList;

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
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        int[][] canvas = new int[height][width];

        //Копируем "матрицу поля" в массив
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                canvas[i][j] = matrix[i][j];
            }
        }

        //Копируем фигурку в массив, только непустые клетки
        int left = Tetris.game.getFigure().getX();
        int top = Tetris.game.getFigure().getY();
        int[][] brickMatrix = Tetris.game.getFigure().getMatrix();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (top + i >= height || left + j >= width) continue;
                if (brickMatrix[i][j] == 1)
                    canvas[top + i][left + j] = 2;
            }
        }


        //Выводим "нарисованное" на экран, но начинаем с "границы кадра".
        System.out.println("---------------------------------------------------------------------------\n");

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                int index = canvas[i][j];
                if (index == 0)
                    System.out.print(" . ");
                else if (index == 1)
                    System.out.print(" X ");
                else if (index == 2)
                    System.out.print(" X ");
                else
                    System.out.print("???");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
    }

    public void removeFullLines() { //need to remove all filled lines and turn down next line
        //create Arraylist to store all lines
        ArrayList<int[]> lines = new ArrayList<>();

        //Copy all not filled lines in Arraylist
        for (int i = 0; i <height; i++)
        {
            //Calculate X count in line  - just sum all values
            int count = 0;
            for (int j = 0; j < width; j++)
            {
                count += matrix[i][j];
            }

            //if line sum not equals his width - add into list
            if (count != width)
                lines.add(matrix[i]);
        }

        //Add missing lines in the beginning list.
        while (lines.size() < height)
        {
            lines.add(0,new int[width]);
        }

        //modify list back to the matrix
        matrix = lines.toArray(new int[height][width]);
    }

    public Integer getValue(int x, int y) { //return the value what was in matrix
        if (x >= 0 && x < width && y >= 0 && y < height)
            return matrix[y][x];

        return null;
    }

    public void setValue(int x, int y, int value) { // set the value into matrix
        if (x >= 0 && x < width && y >= 0 && y < height)
            matrix[y][x] = value;
    }
}
