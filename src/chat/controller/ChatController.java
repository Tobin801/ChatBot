package chat.controller;

import chat.view.ChatView;
import chat.model.Chatbot;

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

	public ChatController()
	{
		display = new ChatView();
		String user = display.getAnswer("What is your name?");
		myChatBot = new Chatbot(user);
	}

	public void start()
	{
		display.displayResponse("Hello " + myChatBot.getUserName());
		chat();
	}
	
	private void chat()
	{
		String textFromUser = display.getAnswer("What do you wish to talk about today good sir?");
		while(myChatBot.lengthChecker(textFromUser))
		{
			if(myChatBot.contentChecker(textFromUser))
			{
				display.displayResponse("Wow, I had no idea you loved " + myChatBot.getContent());
			}
			else if(myChatBot.memeChecker(textFromUser))
			{
		//		display.displayResponse("Nice meme.");
			}
			
			 textFromUser = display.getAnswer("What else do you want to talk about besides " + textFromUser + " ?");
		}
	}
	
	public Chatbot getChatbot()
	{
		return myChatBot;
	}
	
	public ChatView getChatView()
	{
		return display;
	}
}