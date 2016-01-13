package model;

/**
 * @author Jan Eriksson
 * @Version 1.0
 * @since 13/01/16
 */
public class TicTacModelImpl implements TicTacModel {
  @Override
  public boolean setTile(int[] coordinate) {
    return false;
  }

  @Override
  public boolean isGameOver() {
    return false;
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
