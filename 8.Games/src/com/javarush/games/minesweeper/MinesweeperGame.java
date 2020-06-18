package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;

    public void initialize(){
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    GameObject[][] gameField = new GameObject[SIDE][SIDE];

    private void createGame(){
        for(int i = 0, j = 0; i < gameField.length; i++, j++){
            gameField[j][i] = new GameObject(j, i);
            setCellColor(j, i, Color.ORANGE);
        }




    }
}
