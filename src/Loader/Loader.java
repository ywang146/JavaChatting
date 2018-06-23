package Loader;
import java.awt.Panel;

import javax.swing.*;

import ChattingPanel.ChattingPanel;

public class Loader {
	public final static int weight = 600;
	public final static int height = 800;
	public static void main(String[] args) {
		JFrame jframe = new JFrame("mainwindow");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.getContentPane().add(new ChattingPanel());
		jframe.pack();
		jframe.setSize(weight, height);
		jframe.setVisible(true);
	}
}
