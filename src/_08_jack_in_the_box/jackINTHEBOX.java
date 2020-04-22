package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class jackINTHEBOX implements ActionListener {
	JLabel jackLabelWithImage;

	int counter = 0;
	
	public void showButton() {
			
		JFrame frame=new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		JButton button= new JButton();
		
		frame.add(button);
		
		frame.pack();
		
		button.addActionListener(this);
		
		button.setText("click me 5 times");
	
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		counter=counter+1;
		if(counter==5) {
			
			JFrame frame = new JFrame();
			
			frame.setVisible(true);
			
			JPanel panel= new JPanel();
			
			frame.add(panel);
		String name = "jackInTheBox.png";
		
		  jackLabelWithImage = createLabelImage(name);

		  panel.add(jackLabelWithImage);
			
	panel.setLayout(new GridLayout());
		
	frame.pack();
	
	playSound("homer-woohoo.wav");
		}
		
		
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			}
			Icon icon = new ImageIcon(imageURL);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}



	
}
