import controller.MainControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StarterMain extends Application{

    public static void main(String[] args){
        launch(args);
    }

    //Tworzenie przy uzyciu fxml'a

    @Override
    public void start(Stage primaryStage) throws Exception {
        // klasa do uruchamiania korzystajac z StackPaneBuildera

        //ladowanie pliku fxml
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("fxml/LoginPage.fxml"));
        // parsowanie fxml'a
        Pane pane = loader.load();
        //odniesienie sie do controllera
        // getController - zwraca z ladowanego sie loadera
        MainControler stackPaneController = loader.getController();

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Obieg sprzetu");
        primaryStage.show();

    }
}
