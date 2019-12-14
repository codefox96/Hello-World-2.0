import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//enables javafx functionality

public class Main extends Application {

    Scene home;
    public static void main(String[] args) {
        launch(args);                                                                                                   //allow program to use javafx
    }


    public void start(Stage primaryStage) {
        GridPane layout = new GridPane();                                                                               //set node position style
        home = new Scene(layout);
        layout.setHgap(10);
        layout.setVgap(10);
                                                                                                                        //Add PDF to show in Resume class
        Button button = new Button("My Resume!");                                                                       //adds button on home page
        button.setStyle("-fx-font-size: 5em; -fx-border-color:black;");
        layout.getChildren().addAll(button);                                                                            //set node positions
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setOnAction(e -> Resume.Resume("My Resume"));                                                       //lambda expression for user scene change


        Button button2 = new Button("README");                                                                          //Learn to accept user input and implement basic code for riddle keyword match
        button2.setStyle("-fx-background-color: #00ff00; -fx-font-size: 5em; -fx-border-color:black;");
        layout.add(button2, 1, 0);
        button2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button2.setOnAction(e -> README.README("Answer this Riddle!"));


        Button button3 = new Button("All Systems Go!");
        button3.setStyle("-fx-background-color: #ffde7d; -fx-font-size: 5em; -fx-border-color:black;");
        layout.add(button3,  0, 1,1,1);
        button3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button3.setOnAction(e -> Song.Song());                                                                          //Create a new class that plays random meme sound when clicked


        Button button4 = new Button("Hello World!");
        button4.setStyle("-fx-background-color: #ffff00; -fx-font-size: 5em; -fx-border-color:black;");
        layout.add(button4,1, 1,1,1);
        button4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button4.setOnAction(new EventHandler<ActionEvent>() {
           
            public void handle(ActionEvent event) {
                System.out.println("Hello World 2.0!");
            }
        });



        primaryStage.setScene(home);
        primaryStage.setTitle("Hello World 2.0!");
        primaryStage.show();
    }
}
