import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

class notepadd{
	static public JFrame fr ;
	static public JTextPane tx;
	static public JTextField ftx;
	static public JButton bt;
	static public JPanel pn;
	static public JMenu file,arrange,appearance,color;
	static public JMenuItem savebttn,new_pagebttn,closebttn,findbttn,colorbttn,chartbttn, blackbttn,whitebttn,greenttn,bluebttn,redbttn;
	static public JMenuBar mBar;

	public void start() {
		naming();
		placement();
		colors();
		findt();
	}
	public void naming() {
	    fr = new JFrame("Notepad"); 

        tx = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(tx);
	    ftx = new JTextField();
	    
	    
	    savebttn = new JMenuItem("Save");
	    new_pagebttn = new JMenuItem("New Page");
	    closebttn = new JMenuItem("Close");
	    findbttn = new JMenuItem("Find");
	    colorbttn = new JMenuItem("Color");
	    blackbttn = new JMenuItem("Black");
	    whitebttn = new JMenuItem("White");
	    greenttn = new JMenuItem("Green");
	    bluebttn = new JMenuItem("Blue");
	    redbttn = new JMenuItem("Red");
	    chartbttn = new JMenuItem("Chart");
	    
	    pn =new JPanel(new BorderLayout());
	    bt = new JButton("X");
	    mBar = new JMenuBar();

	    file = new JMenu("File");
	    arrange = new JMenu("Arrange");
	    appearance = new JMenu("Appearance");
	    color = new JMenu("Color");
	    
        fr.setLayout(new java.awt.BorderLayout());
        fr.add(scrollPane, java.awt.BorderLayout.CENTER);
	    
		
	}
	 public void placement() {
		mBar.add(file);
		mBar.add(arrange);
		mBar.add(appearance);
		appearance.add(color);
		
		pn.setVisible(false);
		pn.add(ftx);
		pn.add(bt,BorderLayout.WEST);
		fr.add(pn,BorderLayout.NORTH);

		
		file.add(savebttn);
		file.add(new_pagebttn);
		file.add(closebttn);
		arrange.add(chartbttn);
		arrange.add(findbttn);
		color.add(whitebttn);
		color.add(blackbttn);
		color.add(bluebttn);
		color.add(greenttn);
		color.add(redbttn);
		
		fr.setJMenuBar(mBar);


		fr.add(tx);

	    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		fr.setSize(720,480);
		
	}
	 public void colors() {
		 whitebttn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tx.setBackground(Color.white);
				tx.setForeground(Color.black);			
			}
		});
		 blackbttn.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tx.setBackground(Color.black);
				tx.setForeground(Color.white);				
			}
		});
		 greenttn.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tx.setBackground(Color.green);
				tx.setForeground(Color.white);				
			}
		});
		 bluebttn.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tx.setBackground(Color.blue);
				tx.setForeground(Color.white);				
			}
		});
		 redbttn.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tx.setBackground(Color.red);
				tx.setForeground(Color.white);				
			}
		});
	 }
	 public void findt() {
		 Highlighter founded = tx.getHighlighter();
		 Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
		 founded.removeAllHighlights();
		 	
		 findbttn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pn.setVisible(true);

				bt.addActionListener(new ActionListener() {
		  			
		 			@Override
		 			public void actionPerformed(ActionEvent e) {
		 				// TODO Auto-generated method stub
		 				 pn.setVisible(false);
		 				 founded.removeAllHighlights();
		 			}
		 		});
				
			}
		});
			ftx.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String get = ftx.getText();
					 int index=0;
					 int empty=0;
			         try {
			             String[] text = tx.getText().split("\\s+");
			             for (int i = 0; i < text.length; i++) {
								if (get.equals(text[i])) {
									break;
								};	
				            	 empty++;
			            	 for (int j = 0; j < text[i].length(); j++) {
								index++;
							}
							
						}
			            index = index+ empty;
			            int end = index + get.length();
			            founded.addHighlight(index, end, painter);
			         } catch (BadLocationException ex) {
			            
			         }
				}
			});
			
		}
		 
}



public class GUI {
	public static void main(String[] args) {
		notepadd prNotepadd = new notepadd();
		prNotepadd.start();
	

		
	}
}
