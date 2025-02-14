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


//ikinci örnek

import java.awt.Color;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.PageAttributes.ColorType;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.NonReadableChannelException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GUI {
	public static void main(String[] args) {
		JFrame frame1 =new JFrame();
		JFrame frame2 =new JFrame();
		frame1.setSize(400, 400);
		frame2.setSize(400, 400);
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 =new JPanel();
		JRadioButton radio =new JRadioButton("A");
		JRadioButton radio1 =new JRadioButton("B");
		JRadioButton radio2 =new JRadioButton("C");
		panel1.add(radio);
		panel1.add(radio1);
		panel1.add(radio2);
		panel1.setBounds(200,0,100,200);
		
		
		JButton button1 =new JButton();
		JButton button2 =new JButton("bu diğeri ");
		JButton button3 =new JButton("bu onunda diğeri");
		button1.setText("bas");
		button1.setBounds(0, 0, 100, 30);//x,y,genişlik,uzunluk
		button2.setBounds(0, 30, 100, 30);//x,y,genişlik,uzunluk
		button3.setBounds(0, 60, 100, 30);//x,y,genişlik,uzunluk
		
		button1.addActionListener(new ActionListener() {//basıldığında aktif oluyor
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField txTextField = new JTextField();
				frame2.add(txTextField);// tek bir satur için
				frame2.setVisible(true);
				
			}
		});
		button2.addActionListener(new ActionListener() {//basıldığında aktif oluyor
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextArea txTextField = new JTextArea();
				frame2.add(txTextField);// bir çok satır aşağıya inebilirsin
				frame2.setVisible(true);
				
			}
		});
		button3.addActionListener(new ActionListener() {//basıldığında aktif oluyor
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextPane txTextField = new JTextPane();
				frame2.add(txTextField);// bir çok satır
				frame2.setVisible(true);
				
			}
		});
		String[] arr= {"ilk","ikinci","üçüncü","dördüncü"};
		JComboBox bx = new JComboBox(arr);
		bx.setBounds(0, 90, 100, 30);
			
		frame1.add(bx);
		frame1.add(button1);
		frame1.add(button2);
		frame1.add(button3);
		frame1.add(panel1);
		frame1.setLayout(null);
		frame1.setVisible(true);		
	}
}
