package cr.ac.itcr.chat.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import cr.ac.itcr.chat.GUI.newChat.addChatWindow;
import cr.ac.itcr.chat.GUI.contact;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AppFxmlController {

    @FXML private TextField MsgBox;

    @FXML //When New Chat button is pressed
    private void open_new_chat_selector(ActionEvent event) throws Exception {
        addChatWindow window = new addChatWindow(this); //Passes itself as parameter so that later it can tell the controller who's its parent controller
    }

    //When Send button is pressed
    public void send_msg(ActionEvent actionEvent) {
        System.out.println("Sending msg:" + MsgBox.getText());
    }

    //Method called by child controller when OK button is pressed
    public void add_contact(contact contact){
        System.out.println("IP: "+ contact.getIp());
        System.out.println("Port:"+contact.getPort());
    }
}
