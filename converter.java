import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class interface1{
	static public JFrame fr;
	static public JTextField txField;
	static public JButton btButton;
	static public JLabel lb1,lb2,lb3,lb4,lb5;
	static public JLabel lb12,lb22,lb32,lb42,lb52;
	static int enterance=0;
	static void start() {
		build();
		locations();
		binary_calculator();
	}
	static void build() {
		fr = new JFrame();
		txField = new JTextField();
	    fr.setSize(500,300);
	    fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		btButton = new JButton();
		lb1= new JLabel("Binary: ");
		lb2= new JLabel("Octal: ");
		lb3= new JLabel("Hex: ");
		lb4= new JLabel("BCD kodu: ");
		lb5= new JLabel("Aiken kodu");
		lb12= new JLabel();
		lb22= new JLabel();
		lb32= new JLabel();
		lb42= new JLabel();
		lb52= new JLabel();
		fr.add(btButton);
		fr.add(txField);
		fr.add(lb12);
		fr.add(lb22);
		fr.add(lb32);
		fr.add(lb42);
		fr.add(lb52);
		fr.add(lb1);
		fr.add(lb2);
		fr.add(lb3);
		fr.add(lb4);
		fr.add(lb5);
		
	}
	static  void locations() {
		txField.setBounds(10, 100,100 , 30);
		btButton.setBounds(110, 100,100 , 30);
		lb1.setBounds(235, 25,60, 40);
		lb12.setBounds(295, 25,100, 40);
		lb2.setBounds(235,50,60, 40);
		lb22.setBounds(295, 50,100, 40);
		lb3.setBounds(235, 75,60, 40);
		lb32.setBounds(295, 75,100, 40);
		lb4.setBounds(235, 100,80, 40);
		lb42.setBounds(295, 100,100, 40);
		lb5.setBounds(235, 125,80, 40);
		lb52.setBounds(295, 125,100, 40);

	}
	static void binary_calculator() {
		int[] binary = new int[32];
		int[] top1 = {-1};

		btButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
		            int enterance = Integer.parseInt(txField.getText().trim());  
		            int number = enterance;
		            int leng = (int) (Math.log(enterance) / Math.log(2)) + 1; 
		            int[] array = new int[32];
		            int[] top2 = {-1};
		            int[] head1 = {-1};

		            for (int i = 0; i <leng; i++) {
						push((enterance%2),binary,top1);	
						enqueue((enterance%2),array,top2);	
						enterance= enterance/2;
					}
					String hString= "";
					for (int i = 0,j=0; i <leng; i++,j++) {
						int k = pop(binary,top1);
						hString= hString +k;
					}
					lb12.setText(hString);
					lb22.setText(String.format("%o", (int)number));
					lb42.setText(String.format("%x",(int)number));
					
					String all=bcd(enterance);
					lb32.setText(all);
					} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
	}
	static String binarycalculate(int value) {
		int[] binary = new int[32];
		int[] top1= {-1};
        int leng = (int) (Math.log(value) / Math.log(2)) + 1; 
        for (int i = 0; i <leng; i++) {
			push((value%2),binary,top1);	
			value= value/2;
		}
		String hString= "";
		for (int i = 0,j=0; i <leng; i++,j++) {
			int k = pop(binary,top1);
			hString= hString +k;
		}
		return hString;
	}
	static String bcd(int enterance) {
		int[] diveded= new int[10];
		int[] top = {-1};
		int[] head= {-1};
        int step=0;
        int number=enterance;
		for (int i = 1; number>0;i++) {
		    number= number/10;
			step++;	
		}
		for (int i = (int)Math.pow(10, step-1); i>0; i/=10) {
			enqueue(enterance/i, diveded, top);
			enterance=enterance%i;	
		}
		String back="";
		String all="";
		for (int i = 0; i < step; i++) {
			back = binarycalculate(dequeu(diveded, top, head));
			if (back.length()!=4) {
				while(back.length()<4) {
					back = "0"+back;	
				}
			}
			all= all+" "+back;
			back="";
		}
		System.out.printf("%s",all);
		return all;
		
	}
	static int pop(int dizi[],int[] top) {
		return dizi[top[0]--];
	}
	static void push(int item,int[] dizi,int[] top) {
		dizi[++top[0]]= item;
	}
	static void enqueue(int item, int[] dizi, int[] top) {
	    dizi[++top[0]] = item;
	}

	static int dequeu(int[] dizi, int[] top, int[] head) {
	    return dizi[head[0]++];
	}
}


