package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main-Window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 363, 424);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        HelloController controller = fxmlLoader.getController();
        controller.AllClear(new ActionEvent());
        controller.InputText.setFont(new Font(24));
        controller.InputText.setText("0");
        scene.setOnKeyPressed(event -> {
            System.out.println(event.getCode() + "\t" + event.getText());

            switch (event.getCode()){
                case DIGIT0:
                case NUMPAD0: controller.PressedZero(new ActionEvent());
                    break;
                case DIGIT1:
                case NUMPAD1: controller.PressedOne(new ActionEvent());
                    break;
                case DIGIT2:
                case NUMPAD2: controller.PressedTwo(new ActionEvent());
                    break;
                case DIGIT3:
                case NUMPAD3: controller.PressedThree(new ActionEvent());
                    break;
                case DIGIT4:
                case NUMPAD4: controller.PressedFour(new ActionEvent());
                    break;
                case DIGIT5:
                case NUMPAD5: controller.PressedFive(new ActionEvent());
                    break;
                case DIGIT6:
                case NUMPAD6: controller.PressedSix(new ActionEvent());
                    break;
                case DIGIT7:
                case NUMPAD7: controller.PressedSeven(new ActionEvent());
                    break;
                case DIGIT8:
                case NUMPAD8: controller.PressedEight(new ActionEvent());
                    break;
                case DIGIT9:
                case NUMPAD9: controller.PressedNine(new ActionEvent());
                    break;
                case ADD:
                case PLUS: controller.Addition(new ActionEvent());
                    break;
                case SUBTRACT:
                case MINUS: controller.Subtraction(new ActionEvent());
                    break;
                case MULTIPLY: controller.Multiply(new ActionEvent());
                    break;
                case DIVIDE: controller.Divide(new ActionEvent());
                    break;
                case EQUALS:
                case ENTER: controller.Result(new ActionEvent());
                break;
                case BACK_SPACE:controller.backslash(new ActionEvent());
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}