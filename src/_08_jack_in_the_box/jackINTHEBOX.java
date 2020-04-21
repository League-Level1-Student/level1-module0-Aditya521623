package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class jackINTHEBOX implements ActionListener {

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
			JOptionPane.showMessageDialog(null, "hello");
		}
		
	}


	
}
