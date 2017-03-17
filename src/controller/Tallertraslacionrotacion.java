/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point3D;
import javafx.scene.AmbientLight;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.stage.Stage;
import utilidades.ObjectFactory;
import utilidades.PanelFactory;

/**
 *
 * @author Alejo
 */
public class Tallertraslacionrotacion extends Application {

    Box b1;
    Box b2;
    Box b3;
    Box b4;
    @Override
    public void start(Stage stage) throws Exception {
        //creación del cubo
        b1 = new Box(100, 100, 100);
        b1.setTranslateX(-100);
        b1.setTranslateY(100);
        
        //cubo 2
        b2 = new Box(100,100,100);
        b2.setTranslateX(200);
        b2.setTranslateY(100);
        
         
        // cubo 3
        b3 = new Box(100,100,100);
        b3.setTranslateX(-100);
        b3.setTranslateY(-150);
        
        //Cubo 4
        b4 = new Box(100,100,100);
        b4.setTranslateX(200);
        b4.setTranslateY(-150);
        
        
        //material
        // caja numero 1
         Image imagen = new Image(getClass().getResource("Textura.jpg").toExternalForm());
          PhongMaterial mat = new PhongMaterial();
          mat.setDiffuseMap(imagen); 
         b1.setMaterial(mat);
         
         //Caja numero 2
         Image imagen2 = new Image(getClass().getResource("Fuegos-Artificiales.jpg").toExternalForm());
          PhongMaterial mat2 = new PhongMaterial();
           mat2.setDiffuseMap(imagen2); 
           b2.setMaterial(mat2);
           
           //caja numero 3
         Image imagen3 = new Image(getClass().getResource("agua.jpg").toExternalForm());
          PhongMaterial mat3 = new PhongMaterial();
           mat3.setDiffuseMap(imagen3); 
           b3.setMaterial(mat3);
         
           // caja numero 4
             Image imagen4 = new Image(getClass().getResource("oro.jpg").toExternalForm());
          PhongMaterial mat4 = new PhongMaterial();
           mat4.setDiffuseMap(imagen4); 
           b4.setMaterial(mat4);
           
           
         // caja numero 1
        Node controlPanel = PanelFactory.createControlPanel(stage, b1,b2,b3,b4);
        Node scene3D = ObjectFactory.createScene3D(b1,b2,b3,b4);
        
              
        //luces (cree un AmbientLight)
          AmbientLight light = new AmbientLight();
           light.setTranslateX(-350);
           light.setTranslateY(-180);
            light.setTranslateZ(-500);
           
        
    //Group
        Group root = new Group();
        root.getChildren().add(scene3D);
        root.getChildren().add(controlPanel);
        
        root.getChildren().add(light);
        //agregue al root la scene3D como un hijo 
        //agregue al root el controlPanel como un hijo
        //agregue al root la luz como un hijo
 
        
        
        
        Scene scene = new Scene(root);

        //Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getScene().setCamera(new PerspectiveCamera());
        stage.setResizable(false);
        stage.setTitle("Rotacion General - CG");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
