package view;

import control.ChatController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatWindow extends Stage{
	
	
	//UI Elements
	private Scene scene;
	private TextField messageTF;
	private Button sendBtn;
	private TextArea messagesArea;
	
	private ChatController control;
	
	
	
	public ChatWindow() {
		
		messageTF = new TextField();
		sendBtn = new Button("Enviar");
		messagesArea = new TextArea();
		
		VBox vBox = new VBox();
		vBox.getChildren().add(messageTF);
		vBox.getChildren().add(sendBtn);
		vBox.getChildren().add(messagesArea);
		
		scene = new Scene(vBox, 400,400);
		this.setScene(scene);
		control = new ChatController(this);
	}



	public TextField getMessageTF() {
		return messageTF;
	}



	public Button getSendBtn() {
		return sendBtn;
	}



	public TextArea getMessagesArea() {
		return messagesArea;
	}
	
	
	

	
	
	

}
