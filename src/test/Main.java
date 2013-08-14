package test;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	
	static JFrame frame = new JFrame("Game");
	
	public static void main(String args[]) {
		
		System.out.println("I am a gitrepo test! :) ");
		
		System.out.println("lol");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.add(new JLabel("Lol"));
		frame.setVisible(true);
		
	}
}
