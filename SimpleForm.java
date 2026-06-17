import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleForm extends Application {

    public void start(Stage stage) {

        // Creating components
        Label nameLabel = new Label("Enter Name:");

        TextField nameField = new TextField();

        Label passwordLabel = new Label("Enter Password:");

        TextField passwordField = new TextField();

        Button submitButton = new Button("Submit");

        Label resultLabel = new Label();


        // Button event handling
        submitButton.setOnAction(e -> {

            String name = nameField.getText();

            resultLabel.setText("Welcome " + name);

        });


        // Creating VBox layout
        VBox root = new VBox(10);

        root.getChildren().addAll(
                nameLabel,
                nameField,
                passwordLabel,
                passwordField,
                submitButton,
                resultLabel
        );


        // Creating scene
        Scene scene = new Scene(root, 300, 250);


        // Setting stage
        stage.setTitle("JavaFX Form");

        stage.setScene(scene);

        stage.show();
    }


    public static void main(String[] args) {

        launch(args);

    }
}