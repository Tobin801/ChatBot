package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author Tobin Andersen
 * @version 1.5 10/23/15 Added switches.
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private ArrayList<String> keyboardMashList;
	private ArrayList<String> quitList;
	private String userName;
	private String content;
	private boolean keyboardMashChecker;
	private boolean quitChecker;
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.memesList = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		this.userName = userName;
		this.content = "VideoGames";
		
		buildMemesList();
		buildPoliticalTopicsList();
	}
	
	private void buildMemesList()
	{
		this.memesList.add("cute animals");
		this.memesList.add("doge");
		this.memesList.add("No johns");
		this.memesList.add("Bush did 7/11");
		this.memesList.add("u wot m8");
		this.memesList.add("gooby, plz");
		this.memesList.add("JUST DO IT!!!");
		this.memesList.add("Asuming Direct Control");
		this.memesList.add("Derp");
		this.memesList.add("MOAR");
	}
	
	private void buildPoliticalTopicsList()
	{
		this.politicalTopicList.add("Trump");
		this.politicalTopicList.add("GamerGate");
		this.politicalTopicList.add("President");
		this.politicalTopicList.add("Government Shutdown");
		this.politicalTopicList.add("Deez nuts for president");
		this.politicalTopicList.add("Republican");
		this.politicalTopicList.add("Democrat");
		this.politicalTopicList.add("Economy");
		this.politicalTopicList.add("Debates");
		this.politicalTopicList.add("November 8, 2016");
	}
	
	private void buildKeyboardMashList()
	{
		this.keyboardMashList.add("sdf");
		this.keyboardMashList.add("dfg");
		this.keyboardMashList.add("cvb");
		this.keyboardMashList.add(",./");
		
	}
	
	private void buildQuitList()
	{
		this.quitList.add("quit");
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput !=null)
		{
			if(currentInput.length() >= 1)
			{
				hasLength = true;
			}
		}
		
		return hasLength;
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if(currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		
		return hasContent;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean hasPoliticalTopic = false;
		
		for(String politicalTopic : politicalTopicList)
		{
			if(currentInput.toLowerCase().contains(politicalTopic.toLowerCase()))
			{
				hasPoliticalTopic = true;
			}
		}
		
		return hasPoliticalTopic;
	}
	
	public boolean keyboardMashChecker(String currentInput)
	{
		boolean hasMash = false;
		
		for(String keyboardMash : keyboardMashList)
		{
			if(currentInput.toLowerCase().contains(keyboardMash.toLowerCase()))
			{
				hasMash = true;
			}
		}
		
		return hasMash;
	}
	
	public boolean quitChecker(String currentInput)
	{
		boolean hasQuit = false;
	
		if(currentInput.toLowerCase().equals("quit"))
		{
			hasQuit = true;
		}
		
		return hasQuit;
	}
	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		
		for(String meme : memesList)
		{
			if(currentInput.toLowerCase().contains(meme.toLowerCase()))
			{
				hasMeme = true;
			}
		}
		
		return hasMeme;
	}
	
public String processConvesation(String currentInput)
{
	String nextConversation = "What else do you want to talk about?";
	int randomTopic = (int) (Math.random() * 5); //Generates a random number between 0 and 4.
	
	switch (randomTopic)
	{
		case 0:
			if(contentChecker(currentInput))
			{
				nextConversation = "You talked about a special topic, neat! what else do you like?";
			}
			break;
		case 1:
			if(memeChecker(currentInput))
			{
				nextConversation = "Nice meme! What is your favorite food?";
			}
			break;
		case 2:
			if(politicalTopicChecker(currentInput))
			{
				nextConversation = "I didn't know you were so political! What are your hobies?";
			}
			break;
		case 3:
			//Choose your own test here
			if(currentInput.contains("Fallout 4"))
			{
				nextConversation = "I'm really exited for Fallout 4! Hopefully it won't suck. What is your favorite color?";
			}
			break;
		case 4:
			//Random Topic for chat here.
			nextConversation = "Intresting... Do like consoles or pc?";
			break;
		default:
			//Never will happen!
			nextConversation = "Comment and a question";
			break;
	}
	
	return nextConversation;
}
	
	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return null;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return null;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		
	}
	
	
	
	
	
}