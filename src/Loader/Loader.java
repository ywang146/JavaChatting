package Loader;
import java.awt.Panel;

import javax.swing.*;

import ChattingPanel.ChattingPanel;

public class Loader {
	public final static int width = 600;
	public final static int height = 800;
	public static void main(String[] args) {
		JFrame jframe = new JFrame("mainwindow");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.getContentPane().add(new ChattingPanel());
		jframe.pack();
		jframe.setSize(width, height);
		jframe.setVisible(true);
	}
	
	public static int getWidth() {
		return width;
	}
	
	public static int getHeight() {
		return height;
	}
}
