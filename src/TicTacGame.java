import control.TicTacControlImpl;
import model.TicTacModelImpl;
import view.TicTacFrame;
import view.TicTacFxApp;

/**
 * @author Jan Eriksson
 * @Version 1.0
 * @since 18/01/16
 */
public class TicTacGame implements Game {

//  TicTacGame() {
//    System.out.println("Constructor run");
//    TicTacControlImpl.INSTANCE.setModel(new TicTacModelImpl());
//    System.out.println("Constructor run");
//  }

  @Override
  public void startGame() {
    System.out.println("Någon har sagt att hörn är ett problem, men jag håller faktiskt inte riktigt med.");

//    TicTacControlImpl.INSTANCE.setModel(new TicTacModelImpl());
    // new TicTacFrame(TicTacControlImpl.INSTANCE);
//    TicTacFxApp tc = new TicTacFxApp();
//    tc.runFxGame();
    TicTacFxApp.runFxGame();
  }
}
