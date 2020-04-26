package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffects implements ActionListener {
	 JButton button = new JButton();
     JButton button2 = new JButton();
     JButton button3 = new JButton();


	public void showButton() {
      JFrame frame= new JFrame();
      frame.setVisible(true);
      JPanel panel = new JPanel();
      frame.add(panel);
      button.setText("button1");
      button2.setText("button2");
      button3.setText("button3");
      panel.add(button);
      panel.add(button2);
      panel.add(button3);
      frame.pack();
      button.addActionListener(this);
      button2.addActionListener(this);
      button3.addActionListener(this);
      	}
	public void actionPerformed(ActionEvent arg0) {
	
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(buttonPressed.equals(button)) {
			playSound("cymbal.wav");
		}
		if(buttonPressed.equals(button2)) {
			playSound("drum.wav");
		}
		if(buttonPressed.equals(button3)) {
			playSound("sawing-wood-daniel_simon.wav");
		}


	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
}
