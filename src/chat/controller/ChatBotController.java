package chat.controller;

import chat.view.ChatbotView;
import chat.model.Chatbot;

/**
 * Controller for the Chatbot project.
 * 
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
		chat();
	}
	
	private void chat()
	{
		String textFromUser = myChat.getAnswer("What do you like?");
		while(myChatBot.lengthChecker(textFromUser))
		{
			if(myChatBot.contentChecker(textFromUser))
			{
				myChat.displayResponse("Wow, I had no idea you loved " + myChatBot.getContent());
			}
			
			 textFromUser = myChat.getAnswer("KA-KA-KA-KOMBO BREAKER!!!!!!" + textFromUser);
		}
	}
	
}