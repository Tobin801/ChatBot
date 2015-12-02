package chat.controller;

import chat.view.ChatView;
import chat.model.Chatbot;
import chat.view.ChatFrame;

/**
 * Controller for the Chatbot project.
 * 
 * @author tand6053
 *
 */

public class ChatController
{
	private ChatView display;
	private Chatbot myChatBot;
	private ChatFrame baseFrame;

	public ChatController()
	{
		display = new ChatView();
		String user = display.getAnswer("What is your name?");
		myChatBot = new Chatbot(user);
		baseFrame = new ChatFrame(this);
	}

	public void start()
	{
		display.displayResponse("Hello " + myChatBot.getUserName());
		//chat();
	}
	
	private void chat()
	{
		String textFromUser = display.getAnswer("What do you wish to talk about today good sir?");
		while(myChatBot.lengthChecker(textFromUser))
		{
			textFromUser = myChatBot.processConversation(textFromUser);
			textFromUser = display.getAnswer(textFromUser);
		}
	}
	
	public String fromUserToChatbot(String textFromUser)
	{
		String botResponse = "";
		
		botResponse = myChatBot.processConversation(textFromUser);
		
		return botResponse;
	}
	
	public Chatbot getChatbot()
	{
		return myChatBot;
	}
	
	public ChatView getChatView()
	{
		return display;
	}
	
	public ChatFrame getBaseFrame()
	{
		return baseFrame;
	}
}