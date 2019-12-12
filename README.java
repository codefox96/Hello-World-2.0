import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class README {
    public static void README(String title) {
        Stage window = new Stage();
        window.setTitle("README");
        window.initModality(Modality.APPLICATION_MODAL);
        BorderPane layout = new BorderPane();

        Scene scene = new Scene(layout,300,150);
        VBox bot = new VBox();
        Button close = new Button("Close");
        Label quo = new Label("This is a simple program written to practice creating " +
                "\nbuttons and using lambda expressions. Please be " +
                "\ncareful using the 'All Systems Go' button! It will play " +
                "\naloud. Lastly, the 'Hello World' button will only print in " +
                "\nthe terminal.");
        bot.getChildren().addAll(close, quo);
        close.setOnAction(e -> window.close());

        layout.setCenter(quo);
        layout.setBottom(close);
        window.setScene(scene);
        window.showAndWait();

    }
}


