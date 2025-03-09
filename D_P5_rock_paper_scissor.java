package applicatios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

class computer{
	int paperC=1,scissorC=2,rockCString=3;
	public int play() {
		Random rndRandom= new Random();
		int number = rndRandom.nextInt(1,4);
		if (number==1) {
			return  paperC;
		}
		else if (number==2) {
			return  scissorC;
		}
		else if (number==3) {
			return  rockCString;
		}
		else {
			return 0;	
		}
	}
}
class play_time{
	private JFrame jrFrame;
	private JButton paper,scissor,rock;
	private JLabel labelcomputer,labelplayer,labelscoreCP,labelscorePL,answercomputer;
	private JPanel panelup,paneldown;
	int	scoreComputer=0,scorePlayer=0;
	int paperP=1,scissorP=2,rockP=3;
	
	public void attempt() {
		jrFrame = new JFrame();
        jrFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jrFrame.setSize(500, 500);
        jrFrame.setVisible(true);
        
        jrFrame.setLayout(null);
        
		panelup = new JPanel();
		panelup.setVisible(true);
        panelup.setBounds(0, 0, 400, 200);
		panelup.setLayout(null);
		
		paneldown = new JPanel();
		paneldown.setVisible(true);
        paneldown.setBounds(0, 200, 400, 200);
		paneldown.setLayout(null);

		
		paper = new JButton("Paper");
		paneldown.add(paper);
		paper.setBounds(50, 50, 75, 100);
		
		rock = new JButton("Rock");
		paneldown.add(rock);
		rock.setBounds(175, 50, 75, 100);
		
		scissor = new JButton("Scissor");
		paneldown.add(scissor);
		scissor.setBounds(300, 50, 75, 100);
		
		
		labelcomputer= new JLabel("Computer");
		panelup.add(labelcomputer);
		labelcomputer.setBounds(150, 175,70,30);
		labelplayer= new JLabel("PLayer");
		paneldown.add(labelplayer);
		labelplayer.setBounds(150, 175,50,30);
		labelscoreCP= new JLabel("Score: ");
		panelup.add(labelscoreCP);
		labelscoreCP.setBounds(225, 175,50,30);
		labelscorePL= new JLabel("Score: ");
		paneldown.add(labelscorePL);
		labelscorePL.setBounds(225, 175,50,30);
		answercomputer = new JLabel("?");
		answercomputer.setPreferredSize(new Dimension(100,100));
		Border border= BorderFactory.createLineBorder(Color.BLACK, 4, false);
		answercomputer.setBorder(border);
		panelup.add(answercomputer);
		answercomputer.setBounds(150, 50, 100, 100);
		
		
		paneldown.setBorder(border);
		panelup.setBorder(border);
		
		jrFrame.add(panelup,BorderLayout.NORTH);
		jrFrame.add(paneldown,BorderLayout.SOUTH);
			
	}
	public void start() {
		computer computer1=new computer();
		paper.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int computerA=computer1.play();
				int result= compare(paperP,computerA);
				if(computerA==1) {
					answercomputer.setText("Paper");	
				}
				if(computerA==2) {
					answercomputer.setText("Scissor");	
				}
				if(computerA==3) {
					answercomputer.setText("Rock");	
				}
				if (result==10) {
					JOptionPane.showMessageDialog(null,"Berabere kaldınız","Sonuç",JOptionPane.INFORMATION_MESSAGE);
					
				}
				if (result==1) {
					JOptionPane.showMessageDialog(null,"Kazandınız","Sonuç",JOptionPane.INFORMATION_MESSAGE);
					scorePlayer++;
				}
				if (result==0) {
					JOptionPane.showMessageDialog(null,"Kaybettiniz","Sonuç",JOptionPane.INFORMATION_MESSAGE);
					scoreComputer++;
				}
				labelscoreCP.setText("Score: "+scoreComputer);
				labelscorePL.setText("Score: "+scorePlayer);
			}
		});
		scissor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int computerA=computer1.play();
				int result= compare(scissorP,computerA);
				if(computerA==1) {
					answercomputer.setText("Paper");	
				}
				if(computerA==2) {
					answercomputer.setText("Scissor");	
				}
				if(computerA==3) {
					answercomputer.setText("Rock");	
				}
				if (result==10) {
					JOptionPane.showMessageDialog(null,"Berabere kaldınız","Sonuç",JOptionPane.INFORMATION_MESSAGE);
				}
				if (result==1) {
					JOptionPane.showMessageDialog(null,"Kazandınız","Sonuç",JOptionPane.INFORMATION_MESSAGE);
					scorePlayer++;
				}
				if (result==0) {
					JOptionPane.showMessageDialog(null,"Kaybettiniz","Sonuç",JOptionPane.INFORMATION_MESSAGE);
					scoreComputer++;
				}
				labelscoreCP.setText("Score: "+scoreComputer);
				labelscorePL.setText("Score: "+scorePlayer);
			}
		});
		rock.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int computerA=computer1.play();
				int result= compare(rockP,computerA);
				if(computerA==1) {
					answercomputer.setText("Paper");	
				}
				if(computerA==2) {
					answercomputer.setText("Scissor");	
				}
				if(computerA==3) {
					answercomputer.setText("Rock");	
				}
				if (result==10) {
					JOptionPane.showMessageDialog(null,"Berabere kaldınız","Sonuç",JOptionPane.INFORMATION_MESSAGE);
				}
				if (result==1) {
					JOptionPane.showMessageDialog(null,"Kazandınız","Sonuç",JOptionPane.INFORMATION_MESSAGE);
					scorePlayer++;
				}
				if (result==0) {
					JOptionPane.showMessageDialog(null,"Kaybettiniz","Sonuç",JOptionPane.INFORMATION_MESSAGE);
					scoreComputer++;
				}
				labelscoreCP.setText("Score: "+scoreComputer);
				labelscorePL.setText("Score: "+scorePlayer);
			}
		});
	}
	//1 win to player
	//0 lose to player
	//10 equality
	//1 paper 2 scissor 3 rock
	private int compare(int player1,int computer1) {
		if (player1==1&&computer1==1) {
			return 10;
		}
		else if (player1==1&&computer1==2) {
			return 0;
		}
		else if (player1==1&&computer1==3) {
			return 1;
		}
		else if (player1==2&&computer1==2) {
			return 10;
		}
		else if (player1==2&&computer1==1) {
			return 1;
		}
		else if (player1==2&&computer1==3) {
			return 0;
		}
		else if (player1==3&&computer1==3) {
			return 10;
		}
		else if (player1==3&&computer1==1) {
			return 0;
		}
		else if (player1==3&&computer1==2) {
			return 1;
		}
		else {
			return 5;
		}
	}
	
}

public class rock_scissors_paper {
	public static void main(String[] args) {
		play_time pTime= new play_time();
		pTime.attempt();
		pTime.start();
	}
}
