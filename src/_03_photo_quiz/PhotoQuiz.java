package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		String imageUrl="http://free-hd-wall-papers.com/images/puppy-images/puppy-images-1.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component image=loadImage(imageUrl);
		// 3. use the "createImage()" method below to initialize your Component
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ans =JOptionPane.showInputDialog("Is this dog's fur white? This is a yes or no question. ");
		// 7. print "CORRECT" if the user gave the right answer
if(ans.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null,"Correct");
}
else
{
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image);

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.


String imageUrl2= "https://www.topcoder.com/wp-content/uploads/2020/03/covid-19-updates.jpg";

//"https://cdn.guidingtech.com/imager/assets/247482/google-photos-to-icloud-14_40dd5eab97016030a3870d712fd9ef0f.jpg?1575355684";

Component image2=loadImage(imageUrl2);

quizWindow.add(image2);

quizWindow.pack();

String ans2 =JOptionPane.showInputDialog(" does this next picture has something to do with coronavirus. this is yes or no question");
if(ans2.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null,"Correct");
}
else
{
JOptionPane.showMessageDialog(null, "Incorrect");
}



	}

	private Component loadImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
