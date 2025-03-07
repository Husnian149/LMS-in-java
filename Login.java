import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Login extends Application {
    //Default Account
    public String userId = "admin";
    public String password = "1234";
        @SuppressWarnings("unused")
    public void start(Stage stage) {
        stage.setResizable(false);
        GridPane root = new GridPane();
        //login 
        ImageView icon = new ImageView(new Image("loginicon.png"));
        icon.setFitWidth(300);
        icon.setFitHeight(170);
        Label text = new Label("User ID");
        text.setStyle("-fx-font-weight:Bold");
        TextField textField = new TextField();
        textField.setPromptText("Enter User name");
        textField.setPrefSize(300,30);
        Label text2 = new Label("User Password");
        text2.setStyle("-fx-font-weight:Bold");
        PasswordField textField2 = new PasswordField();
        textField2.setPromptText("Enter User Password");
        textField2.setPrefSize(300,30);

        Button button = new Button("Login>>");
        button.setPrefSize(300, 30);
        button.setStyle("-fx-font-weight:Bold;");
        Button button1 = new Button("Create Account");
        button1.setPrefSize(300, 30);
        button1.setStyle("-fx-background-color: rgb(255, 255, 255)");
        //sign up
        Label signUp = new Label("Sign up Page");
        signUp.setStyle("-fx-font-size: 25px; -fx-text-fill:rgb(36, 124, 206);-fx-font-weight:Bold;");   
        GridPane.setHalignment(signUp, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(signUp, javafx.geometry.VPos.CENTER);  

        Label userLabel = new Label("User ID");
        userLabel.setStyle("-fx-font-weight:Bold");
        TextField userField = new TextField();
        userField.setPromptText("Enter User name");
        userField.setPrefSize(300,30);

        Label labelPassword1 = new Label("User Password");
        labelPassword1.setStyle("-fx-font-weight:Bold");
        PasswordField passwordField1 = new PasswordField();
        passwordField1.setPromptText("Enter password");
        passwordField1.setPrefSize(300,30);

        Label labelPassword2 = new Label("Conform Password");
        labelPassword2.setStyle("-fx-font-weight:Bold");
        PasswordField passwordField2 = new PasswordField();
        passwordField2.setPromptText("Conform Password");
        passwordField2.setPrefSize(300,30);

        Button buttonSignUp = new Button("Sign up");
        buttonSignUp.setPrefSize(300, 30);
        buttonSignUp.setStyle("-fx-font-weight:Bold;");
        
        
        VBox columSi = new VBox(10,userLabel,userField,labelPassword1,passwordField1,labelPassword2,passwordField2);
        VBox colum = new VBox(10,text,textField,text2,textField2,button);
        root.setAlignment(Pos.TOP_CENTER);
        root.setVgap(30);
        root.setHgap(30);
        root.add(icon,1,1);
        root.add(colum,1,2);
        root.add(button1,1,3);
        button.setOnAction(event -> {
            String userIdSi = textField.getText();
            String passwordSi = textField2.getText();
            double org = 1122;
            if (userIdSi.equals(userId) && password.equals(passwordSi)) {
                JOptionPane.showMessageDialog(null,"Login Successful!");

                // Close the login window
                stage.close();

                // Open Main Window
                Main mainApp = new Main();
                mainApp.main(userId);
                Stage mainStage = new Stage();
                try {
                    mainApp.start(mainStage); // Start Main Window
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null,"Incorrect userIdSi or Password!");
                
            }
        });
        button1.setOnAction(event -> {
            root.getChildren().clear();
            root.add(signUp,1,1);
            root.add(columSi,1,2);
            root.add(buttonSignUp,1,3);

        });
        buttonSignUp.setOnAction(event -> {
            String newUser = userField.getText();
            String newPassword1 = passwordField1.getText();
            String newPassword2 = passwordField2.getText();
            if (newPassword1.equals(newPassword2) && !newUser.isEmpty()) {
                userId = newUser;
                password = newPassword1;
                JOptionPane.showMessageDialog(null,"You Account is Created ");
                root.getChildren().clear();
                root.setAlignment(Pos.TOP_CENTER);
                root.setVgap(30);
                root.setHgap(30);
                root.add(icon,1,1);
                root.add(colum,1,2);
                root.add(button1,1,3);
            }
            else {
                JOptionPane.showMessageDialog(null, "Your Account Datel is wrong");
            }

        });
  Scene scene = new Scene(root, 380, 470);
  
  stage.setTitle("Library Menagment System");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
