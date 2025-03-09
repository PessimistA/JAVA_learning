package applicatios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

class password{
	private JFrame jrFrame;
	private JPanel pnl;
	private JButton normalCharsButton,charsButton,numbersbutton,workbButton;
	private JLabel passwordlabel,namelabeLabel;
	private JTextField jTx,jTx2;

	public void attempt() {
		jrFrame = new JFrame();
        jrFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jrFrame.setSize(500, 500);
        jrFrame.setVisible(true);
        
        jrFrame.setLayout(new GridLayout(0, 1));//bu çok önemli bunun sayesinde düzenli oldu
        pnl = new JPanel();
        pnl.setLayout(new GridLayout(2,2));
        
        normalCharsButton= new JButton("Harfler");
        charsButton = new JButton("Özel Karakterler");
        numbersbutton = new JButton("Numaralar");
        workbButton = new JButton("Çalıştır");
        pnl.add(normalCharsButton);
        pnl.add(charsButton);
        pnl.add(numbersbutton);
        pnl.add(workbButton);
            
        jTx= new JTextField();
        jTx.setHorizontalAlignment(SwingConstants.CENTER);
        jTx.setFont(new Font("arial",Font.BOLD,20));
        jTx2= new JTextField();
        jTx2.setHorizontalAlignment(SwingConstants.CENTER);
        jTx2.setFont(new Font("arial",Font.BOLD,20));
        
        passwordlabel= new JLabel();
        passwordlabel.setHorizontalAlignment(SwingConstants.CENTER);//kelimleri ortaya yazdırır
        passwordlabel.setFont(new Font("arial",Font.BOLD,20));
        
        namelabeLabel= new JLabel("Şifre Üretici");
        namelabeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        namelabeLabel.setFont(new Font("arial",Font.BOLD,20));
        
        jrFrame.add(namelabeLabel,BorderLayout.NORTH);
        jrFrame.add(jTx2);
        jrFrame.add(jTx);
        jrFrame.add(pnl,BorderLayout.SOUTH);
        
        Border border= BorderFactory.createLineBorder(Color.BLACK, 4, false);
        passwordlabel.setBorder(border);
        
        password();
	}
	
	private String[] wordString={
			"a","b","c","ç","d","e","f","g","ğ","h","ı","i","j","k","l","m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z",
			"A","B","C","Ç","D","E","F","G","Ğ","H","I","İ","J","K","L","M","N","O","Ö","P","R","S","Ş","T","U","Ü","V","Y","Z"
	};
	private String[] numbers= {
			"0","1","2","3","4","5","6","7","8","9"
	};
	private String[] characters= {
			",",";",":","-","|","/","%","!","^","+","%","&","\\"
	};
	private String passwordString="";
	private String[] all= new String[wordString.length + numbers.length + characters.length];
	
	private void password() {
		Random rndRandom= new Random();
		final int[] choose= {0};
		final int[] forharf = {0};
		final int[] forkarakter = {0};
		final int[] fornumber = {0};

		normalCharsButton.addActionListener(e -> forharf[0] = 1);
		charsButton.addActionListener(e -> forkarakter[0] = 1);
		numbersbutton.addActionListener(e -> fornumber[0] = 1);
		
		workbButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					choose[0]=Integer.parseInt(jTx.getText());	
					
				} catch (Exception er) {
					// TODO: handle exception
					er.getMessage();
				}
				
				int key= index(forharf[0], fornumber[0], forkarakter[0]);
				switch (key) {
				case 1:
					for (int i = 0; i < choose[0]; i++) {
						passwordString += all[rndRandom.nextInt(all.length)];
					}
					
					break;
				case 2:
					for (int i = 0; i < choose[0]; i++) {
						passwordString += all[rndRandom.nextInt(all.length)];
					}
					
					break;
				case 3:
					for (int i = 0; i < choose[0]; i++) {
						passwordString += all[rndRandom.nextInt(all.length)];
					}
					
					break;
				case 4:
					System.arraycopy(wordString, 0,all, 0,wordString.length);
					System.arraycopy(numbers, 0,all, wordString.length,numbers.length);
					for (int i = 0; i < choose[0]; i++) {
						passwordString += all[rndRandom.nextInt(all.length)];
					}
					break;
				case 5:
					System.arraycopy(wordString, 0,all, 0,wordString.length);
					System.arraycopy(characters, 0,all, wordString.length,characters.length);
					for (int i = 0; i < choose[0]; i++) {
						passwordString += all[rndRandom.nextInt(all.length)];
					}
					break;
				case 6:
					System.arraycopy(characters, 0,all, 0,characters.length);
					System.arraycopy(numbers, 0,all, characters.length,numbers.length);
					for (int i = 0; i < choose[0]; i++) {
						passwordString += all[rndRandom.nextInt(all.length)];
					}
					break;
				case 7:
					System.arraycopy(wordString, 0,all, 0,wordString.length);
					System.arraycopy(numbers, 0,all, wordString.length,numbers.length);
					System.arraycopy(characters, 0,all, wordString.length+numbers.length,characters.length);
					for (int i = 0; i < choose[0]; i++) {
						passwordString += all[rndRandom.nextInt(all.length)];
					}
					break;
				default:
					break;
				}
				jTx2.setText("Şifre: "+passwordString);
				fornumber[0]=0;
				forharf[0]=0;
				forkarakter[0]=0;
				passwordString= "";
			}
		});
	}
	
	private int index(int harf,int number,int karakter) {
	    if (harf==1&&number==0&&karakter==0) {
			return 1;
		}
		else if (harf==0&&number==1&&karakter==0) {
			return 2;
		}
		else if (harf==0&&number==0&&karakter==1) {
			return 3;
		}
		else if (harf==1&&number==1&&karakter==0) {
			return 4;
		}
		else if (harf==1&&number==0&&karakter==1) {
			return 5;
		}
		else if (harf==0&&number==1&&karakter==1) {
			return 6;
		}
		else if (harf==1&&number==1&&karakter==1) {
			return 7;
		}
		else {
			return 0;
		}

	}

}
public class password_generator {
	public static void main(String[] args) {
		password pswPassword=new password();
		pswPassword.attempt();	
	}
}
