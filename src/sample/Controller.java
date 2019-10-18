package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class Controller {

    @FXML private ListView<Information> listView;
    @FXML private ImageView contactImageView;
    @FXML private TextField firstTextField;
    @FXML private TextField lastTextField;
    @FXML private TextField phoneTextField;
    @FXML private TextField mailTextField;


    private final ObservableList<Information> list  = FXCollections.observableArrayList();

    public void initialize() {
        list.add(new Information("Aleksandr", "Pushkin", "+996777777777", "pushkin@gmail.com", "sample/images/small/pushkin.jpeg"));
        list.add(new Information("Marina", "Cvetaeva", "+996555555555", "marina@gmail.com", "sample/images/small/cvetaeva.jpeg"));
        list.add(new Information("Sergey", "Esenin", "+996707707707", "s.esenin@gmail.com","sample/images/small/esenin.jpg" ));



        listView.setItems(list);

        listView.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Information>() {
                    @Override
                    public void changed(ObservableValue<? extends Information> ov, Information oldValue, Information newValue) {
                        contactImageView.setImage(
                                new Image(newValue.getImage())
                        );
                        firstTextField.setText(newValue.getName());
                        lastTextField.setText(newValue.getSurname());
                        phoneTextField.setText(newValue.getPhone());
                        mailTextField.setText(newValue.getMail());


                    }
                }

        );
        listView.setCellFactory(
                new Callback<ListView<Information>, ListCell<Information>>() {
                    @Override
                    public ListCell<Information> call (ListView<Information> listView) {
                        return new ImageTextCell();
                    }
                }
        );

    }
}