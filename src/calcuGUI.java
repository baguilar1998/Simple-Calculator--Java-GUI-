import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calcuGUI extends JFrame{
	private JButton add,sub,mul,div;
	private JTextField num1,num2;
	private JLabel result,e1,e2;
	
	public calcuGUI(){
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Calculator");
		setSize(250,175);
		setUp();
	}
	private void setUp(){
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		e1 = new JLabel("1st: ");
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		add(e1,c);
		
		num1 = new JTextField(10);
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=3;
		add(num1,c);
		
		e2 = new JLabel("2nd: ");
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=1;
		add(e2,c);
		
		num2 = new JTextField(10);
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=1;
		c.gridwidth=3;
		add(num2,c);
		
		add=new JButton("+");
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=2;
		c.gridwidth=1;
		add(add,c);
		
		sub= new JButton("-");
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridy=2;
		add(sub,c);
		
		mul= new JButton("*");
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=3;
		c.gridy=2;
		c.gridwidth=1;
		add(mul,c);
		
		div= new JButton("/");
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=4;
		c.gridy=2;
		add(div,c);
		
		result= new JLabel("");
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=4;
		add(result,c);
		
		event a = new event();
		add.addActionListener(a);
		sub.addActionListener(a);
		mul.addActionListener(a);
		div.addActionListener(a);
		
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent a){
			double n1,n2;
			try{
				n1=Double.parseDouble(num1.getText());
			}catch(NumberFormatException e){
				result.setText("Illegal data for first field");
				result.setForeground(Color.RED);
				return;
			}
			try{
				n2=Double.parseDouble(num2.getText());
			}catch(NumberFormatException ee){
				result.setText("Illegal data for second field");
				result.setForeground(Color.RED);
				return;
			}
			
			String op = a.getActionCommand();
			
			if(op.equals("+")){
				double sum = n1+n2;
				result.setText(n1+"+"+n2+"="+sum);
				result.setForeground(Color.RED);
			}
			
			if(op.equals("-")){
				double dif= n1-n2;
				result.setText(n1+"+"+n2+"="+dif);
				result.setForeground(Color.RED);
			}
			
			if(op.equals("*")){
				double pro = n1*n2;
				result.setText(n1+"*"+n2+"="+pro);
				result.setForeground(Color.RED);
			}
			
			if(op.equals("/")){
				if(n2==0){
					result.setText("Cannot Divide By 0");
					result.setForeground(Color.RED);
				}else{
					double quo= n1/n2;
					result.setText(n1+"/"+n2+"="+quo);
					result.setForeground(Color.RED);
				}
			}
		}
	}
}
