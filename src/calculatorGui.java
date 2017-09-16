import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class calculatorGui extends JFrame {
	
	private JTextArea displayScreen;
	private JButton one,two,three,four,five,six,seven,eight,nine,zero;
	private JButton add,sub,mul,div,eq,clear,dot,pi;
	
	
	public calculatorGui(){
		setTitle("Calculator");
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(new Color(204, 200, 197));
		setup();
	}
	
	private void setup(){
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		Border border = BorderFactory.createLineBorder(Color.BLACK,2);
		
		displayScreen = new JTextArea(5,7);
		displayScreen.setEditable(false);
		displayScreen.setBorder(border);
		displayScreen.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		c.gridheight=1;
		c.gridwidth=4;
		c.insets = new Insets(4,4,5,5);
		add(displayScreen,c);
		
		one = new JButton("1");
		one.setPreferredSize(new Dimension (70,70));
		one.setBackground(new Color(224, 126, 29));
		one.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		one.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridheight=1;
		c.gridwidth=1;
		c.gridx=0;
		c.gridy=1;
		add(one,c);
		
		two = new JButton("2");
		two.setPreferredSize(new Dimension (70,70));
		two.setBackground(new Color(224, 126, 29));
		two.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		two.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=1;
		add(two,c);
		
		three = new JButton("3");
		three.setPreferredSize(new Dimension (70,70));
		three.setBackground(new Color(224, 126, 29));
		three.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		three.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridy=1;
		add(three,c);
		
		add = new JButton("+");
		add.setPreferredSize(new Dimension (70,70));
		add.setBackground(new Color(224, 126, 29));
		add.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=3;
		c.gridy=1;
		add(add,c);
		
		four = new JButton("4");
		four.setPreferredSize(new Dimension (70,70));
		four.setBackground(new Color(224, 126, 29));
		four.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		four.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=2;
		add(four,c);
		
		five = new JButton("5");
		five.setPreferredSize(new Dimension (70,70));
		five.setBackground(new Color(224, 126, 29));
		five.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		five.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=2;
		add(five,c);
		
		six = new JButton("6");
		six.setPreferredSize(new Dimension (70,70));
		six.setBackground(new Color(224, 126, 29));
		six.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		six.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridy=2;
		add(six,c);
		
		sub = new JButton("-");
		sub.setPreferredSize(new Dimension (70,70));
		sub.setBackground(new Color(224, 126, 29));
		sub.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		sub.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=3;
		c.gridy=2;
		add(sub,c);
		
		seven = new JButton("7");
		seven.setPreferredSize(new Dimension (70,70));
		seven.setBackground(new Color(224, 126, 29));
		seven.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		seven.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=3;
		add(seven,c);
		
		eight = new JButton("8");
		eight.setPreferredSize(new Dimension (70,70));
		eight.setBackground(new Color(224, 126, 29));
		eight.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		eight.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=3;
		add(eight,c);
		
		nine = new JButton("9");
		nine.setPreferredSize(new Dimension (70,70));
		nine.setBackground(new Color(224, 126, 29));
		nine.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		nine.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridy=3;
		add(nine,c);
		
		mul = new JButton("*");
		mul.setPreferredSize(new Dimension (70,70));
		mul.setBackground(new Color(224, 126, 29));
		mul.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		mul.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=3;
		c.gridy=3;
		add(mul,c);
		
		div = new JButton("/");
		div.setPreferredSize(new Dimension (70,70));
		div.setBackground(new Color(224, 126, 29));
		div.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		div.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=3;
		c.gridy=4;
		add(div,c);
		
		zero = new JButton("0");
		zero.setPreferredSize(new Dimension (70,70));
		zero.setBackground(new Color(224, 126, 29));
		zero.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		zero.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=4;
		add(zero,c);
		
		dot = new JButton(".");
		dot.setPreferredSize(new Dimension (70,70));
		dot.setBackground(new Color(224, 126, 29));
		dot.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		dot.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=4;
		add(dot,c);
		
		pi = new JButton("\u03C0");
		pi.setPreferredSize(new Dimension (70,70));
		pi.setBackground(new Color(224, 126, 29));
		pi.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pi.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridy=4;
		add(pi,c);
		
		eq = new JButton("=");
		eq.setPreferredSize(new Dimension (70,70));
		eq.setBackground(new Color(224, 126, 29));
		eq.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		eq.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=5;
		c.gridheight=1;
		c.gridwidth=2;
		add(eq,c);
		
		
		clear = new JButton("CLEAR");
		clear.setPreferredSize(new Dimension (70,70));
		clear.setBackground(new Color(224, 126, 29));
		clear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		clear.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridy=5;
		c.gridheight=1;
		c.gridwidth=2;
		add(clear,c);
		
		
		event e= new event();
		one.addActionListener(e);
		two.addActionListener(e);
		three.addActionListener(e);
		four.addActionListener(e);
		five.addActionListener(e);
		six.addActionListener(e);
		seven.addActionListener(e);
		eight.addActionListener(e);
		nine.addActionListener(e);
		add.addActionListener(e);
		sub.addActionListener(e);
		mul.addActionListener(e);
		div.addActionListener(e);
		eq.addActionListener(e);
		clear.addActionListener(e);
		dot.addActionListener(e);
		zero.addActionListener(e);
		pi.addActionListener(e);
		
		
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String op = e.getActionCommand();
			
			if(op.equals("1")){displayScreen.append("1");}
			else if(op.equals("2")){displayScreen.append("2");}
			else if(op.equals("3")){displayScreen.append("3");}
			else if(op.equals("4")){displayScreen.append("4");}
			else if(op.equals("5")){displayScreen.append("5");}
			else if(op.equals("6")){displayScreen.append("6");}
			else if(op.equals("7")){displayScreen.append("7");}
			else if(op.equals("8")){displayScreen.append("8");}
			else if(op.equals("9")){displayScreen.append("9");}
			else if(op.equals("0")){displayScreen.append("0");}
			else if(op.equals("+")){displayScreen.append("+");}
			else if(op.equals("-")){displayScreen.append("-");}
			else if(op.equals("*")){displayScreen.append("*");}
			else if(op.equals("/")){displayScreen.append("/");}
			else if(op.equals(".")){displayScreen.append(".");}
			else if(op.equals("\u03C0")){displayScreen.append("3.14");}
			else if(op.equals("CLEAR")){displayScreen.setText("");}
			else if(op.equals("=")){
				ScriptEngineManager mgr = new ScriptEngineManager();
			    ScriptEngine engine = mgr.getEngineByName("JavaScript");
			    String equation = displayScreen.getText();
			    try {
			    	Object answer = engine.eval(equation);
			    	if(answer.equals((Object)(Double.POSITIVE_INFINITY))){
			    		throw new ArithmeticException();
			    	}
			    	displayScreen.setText("");
					displayScreen.append(""+answer);
					
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch(ArithmeticException e2){
					JOptionPane.showMessageDialog(null, "ERROR: Cannot Divide By 0");
					displayScreen.setText("");
				}
			}
			
		}
	}
}

