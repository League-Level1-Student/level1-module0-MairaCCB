import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
public static void main(String[] args) {
	CutenessTV c = new CutenessTV();
	c.createFrame();
}

void createFrame() {
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setTitle("Cute");
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel p = new JPanel();
	
	f.add(p);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	
	b1.setText("Ducks");
	b2.setText("Frog");
	b3.setText("Fluffy Unicorn");
	
	f.pack();
	
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
}

void showDucks() {
    playVideo("https://www.youtube.com/watch?v=EpiGS-3PDU8");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == b1) {
		showDucks();
	}
	
	else if(e.getSource() == b2) {
		showFrog();
	}
	
	else if(e.getSource() == b3) {
		showFluffyUnicorns();
	}
	
}

}
