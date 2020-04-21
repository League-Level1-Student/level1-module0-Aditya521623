package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
	
	
	 public void showButton() {
           System.out.println("Button clicked");
           
           JFrame frame=new JFrame(); 
           frame.setVisible(true);
           JButton button = new JButton();
           frame.add(button);
           frame.pack();
           button.addActionListener(this);
           button.setText("click me");
           
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		int rand = new Random().nextInt(5);
		
		if(rand==1) {
			JOptionPane.showMessageDialog(null, "you will find 1 million dollars in your bank tommorow");
		}
		else if(rand==2) {
			JOptionPane.showMessageDialog(null, "when you wake up, you will be rich");
		}
		else if(rand==3) {
			JOptionPane.showMessageDialog(null, "your parents will let you do whatever you want for the next week."); 
		}
		else if(rand==4) {
		
			JOptionPane.showMessageDialog(null, "you will meet your favorite celebrity tommorow morning");
		}
		
	}

}

