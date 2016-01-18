package control;

/**
 * @author Jan Eriksson
 * @Version 1.0
 * @since 18/01/16
 */
public class ModelNotInitialisedException extends RuntimeException {

  public ModelNotInitialisedException(){
    super("The model was not initialized in the controller.");
  }
}
