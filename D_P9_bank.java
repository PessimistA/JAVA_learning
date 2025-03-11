
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

class frame{
	protected JFrame jrxFrame;
	protected JLabel nameLabel;
	
	public frame() {
		jrxFrame= new JFrame();
		jrxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jrxFrame.setVisible(true);
		jrxFrame.setSize(500, 500);
		jrxFrame.setLayout(new GridLayout(0, 1));
		
		nameLabel = new JLabel("Bankanıza HOŞ GELDİNİZ");
		nameLabel.setFont(new Font("arial",Font.BOLD,20));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Border border =BorderFactory.createLineBorder(Color.BLACK, 4, false);
		nameLabel.setBorder(border);
		
		jrxFrame.add(nameLabel);
	}
	public JFrame add_frame() {
		jrxFrame= new JFrame();
		jrxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jrxFrame.setVisible(true);
		jrxFrame.setSize(500, 500);
		jrxFrame.setLayout(null);
		return jrxFrame;
	}
	
}
class panel_enteranceScreen extends frame{
	
	public panel_enteranceScreen(){
		super();
	}
	
	public JPanel panel_first_page() {
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(1,0));
		Border border =BorderFactory.createLineBorder(Color.BLACK, 4, false);
		panel.setBorder(border);
		return panel;
	}
	public void panel_add_secondPage() {
		JPanel panel3;
		JPanel panel2;
		JFrame frame; 
		frame= add_frame();
		
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(0,1));
		panel3.setBackground(Color.black);
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(0, 1));//sağdaki boş sayfa
		panel2.setBackground(Color.red);
		
		frame.add(panel3,BorderLayout.WEST);
		frame.add(panel2,BorderLayout.EAST);
		frame.setVisible(true);
			
	}
}
class button_enteranceScreen extends panel_enteranceScreen{
	public button_enteranceScreen() {
		super();
	}
	public void enterance_page() {
		JPanel panel=panel_first_page();
		Border border =BorderFactory.createLineBorder(Color.BLACK, 4, false);
		 
		JButton krediButton,bankButton;
		 krediButton = new JButton("Kredi Kartı");
		 krediButton.setBorder(border);
		 krediButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel_add_secondPage();
			}
		});
		 
		 bankButton = new JButton("Banka Kartı");
		 bankButton.setBorder(border);
		 
		 panel.add(krediButton);
		 panel.add(bankButton);
		 
		 jrxFrame.add(panel);
		 jrxFrame.setVisible(true);
	}
}

public class bank {
	public static void main(String[] args) {
		button_enteranceScreen bt= new button_enteranceScreen();
		bt.enterance_page();
	}
}
