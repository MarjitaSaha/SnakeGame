import javax.swing.*;

public class SnakeGame extends JFrame {
    private GameBoard board;
    public SnakeGame()
    {
        board = new GameBoard();
        add(board);
       // setBounds(100,100,800,500);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        JFrame snakeGame = new SnakeGame();
    }
}
