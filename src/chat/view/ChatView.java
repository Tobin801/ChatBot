package chat.view;

import javax.swing.JOptionPane;

public class ChatView
{
	/**
	 * This is an input method using a popup window.
	 * 
	 * @param input Is what you show the user.
	 * @return It returns whatever the user typed.
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, input);
		return answer;
	}
	
	/**
	 * Displays the responce as a popup+
	 * 
	 * @param input
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}

}
