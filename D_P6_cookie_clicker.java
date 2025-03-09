package applicatios;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class cookie{
	private JFrame jrFrame;
	private JButton cookieButton;
	private JLabel labelcookieJLabel,namelabel,countlabel;
	private int count=0;
	
	public void attempt() {
		jrFrame = new JFrame();
        jrFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jrFrame.setSize(600, 600);
        jrFrame.setVisible(true);
        
        jrFrame.setLayout(null);
        
        ImageIcon icon = new ImageIcon("C:\\(dosya yolu)\\image_folder\\image1.png");//must be png
        ImageIcon icon1 = new ImageIcon("C:\\(dosya yolu)\\image_folder\\image2.png");
        
        labelcookieJLabel= new JLabel(icon1);
        labelcookieJLabel.setBounds(100, 0, 400,50);
        
        cookieButton = new JButton(icon);
        cookieButton.setBounds(100, 100, 400, 250);

        
        namelabel = new JLabel("Cookie:Count");
        namelabel.setBounds(100, 400, 200,50);
        namelabel.setFont(new Font("arial",Font.BOLD,20));
        
        countlabel = new JLabel();
        countlabel.setBounds(300, 400, 50, 50);
        countlabel.setFont(new Font("arial",Font.BOLD,20));
        countlabel.setText(""+count);
        
        jrFrame.add(cookieButton);
        jrFrame.add(namelabel);
        jrFrame.add(countlabel);
        jrFrame.add(labelcookieJLabel);
        
        cookieButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
		        countlabel.setText(""+count);
			}
		});
	}
}

public class cookie_clicker {
	public static void main(String[] args) {
		cookie cook=  new cookie();
		cook.attempt();
		
	}
}
