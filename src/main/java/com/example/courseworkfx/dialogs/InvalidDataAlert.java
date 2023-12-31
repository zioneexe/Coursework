package com.example.courseworkfx.dialogs;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * The `InvalidDataAlert` class is responsible for displaying an alert when invalid data is detected.
 * It extends the JavaFX `Application` class and shows an error alert when started.
 */
public class InvalidDataAlert extends Application {

    /**
     * Shows the invalid data alert by launching a new instance of the `InvalidDataAlert` class.
     *
     * @throws Exception If an exception occurs during the alert display.
     */
    public static void showInvalidDataAlert() throws Exception {
        InvalidDataAlert alert = new InvalidDataAlert();
        Stage stage = new Stage();
        alert.start(stage);
    }

    /**
     * JavaFX Application start method.
     *
     * @param stage The primary stage for the application.
     * @throws Exception If an exception occurs during the alert display.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Oooh..");
        alert.setContentText("Your input is unacceptable!");
        alert.showAndWait();
    }
}
