package com.javarush.games.snake;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;


    public void setDirection (Direction direction) {
        if ((this.direction == Direction.LEFT || this.direction == Direction.RIGHT) && (snakeParts.get(0).x == snakeParts.get(1).x )){
            return;
        }

        if ((this.direction == Direction.UP || this.direction == Direction.DOWN) && (snakeParts.get(0).y == snakeParts.get(1).y)){
            return;
        }

        this.direction = direction;
    }

    public Snake(int x, int y) {
        GameObject object1 = new GameObject(x, y);
        snakeParts.add(object1);
        GameObject object2 = new GameObject(x + 1, y);
        snakeParts.add(object2);
        GameObject object3 = new GameObject(x + 2, y);
        snakeParts.add(object3);
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (i == 0)
                game.setCellValueEx(
                        snakeParts.get(i).x,
                        snakeParts.get(i).y,
                        Color.NONE,
                        HEAD_SIGN,
                        isAlive ? Color.BLACK : Color.RED,
                        75);
            else
                game.setCellValueEx(
                        snakeParts.get(i).x,
                        snakeParts.get(i).y,
                        Color.NONE,
                        BODY_SIGN,
                        isAlive ? Color.BLACK : Color.RED,
                        75);
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x >= SnakeGame.WIDTH
                || newHead.x < 0
                || newHead.y >= SnakeGame.HEIGHT
                || newHead.y < 0) {
            isAlive = false;
            return;
        }

        if (checkCollision(newHead)) {
            isAlive = false;
            return;
        } else snakeParts.add(0, newHead);

        if (newHead.x == apple.x && newHead.y == apple.y) {
            apple.isAlive = false;
        } else {
            removeTail();
        }
    }

    public GameObject createNewHead() {
        GameObject gameObject = new GameObject(0, 0);
        if (direction == Direction.UP) {
            gameObject = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
        } else if (direction == Direction.DOWN) {
            gameObject = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
        } else if (direction == Direction.LEFT) {
            gameObject = new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
        } else if (direction == Direction.RIGHT) {
            gameObject = new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
        }
        return gameObject;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public boolean checkCollision(GameObject object) { //проверка на столкновение с телом змеи
        boolean answer = false;
        for (GameObject obj : snakeParts) {
            if (object.x == obj.x && object.y == obj.y) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    public int getLength() {
        int snakePartsCount = snakeParts.size();
        return snakePartsCount;
    }
}
