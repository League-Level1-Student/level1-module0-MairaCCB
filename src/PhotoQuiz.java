/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
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

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		//okay
		// 2. create a variable of type "Component" that will hold your image
		Component bunny1;
		// 3. use the "createImage()" method below to initialize your Component
		Component url = createImage("https://static.boredpanda.com/blog/wp-content/uploads/2014/06/cute-bunnies-tongues-3.jpg");
		// 4. add the image to the quiz window
		quizWindow.add(url);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		int a = 3;
		String age = JOptionPane.showInputDialog("How old is this rabbit?");
		// 7. print "CORRECT" if the user gave the right answer
		if(age.equals(a)) {
		JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(url);
		// 10. find another image and create it (might take more than one line of code)
		Component bunny2; 
		Component url2 = createImage("https://cdn.images.express.co.uk/img/dynamic/128/590x/Rabbit-568411.jpg");
		// 11. add the second image to the quiz window
		quizWindow.add(url2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String cute = JOptionPane.showInputDialog("How cute is this rabbit on a scale of 1 to 10?");
		// 14+ check answer, say if correct or incorrect, etc.
		int cuteness = 100;
		if(cute.equals(cuteness)) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
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
