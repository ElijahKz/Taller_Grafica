/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point3D;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Box;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Alejo
 */
public class FXMLDocumentController implements Initializable {

    private Stage stage;

    @FXML
    private Slider slAngle;

    @FXML
    private Slider slAngle1;

    Box bb;
    Box bb1;

    @FXML
    private Pane panelGrafico;
   
    
    private Timeline tiempo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tiempo = new Timeline(new KeyFrame(Duration.seconds(1),
                new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                
            bb.setRotate(45);
                   
            
            
                
      
            } }));
        
        tiempo.setCycleCount(Animation.INDEFINITE);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Pane getPanelGrafico() {
        return panelGrafico;
    }

    public void setObjetoGeometrico(Box b) {
        this.bb = b;
    }

    public void setObjetoGeometrico1(Box b) {
        this.bb1 = b;
    }

    public Slider getSlAngle() {
        return slAngle;
    }
    
    public Slider getSlAngle1() {
        return slAngle1;
    }

    //Método del primer Slider
    @FXML
    public void handleDraggedSliderAngle() {
        
        
    }
     @FXML
     public void iniciar(){
     tiempo.play();
     
     }
    //Método del segundo Slider
    @FXML
    public void handleDraggedSliderAngle1() {
        
        
    }
}
