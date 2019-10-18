package sample;


import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;


public class ImageTextCell  extends ListCell<Information> {
    private VBox vBox = new VBox(8.0);
    private ImageView thumbImageView = new ImageView();
    private Label label = new Label();

    public ImageTextCell() {
        vBox.setAlignment(Pos.CENTER);

        thumbImageView.setPreserveRatio(true);
        thumbImageView.setFitHeight(100.0);
        vBox.getChildren().add(thumbImageView);

        label.setWrapText(true);
        label.setTextAlignment(TextAlignment.CENTER);
        vBox.getChildren().add(label);

        setPrefWidth(USE_PREF_SIZE);
    }
    @Override
    protected void updateItem(Information item, boolean empty) {
        super.updateItem(item, empty);

        if (empty || item == null) {
            setGraphic(null);
        }
        else {
            thumbImageView.setImage(new Image(item.getImage()));
            label.setText(item.getSurname());
            setGraphic(vBox);
        }
    }
}