package controlsUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class PasswordFieldVerification extends Application {
   public void start(Stage stage) {
      //Creating nodes
      TextField textField = new TextField();
      PasswordField pwdField = new PasswordField();
      Button button = new Button("Submit");
      button.setTranslateX(250);
      button.setTranslateY(75);
      //Creating labels
      Label label1 = new Label("Name: ");
      Label label2 = new Label("Password: ");
      //Setting the message with read data
      Text text = new Text("");
      Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10);
      text.setFont(font);
      text.setTranslateX(15);
      text.setTranslateY(125);
      text.setFill(Color.BROWN);
      //Displaying the message
      button.setOnAction(e -> {
         //Retrieving data
         String name = textField.getText();
         String pwd = pwdField.getText();
         if(pwd.equals("abc123")) {
            text.setText("Hello "+name+" welcome to Tutorialspoint");
         } else {
            text.setText("Wrong password try again");
         }
      });
      //Adding labels for nodes
      HBox box = new HBox(5);
      box.setPadding(new Insets(25, 5 , 5, 50));
      box.getChildren().addAll(label1, textField, label2, pwdField);
      Group root = new Group(box, button, text);
      //Setting the stage
      Scene scene = new Scene(root, 595, 150, Color.BEIGE);
      stage.setTitle("Password Field Example");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[]){
      launch(args);
   }
}

// thank you for this code sample to:  https://www.tutorialspoint.com/how-to-verify-the-password-entered-in-the-javafx-password-field

