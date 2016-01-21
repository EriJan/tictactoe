package view;

import control.TicTacControl;
import control.TicTacControlImpl;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.TicTacModelImpl;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Jan Eriksson
 * @Version 1.0
 * @since 21/01/16
 */
public class TicTacFxApp extends Application implements Initializable {

  TicTacControl ticTacControl;

  @FXML
  Label r0c0;

  @FXML
  Label r0c1;

  @FXML
  Label r0c2;

  @FXML
  Label r1c0;

  @FXML
  Label r1c1;

  @FXML
  Label r1c2;

  @FXML
  Label r2c0;

  @FXML
  Label r2c1;

  @FXML
  Label r2c2;

  Label[][] tileLabels;

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Lägg ett kryss, få en kyss");
    Parent root = FXMLLoader.load(getClass().getResource("TicTacFxView.fxml"));
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }



  public static void runFxGame() {
    Application.launch();
    }

  private void setCellContent() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println(TicTacControlImpl.INSTANCE.getTile(i,j));
        tileLabels[i][j].setText(ticTacControl.getTile(i,j));
      }
    }
  }

  public void onClick(MouseEvent event){
    Label label = (Label)event.getSource();
    setCellContent();
  }


  @Override
  public void initialize(URL location, ResourceBundle resources) {
    System.out.println("Hejhejhejhejhejhejhejhej.");

    ticTacControl = TicTacControlImpl.INSTANCE;
    ticTacControl.setModel(new TicTacModelImpl());

    tileLabels = new Label[3][3];
    tileLabels[0][0] = r0c0;
    tileLabels[0][1] = r0c1;
    tileLabels[0][2] = r0c2;
    tileLabels[1][0] = r1c0;
    tileLabels[1][1] = r1c1;
    tileLabels[1][2] = r1c2;
    tileLabels[2][0] = r2c0;
    tileLabels[2][1] = r2c1;
    tileLabels[2][2] = r2c2;
  }
}