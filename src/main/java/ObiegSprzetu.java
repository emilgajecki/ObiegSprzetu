import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ObiegSprzetu extends Application {

    //manager kompozycji
    private GridPane gridPane;
    // tytul naszego formularza - nagłówek
    private Text fromTitle, powiadomieniePrzycisku;
    //etykiety
    private Label userLoginLabel, userPasswordLabel;
    // pole do loginu i hasła
    private TextField userLoginField;
    private PasswordField userPasswordField;
    // przycisk logowania
    private Button singInButton;

    private Scene scene;
    private String cssPath;


    @Override
    public void start(Stage primaryStage) {


        gridPane = new GridPane();
        // ustawienie w pozycji srodkowej
        gridPane.setAlignment(Pos.CENTER);
        // ustawienie odstepy miedzy kolumnaimi i wierszami
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        // odstepy od kazdej strony
        gridPane.setPadding(new Insets(25));
        //ustawienie pozwalajace zobaczyc linie siatki - pozniej nalezy je wylaczyć
        gridPane.setGridLinesVisible(false);

        fromTitle = new Text("Witam");
        // elementy dodwane do siatki - pierwszy paramet to taki, ktory chcemy dodac
        gridPane.add(fromTitle, 0, 0, 2, 1);
        // dodajemy etykiete logowania
        userLoginLabel = new Label("user login:");
        gridPane.add(userLoginLabel, 0, 1);
        userLoginField = new TextField();
        gridPane.add(userLoginField, 1, 1);

       userPasswordLabel = new Label("user password:");
       gridPane.add(userPasswordLabel, 0, 2);
       userPasswordField = new PasswordField();
       gridPane.add(userPasswordField,1,2);

        singInButton = new Button("Zaloguj");
        gridPane.add(singInButton, 1, 4);


        scene = new Scene(gridPane, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Obieg Sprzetu"); //nadajemy tytul okna
    }

    public static void main(String[] args) {
        launch(args);
    }
}
