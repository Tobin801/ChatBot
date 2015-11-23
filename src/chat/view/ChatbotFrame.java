package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatbotController;

public class ChatbotFrame extends JFrame
{
	private ChatbotController baseController;
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatbotController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setTitle("My window app");
		this.setVisible(true);
	}
	
	public ChatbotController getBaseController()
	{
		return baseController;
	}
}
