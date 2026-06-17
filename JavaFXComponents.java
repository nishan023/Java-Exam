import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.File;

public class JavaFXComponents extends Application {

    public void start(Stage stage) {

        // TextField
        Label nameLabel = new Label("Enter Name:");
        TextField textField = new TextField();


        // Radio Button
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup group = new ToggleGroup();

        male.setToggleGroup(group);
        female.setToggleGroup(group);


        // CheckBox
        CheckBox java = new CheckBox("Java");
        CheckBox python = new CheckBox("Python");


        // Button
        Button button = new Button("Submit");


        // Hyperlink
        Hyperlink link = new Hyperlink("Open Website");

        link.setOnAction(e -> {
            System.out.println("Hyperlink clicked");
        });


        // Tooltip
        Tooltip tip = new Tooltip("Enter your name here");

        textField.setTooltip(tip);


        // FileChooser
        Button fileButton = new Button("Choose File");

        fileButton.setOnAction(e -> {

            FileChooser fileChooser = new FileChooser();

            File file = fileChooser.showOpenDialog(stage);

            if(file != null)
            {
                System.out.println(file.getName());
            }

        });


        // Menu
        Menu fileMenu = new Menu("File");

        MenuItem newItem = new MenuItem("New");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        fileMenu.getItems().addAll(
                newItem,
                saveItem,
                exitItem
        );


        MenuBar menuBar = new MenuBar();

        menuBar.getMenus().add(fileMenu);



        // Button Event
        button.setOnAction(e -> {

            String name = textField.getText();

            System.out.println("Name: " + name);

        });



        // VBox Layout
        VBox root = new VBox(10);

        root.getChildren().addAll(
                menuBar,
                nameLabel,
                textField,
                male,
                female,
                java,
                python,
                button,
                link,
                fileButton
        );


        // Scene
        Scene scene = new Scene(root, 400, 400);


        // Stage
        stage.setTitle("JavaFX Components Example");

        stage.setScene(scene);

        stage.show();

    }


    public static void main(String args[]) {

        launch(args);

    }
}