/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_ms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author zkzk
 */
public class Tutorial_MS extends Application {
    @Override
    public void start(final Stage primaryStage) {
        GridPane grid1 = new GridPane();
        grid1.setAlignment(Pos.CENTER);
        grid1.setHgap(5);
        grid1.setVgap(5);
        grid1.setPadding(new Insets(20,20,20,20));
        
        Button btn1 = new Button("click me");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                clicker c1 = new clicker();
                c1.show();
//                primaryStage.close();
            }
        });
        grid1.add(btn1, 1, 1);
        Scene scene = new Scene(grid1, 300, 300);
        primaryStage.setTitle("Login form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
