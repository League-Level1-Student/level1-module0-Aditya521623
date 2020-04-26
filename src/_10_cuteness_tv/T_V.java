package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class T_V implements ActionListener {

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


	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(buttonPressed.equals(button)){
			showDucks();
		}
		if(buttonPressed.equals(button2)) {
			showFrog();
		}
		if(buttonPressed.equals(button3)) {
			showFluffyUnicorns();
		}
		
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=fZEHhLloF0w");
	}
	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}


	private void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
		
	}
	
}