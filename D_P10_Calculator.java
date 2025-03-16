
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.security.PublicKey;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

class frame{
    private JFrame fr;
    private JTextField tField; 
    private String text="";

    public frame() {
    	make_frame();
    }

    private void make_frame() {
        fr = new JFrame("Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setSize(500, 500);
        fr.setLayout(new BorderLayout());

        tField = make_line();
        tField.setPreferredSize(new Dimension(500, 150)); 
        fr.add(tField, BorderLayout.NORTH);

        fr.add(make_buttons(), BorderLayout.CENTER);
    }

	private JPanel make_buttons() {
		JPanel pnJPanel=make_panel();
		JButton[] buttons = new JButton[20];
		String[] button_names = {
				"","+","-","<-",
			    "7", "8", "9","*",
			    "4", "5", "6","/",
				"1", "2", "3","%",
				".","0",",","="
			};
		for (int i = 0; i < buttons.length; i++) {
		    buttons[i] = new JButton(button_names[i]);
		    buttons[i].setHorizontalAlignment(SwingConstants.CENTER);
		    buttons[i].setFont(new Font("arial",Font.BOLD,20));
		    buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String buttonText = ((JButton) e.getSource()).getText(); // Butonun üzerindeki metni al
                    if (buttonText.equals("=")) {
                        try {
                            calculate clCalculate = new calculate(tField.getText());
                            float text = clCalculate.values();
                            tField.setText(Float.toString(text));
                        } catch (Exception ex) {
                            tField.setText("Hata");
                        }
                    } 
                    else if(buttonText.equals("<-")) {
                    	StringBuilder all_textString = new StringBuilder(tField.getText());
                    	if (all_textString.length() > 0) {
                    	    all_textString.deleteCharAt(all_textString.length() - 1);
                    	}
                    	String text1= all_textString.toString();
                    	tField.setText(text1);
                    }
                    else {
                        tField.setText(tField.getText() + buttonText);
                    }
				}
			});
		    
		    
		    pnJPanel.add(buttons[i]);
		}
		return pnJPanel;	
	}

	private JPanel make_panel() {
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(5,5));
		return panel;
		
	}
	private JTextField make_line() {
		JTextField txfieldField= new JTextField();
		Border border =BorderFactory.createLineBorder(Color.BLACK, 4, false);
		txfieldField.setBorder(border);
		txfieldField.setHorizontalAlignment(SwingConstants.RIGHT);
		txfieldField.setFont(new Font("arial",Font.BOLD,20));
		return txfieldField;
	}
}

class calculate {
    private float result;
    private char[] divided;
    private int MAX;
    private float[] num_stack;
    private char[] operator_stack;
    private int top_num = -1;
    private int top_operator = -1;

    public calculate(String text) {
        this.divided =text.toCharArray();
        this.MAX = divided.length;
        this.num_stack = new float[MAX];
        this.operator_stack = new char[MAX];
    }
    public float values() {
        return eval(divided);
    }
	void push(float value) {
	    if (top_num < (MAX - 1)) {
	        num_stack[++top_num] = value;
	    }

	}

	void push_operator(char value) {
	    if (top_operator < (MAX - 1)) {
	        operator_stack[++top_operator] = value;
	    }
	    else {
	        
	    }
	}

	float pop() {
	    if (top_num >= 0) {
	        return num_stack[top_num--];
	    }
	    return 0;
	}

	char pop_operator() {
	    if (top_operator >= 0) {
	        return operator_stack[top_operator--];
	    }
	    return '\0';
	}

	int precedence(char ch) {
	    if (ch == '+' || ch == '-') return 1;
	    if (ch == '*' || ch == '/') return 2;
	    if (ch == '^') return 3;
	    return 0;
	}

	boolean isOperator(char ch) {
	    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}

	float calculate1(float op1, float op2, char symbol) {
	    switch (symbol) {
	    case '+': return op1 + op2;
	    case '-': return op1 - op2;
	    case '*': return op1 * op2;
	    case '%': return op1 % op2;
	    case '/': return op2 != 0 ? op1 / op2 : 0; // Bölme işlemi için kontrol
	    default: return 0;
	    }
	}

	float eval(char infix[]) {
	    int len = infix.length;
	    for (int i = 0; i < len; i++) {
	        char ch = infix[i];

	        if (Character.isSpaceChar(ch))
	            continue;

	        if (Character.isDigit(ch)) {
	            float num = 0;
	            while (i < len && Character.isDigit(infix[i])) {
	                num = num * 10 + (infix[i] - '0'); // '0' olarak düzeltildi
	                i++;
	            }
	            i--;
	            push(num);
	        }
	        else if (ch == '(') {
	            push_operator(ch);
	        }
	        else if (ch == ')') {
	            while (top_operator != -1 && operator_stack[top_operator] != '(') {
	                float op2 = pop();
	                float op1 = pop();
	                char symbol = pop_operator();
	                push(calculate1(op1, op2, symbol));
	            }
	            pop_operator(); // '(' karakterini yığından çıkar
	        }
	        else if (isOperator(ch)) {
	            while (top_operator != -1 && precedence(operator_stack[top_operator]) >= precedence(ch)) {
	                float op2 = pop();
	                float op1 = pop();
	                char symbol = pop_operator();
	                push(calculate1(op1, op2, symbol));
	            }
	            push_operator(ch);
	        }
	    }

	    while (top_operator != -1) {
	        float op2 = pop();
	        float op1 = pop();
	        char symbol = pop_operator();
	        push(calculate1(op1, op2, symbol));
	    }

	    return pop(); 
	}
}


public class math {
	 public static void main(String[] args) {
		 frame fr= new frame();
		
	}
}
