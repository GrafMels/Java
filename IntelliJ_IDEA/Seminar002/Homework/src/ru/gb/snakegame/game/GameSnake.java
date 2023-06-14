package ru.gb.snakegame.game;

import ru.gb.snakegame.classObject.Food;
import ru.gb.snakegame.classObject.Poison;
import ru.gb.snakegame.classObject.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameSnake extends JFrame {
    final public String TITLE_OF_PROGRAM = "Snake game size";
    final public String GAME_OVER_MSG = "GAME OVER!";
    final public static int CELL_SIZE = 20;           // size of cell in pix
    final public static int CANVAS_WIDTH = 30;        // width in cells
    final public static int CANVAS_HEIGHT = 25;       // height in cells
    final public static Color SNAKE_COLOR = Color.darkGray;
    final public static Color FOOD_COLOR = Color.green;
    final public static Color POISON_COLOR = Color.red;
    final public static int KEY_LEFT = 37;            // codes
    final public static int KEY_UP = 38;              //   of
    final public static int KEY_RIGHT = 39;           //   cursor
    final public static int KEY_DOWN = 40;            //   keys
    final public int START_SNAKE_SIZE = 5;            // initialization data
    final public int START_SNAKE_X = CANVAS_WIDTH/2;  //   for
    final public int START_SNAKE_Y = CANVAS_HEIGHT/2; //   snake
    final public int SNAKE_DELAY = 150;               // snake delay in milliseconds
    public int snakeSize = 0;                         // current snake size
    public static boolean gameOver = false;           // a sign game is over or not

    Canvas canvas;                   // canvas object for rendering (drawing)
    Snake snake;                     // declare a snake object
    Food food;                       // declare a food object
    Poison poison;                   // declare a poison object

    public static void main(String[] args) {
        new Logic().game();
    }

    public GameSnake(){
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.setPreferredSize(new Dimension(CELL_SIZE * CANVAS_WIDTH,
                CELL_SIZE * CANVAS_HEIGHT));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                snake.setDirection(e.getKeyCode());
            }
        });

        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    class Canvas extends JPanel {    // class for rendering (drawing)
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            snake.paint(g2D);
            food.paint(g2D);
            poison.paint(g2D);
        }
    }

}

