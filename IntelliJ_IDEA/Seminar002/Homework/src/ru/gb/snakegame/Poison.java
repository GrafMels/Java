package ru.gb.snakegame;

import java.awt.Graphics2D;
import java.util.LinkedList;
import java.util.Random;

public class Poison{
    private static LinkedList<Cell> poison;
    final private Random random;
    final private Snake snake;
    private Food food;

    public Poison(Snake snake) {
        poison = new LinkedList<>();
        random = new Random();
        this.snake = snake;
    }

    public void delete(){
        if (!poison.isEmpty()){
            poison.removeLast();
        }
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
            x = random.nextInt(GameSnake.CANVAS_WIDTH);
            y = random.nextInt(GameSnake.CANVAS_HEIGHT);
        } while (isPoison(x, y) ||
                snake.isInSnake(x, y) ||
                food.isFood(x, y));
        poison.add(new Cell(x, y, GameSnake.CELL_SIZE, GameSnake.POISON_COLOR));
    }

    public void paint(Graphics2D g) {
        for (Cell cell : poison)
            cell.paint(g);
    }
}
