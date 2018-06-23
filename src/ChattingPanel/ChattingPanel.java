package ChattingPanel;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import Loader.Loader;
public class ChattingPanel extends JPanel{
	
	private JButton sendBtn;
	private JTextArea typingArea;
	
	public ChattingPanel() {
		sendBtn = new JButton("Send");
		Rectangle sendBtnPosition = new Rectangle(getWidth() - 90,getWidth() - 50,70,25);
		sendBtn.setBounds(sendBtnPosition);
		typingArea = new JTextArea("Type in here:");
		typingArea.setBounds(0, getWidth()-20, getWidth(), getHeight()-(getWidth()+20));
		typingArea.setLineWrap(true);
		typingArea.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		this.setLayout(null);
		add(sendBtn);
		add(typingArea);
	}
	
	public int getWidth() {
		int width = 0;
		width = Loader.getWidth();
		return width;
	}
	
	public int getHeight() {
		int height = 0;
		height = Loader.getHeight();
		return height;
	}
	
}
