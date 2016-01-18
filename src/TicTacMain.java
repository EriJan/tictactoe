import control.TicTacControlImpl;
import model.TicTacModel;
import model.TicTacModelImpl;
import view.TicTacFrame;

/**
 * @author Jan Eriksson
 * @Version 1.0
 * @since 14/01/16
 */
public class TicTacMain {
  public static void main(String [] args){
    GameFactory gameFactory = new GameFactoryImpl();
    Game theGame = gameFactory.createGame("TicTacToe");
    theGame.startGame();
  }
}
