package ru.gb.snakegame;

import java.awt.*;

public class Cell {
    private int x, y;
    private int size;
    private Color color;

    public Cell(int x, int y, int size, Color color){
        setXY(x, y);
        setColor(color);
        setSize(size);
    }

    public int getX() {
        return x;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint(Graphics2D q){
        q.setColor(color);
        q.fillOval(x+size, y+size, size, size);//Надо посмотерть!!!!
    }
}
