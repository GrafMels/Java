package ru.gb.snakegame;

import java.util.Random;

import static ru.gb.snakegame.Const.*;

public class Food extends Cell{
    private Random random;
    private Snake snake;

    public Food(Snake snake) {
        super(-1, -1, CELL_SIZE, FOOD_COLOR);
        random = new Random();
        this.snake = snake;
    }

    public void appear(){
        int x, y;
        do{
            x = random.nextInt(CANVAS_WIDTH);
            y = random.nextInt(CANVAS_HEIGHT);
        } while(snake.isInSnake(x, y));
        setXY(x, y);
    }

    public boolean isEaten(){
        return getX() == -1;
    }

    public void eat() {
        setXY(-1, -1);
    }

    public boolean isFood(int x, int y) {
        return (getX() == x && getY() == y);
    }
}
