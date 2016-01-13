package model;

/**
 * @author Jan Eriksson & Ulrika Fahlen
 * @Version 1.0
 * @since 13/01/16
 */
public interface TicTacModel {
  boolean setTile(int[] coordinate);
  boolean isGameOver();
  String getTile(int[] coordinate);
  int getXMorale();
  int getOMorale();
  void incrementTurn();


}
