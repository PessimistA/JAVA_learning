import java.awt.Color;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.PageAttributes.ColorType;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	public static void main(String[] args) {
		JFrame frame1 =new JFrame();
		JFrame frame2 =new JFrame();
		frame1.setSize(200, 200);
		frame2.setSize(200, 200);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 =new JPanel();
		JButton button1 =new JButton();
		button1.setText("bas");

		JLabel label1 = new JLabel();
		label1.setText("çıkmaz sokak");
		frame2.add(label1);
		button1.setBounds(0, 0, 100, 30);//x,y,genişlik,uzunluk
		
		button1.addActionListener(new ActionListener() {//basıldığında aktif oluyor
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame2.setVisible(true);
				
			}
		});
		
		//panel1.add(button1);
		//frame1.add(panel1);
		frame1.add(button1);
		frame1.setLayout(null);
		frame1.setVisible(true);
		
		
	}
}
