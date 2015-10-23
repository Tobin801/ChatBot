package chat.controller;

import chat.view.ChatbotView;
import chat.model.Chatbot;

/**
 * Controller for the Chatbot project.
 * @author tand6053
 *
 */

public class ChatbotController
{
	private ChatbotView myChat;
	private Chatbot myChatBot;
	
	public ChatbotController()
	{
		myChat = new ChatbotView();
		String user = myChat.getAnswer("What is your name?");
		myChatBot = new Chatbot(user);
	}
	
	public void start()
	{
		myChat.displayResponse("Hello " + myChatBot.getUserName());
	}
}
