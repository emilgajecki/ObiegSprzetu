import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StarterMain extends Application{

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // w tym przypadku w pierwszej kolejnośći zbudowane jest puste okno do ktorego ładuje sie menu
        //ldaowanie formatek
        //ladowanie pliku fxml
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/MainScreen.fxml"));
        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane , 1900,1000 );
        primaryStage.setScene(scene);
        primaryStage.setTitle("Obieg sprzetu");
        primaryStage.setMaximized(true);
        primaryStage.show();

    }
}
