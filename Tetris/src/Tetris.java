public class Tetris {
    public static Tetris game;
    Field field; // the game field
    Figure figure; // the game figure
    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }


    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    public void run(){

    }

    public void step(){

    }
}
