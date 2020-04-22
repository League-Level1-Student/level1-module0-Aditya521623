package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffects implements ActionListener {


	public void showButton() {
      JFrame frame= new JFrame();
      frame.setVisible(true);
      JPanel panel = new JPanel();
      frame.add(panel);
      JButton button = new JButton();
      JButton button2 = new JButton();
      JButton button3 = new JButton();
      button.setText("button1");
      button2.setText("button2");
      button3.setText("button3");
      panel.add(button);
      panel.add(button2);
      panel.add(button3);
      frame.pack();
      	}
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
