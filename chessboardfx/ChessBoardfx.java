/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboardfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Mostafa
 */
public class ChessBoardfx extends Application {
    
    @Override 
    
    public void start(Stage primaryStage){
       
        Pane pane = new Pane(); 
        int HEIGHT = 300; 
        int WIDTH = 300; 
       
        
        for(int i = 0 ; i<8 ; i++){
              boolean isWhite = i%2==0;
            for(int j=0;j<8;j++) {
                Rectangle r1 = new Rectangle(i*WIDTH/8,j*HEIGHT/8,WIDTH/8,HEIGHT/8);
                r1.setStroke(Color.BLACK);
                if(isWhite){
                 r1.setFill(Color.WHITE);
                 isWhite=!isWhite; 
                }
                else {
                r1.setFill(Color.BLACK);
                isWhite=!isWhite; 
                }
                pane.getChildren().add(r1); 
                
                
                
            }
        }
        
      Scene scene = new Scene(pane); 
      primaryStage.setTitle("chess board");
      primaryStage.setScene(scene);
      primaryStage.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args); 
    }
    
}
