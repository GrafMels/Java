package ru.gb.snakegame;

import java.awt.*;

public class Const {
    public final String GAME_OVER_MSG = "GAME OVER";
    public final static int CELL_SIZE = 20;           // size of cell in pix
    public final static int CANVAS_WIDTH = 30;        // width in cells
    public final static int CANVAS_HEIGHT = 25;       // height in cells
    public final static Color SNAKE_COLOR = Color.darkGray;
    public final static Color FOOD_COLOR = Color.green;
    public final static Color POISON_COLOR = Color.red;
    public final static int KEY_LEFT = 37;            // codes
    public final static int KEY_UP = 38;              //   of
    public final static int KEY_RIGHT = 39;           //   cursor
    public final static int KEY_DOWN = 40;            //   keys

    public static boolean gameOver = false;           // a sign game is over or not
}
