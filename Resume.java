import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Resume {
    public static void Resume(String title) {
        GridPane layout = new GridPane();
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);

        Image pic = new Image("Rsmall.jpg");
        layout.getChildren().addAll(new ImageView(pic));

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}
