package chat.view;

import javax.swing.*;
import java.awt.event.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private JButton chatButton;
	private JTextField chatTextField;
	private SpringLayout baseLayout;
	private JTextArea chatTextArea;
	private JLabel promptLabel;
	
	public ChatPanel(ChatController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		chatTextArea = new JTextArea(10,30);
		chatTextField = new JTextField(30);
		promptLabel = new JLabel("");
		chatButton = new JButton("Submit to ChatBot");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(chatButton);
		this.add(chatTextField);
		this.add(chatTextArea);
		this.add(promptLabel);
		chatTextField.setToolTipText("Type here for the chatbot");
		chatTextArea.setEnabled(false);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, chatTextArea, -115, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatTextArea, -40, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatTextField, 19, SpringLayout.SOUTH, chatTextArea);
		baseLayout.putConstraint(SpringLayout.EAST, chatTextField, 0, SpringLayout.EAST, chatTextArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -183, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{																						
				String userText = chatTextField.getText();  	//Grab user text  √
				String response = baseController.fromUserToChatbot(userText);  //send the text to the controller  √  //give text to chatbot to process √ //get chatbots answer √
				chatTextArea.append("\nUser: " + userText);  //display users text √
				chatTextArea.append("\nChatbot: " + response); //display answer √
				chatTextField.setText(""); //clear user field √
			}
		});
	}
	
	public JTextField getTextField()
	{
		return chatTextField;
	}
}
