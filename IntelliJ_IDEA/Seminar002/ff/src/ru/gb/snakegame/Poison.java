package ru.gb.snakegame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ru.gb.snakegame.Const.*;

public class Poison {
    private static List<Cell> poison;
    private Random random;
    private Snake snake;
    private Food food;

    public Poison(Snake snake) {
        poison = new ArrayList<>();
        random = new Random();
        this.snake = snake;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public boolean isPoison(int x, int y) {
        for (Cell cell : poison)
            if ((cell.getX() == x) && (cell.getY() == y))
                return true;
        return false;
    }

    public void add() {
        int x, y;
        do {
            x = random.nextInt(CANVAS_WIDTH);
            y = random.nextInt(CANVAS_HEIGHT);
        } while (isPoison(x, y) ||
                snake.isInSnake(x, y) ||
                food.isFood(x, y));
        poison.add(new Cell(x, y, CELL_SIZE, POISON_COLOR));
    }

    public void paint(Graphics2D g) {
        for (Cell cell : poison)
            cell.paint(g);
    }
}
