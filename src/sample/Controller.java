package sample;
//

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

    public class Controller {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextArea textArea;

        @FXML
        private AnchorPane usersField;

        @FXML
        private Button sendButton;

        @FXML
        private TextField sendTextField;

        @FXML
        void initialize() {

        }

        public void sendMessage() {
            textArea.appendText("Я: " + sendTextField.getText() + "\n");
            sendTextField.clear();
            sendTextField.requestFocus();
        }

        public void sendByEnter() {
            sendMessage();
        }
    }


