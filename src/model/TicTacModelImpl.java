package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Jan Eriksson
 * @Version 1.0
 * @since 13/01/16
 */
public class TicTacModelImpl implements TicTacModel {

  TileState[][] board;
  int turn;
  TileState evenTurnState;
  TileState oddTurnState;

  Random randomEngine;

  TicTacModelImpl() {
    board = new TileState[3][3];
    randomEngine = new Random();
    initGame();
  }

  private void initGame() {
    for (int i = 0; i < board[0].length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = TileState.UNOCCUPIED;
      }
    }

    if (randomEngine.nextBoolean()) {
      evenTurnState = TileState.CROSS;
      oddTurnState = TileState.NOUGHT;
    } else {
      evenTurnState = TileState.NOUGHT;
      oddTurnState = TileState.CROSS;
    }
    turn = 1;
  }

  private TileState getTurnState() {
    if(turn%2 == 0) {
      return evenTurnState;
    } else {
      return oddTurnState;
    }
  }

  @Override
  public boolean setTile(int[] coordinate) {
    boolean moveOk = false;
    if(board[coordinate[0]][coordinate[1]]== TileState.UNOCCUPIED) {
      moveOk = true;
      board[coordinate[0]][coordinate[1]] = getTurnState();
      turn++;
    }
    return moveOk;
  }


  @Override
  public boolean isGameOver() {
    boolean isGameOver = false;
    isGameOver = winCheck();
    isGameOver = isFull();
    return isGameOver;
  }

  private boolean isFull() {
    return (turn == 10) ? true : false;
  }

  /**
   * Creates a list of rows from the board matrix.
   *
   * @return A list of rows in a ArrayList.
   */
  private List flattenMatrix() {
    ArrayList<TileState[]> flattenedArray = new ArrayList();
    TileState[] tempRow = new TileState[3];

    // Collect rows
    for (int i = 0; i < board[0].length; i++) {
      flattenedArray.add(board[i]);
    }

    // Collect columns
    for (int i = 0; i < board[0].length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        tempRow[j] = board[j][i];
      }
      flattenedArray.add(tempRow);
    }

    // Collect diagonals
    for (int i = 0; i < board[0].length; i++) {
      tempRow[i] = board[i][i];
    }
    flattenedArray.add(tempRow);

    for (int i = 0; i < board[0].length; i++) {
      tempRow[i] = board[i][2-i];
    }
    flattenedArray.add(tempRow);

    return flattenedArray;
  }

  private boolean winCheck() {
    boolean isWin = false;
    List<TileState[]> rows = flattenMatrix();
    for (TileState[] row : rows) {
      if (TicTacHelper.rowCheck(row)) {
        isWin = true;
      }
    }
    return isWin;
  }

  @Override
  public String getTile(int[] coordinate) {
    return null;
  }

  @Override
  public int getXMorale() {
    return 0;
  }

  @Override
  public int getOMorale() {
    return 0;
  }

  @Override
  public void incrementTurn() {

  }
}
