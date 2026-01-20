package motorandlight;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import com.fazecast.jSerialComm.SerialPort;

public class MainController {

    @FXML
    void lightButton(ActionEvent event) {
        System.out.println("Light ON!");
    }
    
    @FXML
    void onButtonpresss(MouseEvent event) {
       
        
        
    }

    @FXML
    void onButtonrelease(MouseEvent event) {

    }

}
