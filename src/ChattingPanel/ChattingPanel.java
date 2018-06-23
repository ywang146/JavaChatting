package ChattingPanel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Loader.Loader;
public class ChattingPanel extends JPanel{
	
	private JButton sendBtn;
	private JTextArea typingArea;
	
	public ChattingPanel() {
		sendBtn = new JButton("Send");
		typingArea = new JTextArea("Type in here:");
		add(sendBtn);
		add(typingArea);
	}
	
	
}
