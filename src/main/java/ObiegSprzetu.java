import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class ObiegSprzetu extends Application implements EventHandler<ActionEvent> {

    //manager kompozycji
    private GridPane gridPane;
    // tytul naszego formularza - nagłówek
    private Text fromTitle, notification; // powiadomieniePrzycisku
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
        fromTitle.setId("formTitle");
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
        singInButton.setOnAction(this);
        gridPane.add(singInButton, 1, 4);

        notification = new Text();
        notification.setId("notification");
        gridPane.add(notification, 1,6);

        // dodanie css do wygladu - sciezka
        cssPath = this.getClass().getResource("applications.css").toExternalForm();
        scene = new Scene(gridPane, 600, 600);
        // dodanie do sceny
        scene.getStylesheets().add(cssPath);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Obieg Sprzetu"); //nadajemy tytul okna
    }

    public static void main(String[] args) {
        launch(args);
    }

    // obsluga akciji na przycisku
    @Override
    public void handle(ActionEvent event) {

        if(event.getSource()==singInButton){
            notification.setText("Zalogowano poprawnie");
        }

    }
}
