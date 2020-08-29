import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StarterMain extends Application{

    //Tworzenie przy uzyciu fxml'a

    @Override
    public void start(Stage primaryStage) throws Exception {
        // klasa do uruchamiania korzystajac z StackPaneBuildera

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("fxml/StackPaneWindow.fxml"));
        // parsowanie fxml'a
        StackPane stackPane = loader.load();

        Scene scene = new Scene(stackPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Obieg sprzetu");
        primaryStage.show();

    }
}
