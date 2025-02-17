import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
//import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

class number{
	static JFrame fr2;
	static JButton tipButton,enterButton,new_game;
	static JTextField enterField;
	static JLabel tip1,tip2,tip3,tip4,explanation;
	static int number=0;
	static int enterance=0;
	static int clickCount1 = 0;
	static int clickCount = 0;
	static Random rndRandom;
	public void start() {
		build();
		locations();
		gameplay();
	}
	public void build() {
		fr2 = new JFrame();
	    fr2.setSize(500,300);
	    fr2.setVisible(true);
		fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr2.setLayout(null);
		
		
		tip1 = new JLabel();
		tip1.setVisible(false);
		tip2 = new JLabel();
		tip2.setVisible(false);
		tip3 = new JLabel();
		tip3.setVisible(false);
		tip4 = new JLabel();
		tip4.setVisible(false);
		explanation = new JLabel("Lütfen ipucu için Tip butonuna basınız");
		explanation.setVisible(true);
		enterField = new JTextField();
		
		tipButton = new JButton("tip butonu");
		enterButton = new JButton("enter");
		new_game = new JButton("yeni oyun");

		
		fr2.add(enterButton);
		fr2.add(enterField);
		fr2.add(tipButton);
		fr2.add(new_game);
		fr2.add(tip1);
		fr2.add(tip2);
		fr2.add(tip3);
		fr2.add(tip4);
		fr2.add(explanation);
		
		
		
		new_game.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				newGame();
			}
		});
	}
	public void locations() {
		enterField.setBounds(10, 50,100 , 90);
		enterButton.setBounds(110, 50,100 , 90);
		new_game.setBounds(10, 150,200, 40);
		explanation.setBounds(235, 25,240, 40);
		tipButton.setBounds(235, 65,240, 40);
		tip1.setBounds(235, 105,240, 40);
		tip2.setBounds(235, 145,240, 40);
		tip3.setBounds(235, 185,240, 40);
		tip4.setBounds(235, 225,240, 40);
	}
	public void gameplay() {
		rndRandom = new Random();
		number=rndRandom.nextInt(0,100);
		tipButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickCount++;
				fortips();
				switch (clickCount) {
				case 1:
					
					tip1.setVisible(true);	
					break;
				case 2:
					tip2.setVisible(true);
					break;
				case 3:
					tip3.setVisible(true);
					break;
				default:
					tip4.setText("Başka şansınız yoktur");
					tip4.setVisible(true);
					break;
				}
			}
		});

		enterButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	            try {
	                enterance = Integer.parseInt(enterField.getText().trim());  
	                clickCount1++;  
	                switch (clickCount1) {
	                    case 1:
	                        if (number == enterance) {
	                            enterField.setBackground(Color.GREEN);  
	                        } else {
	                            enterField.setBackground(Color.RED);   
	                        }
	                        enterField.setText(""); 
	                        break;
	                    case 2:
	                        if (number == enterance) {
	                            enterField.setBackground(Color.GREEN);  
	                        } else {
	                            enterField.setBackground(Color.RED);   
	                        }
	                        enterField.setText(""); 
	                        break;
	                    case 3:
	                        if (number == enterance) {
	                            enterField.setBackground(Color.GREEN);  
	                        } else {
	                            enterField.setBackground(Color.RED);   
	                        }
	                        enterField.setText(""); 
	                        break;
	                    default:
	                        JOptionPane.showMessageDialog(fr2,String.format("Kaybettiniz Doğru sayı %d idi", number), "Kaybettiniz", JOptionPane.INFORMATION_MESSAGE);
	                        break;
	                }
	            } catch (NumberFormatException ex) {
	                enterField.setBackground(Color.YELLOW);
	                JOptionPane.showMessageDialog(fr2, "Geçerli bir sayı giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
	            }
			}
		});
	}
	public void newGame() {
		clickCount=0;
		clickCount1=0;
		rndRandom = new Random();
		number=rndRandom.nextInt(0,100);
		tip1.setVisible(false);
		tip2.setVisible(false);
		tip3.setVisible(false);
		tip4.setVisible(false);
		enterField.setBackground(Color.white);
    enterField.setText(""); 
	}
	public void fortips() {
		for (int i = 0,j=10; i <=90 ; i+=10,j+=10) {
			if(number>i&&number<j)
			{
				tip1.setText(String.format("Bu sayı %d dan büyüktür %d den küçüktür", i,j));
			}
		}
		
		if (number%2==1) {
			tip2.setText("Bu sayı tek sayıdır");
		}else {
			tip2.setText("Bu sayı çift sayıdır");
		}
		Boolean answer= true;
		for (int i = 2; i <number; i++) {
			if (number%i==0) {
				answer = false;
				break;
			};
		}
		if (answer) {
			tip3.setText("Bu sayı asal sayıdır");
		} else {
			tip3.setText("Bu sayı asal sayı değildir");
		}
	}

}
class setf{
	static JFrame fr1,fr2,fr3,fr4;
	static public JPopupMenu guess,normal;
	static public JMenuItem number,word;
	static public JButton guessbt,normalbt;

    public void build() {
		fr1 = new JFrame();
		fr2 = new JFrame();
		fr3 = new JFrame();
		fr4 = new JFrame();
		
		guessbt = new JButton("Guess Games");
		normalbt = new JButton("Other Games");
	   fr1.setSize(400,300);
	   fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr1.setLayout(new FlowLayout());
	   

	   
       fr3.setSize(400,300);
	   fr3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr3.setLayout(new FlowLayout());
		
       fr4.setSize(400,300);
	   fr4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr4.setLayout(new FlowLayout());
       
		guess = new JPopupMenu("Guess Games");
		normal = new JPopupMenu("Other Games");
		number = new JMenuItem("number game");
		word = new JMenuItem("word game");
		
		
		guess.add(number);
		guess.add(word);
		
		guessbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				guess.show(guessbt, 0, guessbt.getHeight());
			}
		});
		number.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fr2.setVisible(true);
			}
		});
		
		fr1.add(guessbt);
		fr1.add(normalbt);

		fr1.setVisible(true);
    }
}

public class games {
	public static void main(String[] args) {
		number wd= new number();
		wd.start();
	}
}
