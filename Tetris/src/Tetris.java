
import java.awt.event.KeyEvent;
public class Tetris {
    public static Tetris game;
    Field field; // the game field
    Figure figure; // the game figure

    private boolean isGameOver; // game is over?
    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }


    public Tetris(int width, int height) {
        field = new Field(width, height);
        figure = null;
    }
    public static void main(String[] args) throws Exception {
        game = new Tetris(6, 10);
        game.run();
    }

    /**
     *  The main program
     */
    public void run() throws Exception
    {
        //create the object "keyBoardObserver" and starts him
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //put the starting value false
        isGameOver = false;
        //create first figure in up center: x - half width and y - 0.
        figure = FigureFactory.createRandomFigure(field.getWidth() / 2, 0);

        //game in not ended
        while (!isGameOver)
        {
            if (keyboardObserver.hasKeyEvents())
            {
                //get the first event in queue
                KeyEvent event = keyboardObserver.getEventFromTop();
                //if this one equals "q" - exit game Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;
                //If "button left" - move the figure to left
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    figure.left();
                    //If "button right" - move the figure to right
                else if (event.getKeyCode() ==  KeyEvent.VK_RIGHT)
                    figure.right();
                    //If the button code equals 12 (numpad 5) - rotate figure
                else if (event.getKeyCode() ==  12)
                    figure.rotate();
                    //If "space" - the figure fall down to max
                else if (event.getKeyCode() ==  KeyEvent.VK_SPACE)
                    figure.downMaximum();
            }

            step();             //do next step
            field.print();      //print field statement
            Thread.sleep(300);  //pause 300 m.sec
        }

        //print message "Game Over"
        System.out.println("Game Over");
    }
    public void step(){
        figure.down(); //pull the figure down

        if (!figure.isCurrentPositionAvailable()){
            figure.up();
            figure.landed();

            isGameOver = figure.getY() <= 1; // check mb game is ended

            field.removeFullLines(); // remove line
            figure = FigureFactory.createRandomFigure(field.getWidth() / 2, 0); // add new figure
        }
    }
}
