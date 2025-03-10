import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

class list{
	private JFrame jrFrame;
	private JButton plusButton,deleteButton;
	private JCheckBox check;
	private JLabel headJLabel;
	private JPanel panelout,panelin;
	private JTextField jtxField;
    private JScrollPane scrollPane;
    private int count=0;
	public void attempt() {
		jrFrame = new JFrame();
        jrFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jrFrame.setSize(500, 500);
        jrFrame.setVisible(true);
        
        jrFrame.setLayout(new GridLayout(0,1));
        
        
		panelout = new JPanel();
		panelout.setVisible(true);
		panelout.setLayout(new BoxLayout(panelout, BoxLayout.Y_AXIS));
		
		panelin = new JPanel();
		panelin.setVisible(true);
		panelin.setLayout(new GridLayout(1,3));
		
		scrollPane = new JScrollPane(panelout);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		jtxField = new JTextField();
		jtxField.setHorizontalAlignment(SwingConstants.CENTER);
		
		plusButton = new JButton("Eklemek için basınız");
		plusButton.setFont(new Font("arial",Font.BOLD,20));
		plusButton.setHorizontalAlignment(SwingConstants.CENTER);
		deleteButton = new JButton("X");
		deleteButton.setHorizontalAlignment(SwingConstants.CENTER);
		
		check = new JCheckBox();
		check.setHorizontalAlignment(SwingConstants.CENTER);
		
		headJLabel = new JLabel("TO DO LİST");
		headJLabel.setFont(new Font("arial",Font.BOLD,20));
		headJLabel.setHorizontalAlignment(SwingConstants.CENTER);

		
		Border border= BorderFactory.createLineBorder(Color.BLACK, 4, false);
		headJLabel.setBorder(border);
		panelout.setBorder(border);
		plusButton.setBorder(border);
		deleteButton.setBorder(border);
		jtxField.setBorder(border);
		check.setBorder(border);
		
		panelin.add(check);
		panelin.add(jtxField);
		panelin.add(deleteButton);
		
		scrollPane.add(panelin);
		
		jrFrame.add(headJLabel);
		jrFrame.add(scrollPane);
		jrFrame.add(plusButton);	
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add();
        	    count++;
            }
        });
        jrFrame.setVisible(true);
    	    deleteButton.addActionListener(new ActionListener() {
    			
    			@Override
    			public void actionPerformed(ActionEvent e) {
    				// TODO Auto-generated method stub
    		        panelout.remove(panelin);  
    		        panelout.revalidate();     
    		        panelout.repaint();  
    			}
    		});


        
	}
	
	private void add() {
	    panelin = new JPanel();
	    panelin.setLayout(new GridLayout(1, 3));

	    // Yeni checkbox, textField, deleteButton ekleniyor
	    check = new JCheckBox();
	    check.setHorizontalAlignment(SwingConstants.CENTER);

	    jtxField = new JTextField();
	    jtxField.setHorizontalAlignment(SwingConstants.CENTER);

	    deleteButton = new JButton("X");
	    deleteButton.setHorizontalAlignment(SwingConstants.CENTER);

        deleteButton.addActionListener(e -> {
	        panelout.remove(panelin);  
	        panelout.revalidate();     
	        panelout.repaint();  
        });
	    
	    panelin.add(check);
	    panelin.add(jtxField);
	    panelin.add(deleteButton);

	    panelout.add(panelin);
	    panelout.revalidate();
	    panelout.repaint();      

	}
	

		
}

public class To_do_list {
	public static void main(String[] args) {
		list ls= new list();
		ls.attempt();
	}
}