public class Conventer {
	public static void main(String[] args) {
		interface1 oneInterface1 = new interface1();
		oneInterface1.start();
	}
}

//ver2

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class interface1{
	static public JFrame fr;
	static public JTextField txField;
	static public JButton btButton;
	static public JLabel lb1,lb2,lb3,lb4,lb5,lb6;
	static public JLabel lb12,lb22,lb32,lb42,lb52,lb62;
	static int enterance=0;
	static void start() {
		build();
		locations();
		binary_calculator();
	}
	static void build() {
		fr = new JFrame();
		txField = new JTextField();
	    fr.setSize(500,300);
	    fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		btButton = new JButton();
		lb1= new JLabel("Binary: ");
		lb2= new JLabel("Octal: ");
		lb3= new JLabel("Hex: ");
		lb4= new JLabel("BCD kodu: ");
		lb5= new JLabel("excess kodu");
		lb6= new JLabel("grey kodu");
		lb12= new JLabel();
		lb22= new JLabel();
		lb32= new JLabel();
		lb42= new JLabel();
		lb52= new JLabel();
		lb62= new JLabel();
		fr.add(btButton);
		fr.add(txField);
		fr.add(lb12);
		fr.add(lb22);
		fr.add(lb32);
		fr.add(lb42);
		fr.add(lb52);
		fr.add(lb1);
		fr.add(lb2);
		fr.add(lb3);
		fr.add(lb4);
		fr.add(lb5);
		fr.add(lb6);
		fr.add(lb62);
		
	}
	static  void locations() {
		txField.setBounds(10, 100,100 , 30);
		btButton.setBounds(110, 100,100 , 30);
		lb1.setBounds(235, 25,60, 40);
		lb12.setBounds(295, 25,100, 40);
		lb2.setBounds(235,50,60, 40);
		lb22.setBounds(295, 50,100, 40);
		lb3.setBounds(235, 75,60, 40);
		lb32.setBounds(295, 75,200, 40);
		lb4.setBounds(235, 100,80, 40);
		lb42.setBounds(315, 100,100, 40);
		lb5.setBounds(235, 125,80, 40);
		lb52.setBounds(315, 125,100, 40);
		lb6.setBounds(235, 150,80, 40);
		lb62.setBounds(315, 150,100, 40);

	}
	static void binary_calculator() {
		int[] binary = new int[32];
		int[] top1 = {-1};

		btButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
		            int enterance = Integer.parseInt(txField.getText().trim());  
		            int number = enterance;
		            int leng = (int) (Math.log(enterance) / Math.log(2)) + 1; 
		            int[] array = new int[32];
		            int[] top2 = {-1};
		            int[] head1 = {-1};

		            for (int i = 0; i <leng; i++) {
						push((enterance%2),binary,top1);	
						enqueue((enterance%2),array,top2);	
						enterance= enterance/2;
					}
					String hString= "";
					for (int i = 0,j=0; i <leng; i++,j++) {
						int k = pop(binary,top1);
						hString= hString +k;
					}
					lb12.setText(hString);
					lb22.setText(String.format("%o", (int)number));
					lb32.setText(String.format("%x",(int)number));
					
					
					StringBuilder strbuild = new StringBuilder();
					String valueString = String.valueOf(number);

					for (int i = 0; i < valueString.length(); i++) {
					    char rakam = valueString.charAt(i);
					    int rakamInt = Character.getNumericValue(rakam);
					    String binary = String.format("%4s", Integer.toBinaryString(rakamInt))
					                        .replace(' ', '0');
					    strbuild.append(binary).append(" ");
					}

					lb42.setText(strbuild.toString());
					lb52.setText(Integer.toBinaryString(number+3));
					
					} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
	}
	static int pop(int dizi[],int[] top) {
		return dizi[top[0]--];
	}
	static void push(int item,int[] dizi,int[] top) {
		dizi[++top[0]]= item;
	}
	static void enqueue(int item, int[] dizi, int[] top) {
	    dizi[++top[0]] = item;
	}

	static int dequeu(int[] dizi, int[] top, int[] head) {
	    return dizi[head[0]++];
	}
}


public class Conventer {
	public static void main(String[] args) {
		interface1 oneInterface1 = new interface1();
		oneInterface1.start();
	}
}


