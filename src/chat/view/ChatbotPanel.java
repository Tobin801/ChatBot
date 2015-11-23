package chat.view;

import javax.swing.*;

import java.awt.event.*;

import chat.controller.ChatbotController;

public class ChatbotPanel extends JPanel
{
	private ChatbotController baseController;
	private JButton chatButton;
	private JTextField chatTextField;
	private SpringLayout baseLayout;
	private JTextArea chatTextArea;
	
	public ChatbotPanel(ChatbotController baseController)
	{
		this.baseController = baseController;
		
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
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 134, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -70, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatTextField, 79, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatTextField, 159, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
