package source.fsoffice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button termButton;
    private boolean term = true;

    @FXML
    public void termButtonClick(ActionEvent actionEvent) {
        if(term) {
            termButton.setText("Definition");
            term = false;
        }
        else{
            termButton.setText("Term");
            term = true;
        }
    }

    public void uploadFileButtonClick(ActionEvent actionEvent) {
    }

    public void textEntryButtonClick(ActionEvent actionEvent) {
    }
}
