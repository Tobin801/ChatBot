package chat.view;

import javax.swing.*;

import java.awt.event.*;

import chat.controller.ChatbotController;

public class ChatbotPanel extends JPanel
{
	private ChatbotController baseController;
	private JButton firstButton;
	private JTextField firstTextField;private SpringLayout baseLayout;
	private JTextArea firstTextArea;
	
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
		this.add(firstButton);
		this.add(firstTextField);
		this.add(firstTextArea);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 134, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -70, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 79, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 159, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
