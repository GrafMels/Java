package ru.gb.snakegame.game;


import ru.gb.snakegame.classObject.Food;
import ru.gb.snakegame.classObject.Poison;
import ru.gb.snakegame.classObject.Snake;
import ru.gb.snakegame.game.GameSnake;

import javax.swing.*;

public class Logic {
    public Logic() {
    }

    public void game() {
        GameSnake gs = new GameSnake();
        gs.snake = new Snake(
            gs.START_SNAKE_X,
            gs.START_SNAKE_Y,
            gs.START_SNAKE_SIZE,
            gs.KEY_RIGHT);

        gs.food = new Food(gs.snake);
        gs.poison = new Poison(gs.snake);

        gs.snake.setFood(gs.food);
        gs.snake.setPoison(gs.poison);
        gs.food.setPoison(gs.poison);
        gs.poison.setFood(gs.food);

        while(!gs.gameOver){
            gs.snake.move();
            if(gs.snake.size() > gs.snakeSize){
                gs.snakeSize = gs.snake.size();
                gs.setTitle(gs.TITLE_OF_PROGRAM + ":" + gs.snakeSize);
            }

            if(gs.food.isEaten()){
                gs.food.appear();
                gs.poison.delete();
                gs.poison.add();
            }
            gs.canvas.repaint();
            sleep(gs.SNAKE_DELAY);
        }
        JOptionPane.showMessageDialog(gs, gs.GAME_OVER_MSG);
    }

    private void sleep(long ms) {    // method for suspending
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
