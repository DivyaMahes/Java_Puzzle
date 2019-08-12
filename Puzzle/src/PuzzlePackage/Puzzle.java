package PuzzlePackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
	
	public class Puzzle implements ActionListener 
	{ 
		JFrame frame=new JFrame("Puzzle");
		final JButton b1,b2,b3,b4,b5,b6, b7, b8, b9,reset;
		public Puzzle()
		{
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		b1=new JButton("5");
		b1.setBounds(100,150,50,50);
		b2=new JButton("3");
		b2.setBounds(150,150,50,50);
		b3=new JButton("2");
		b3.setBounds(200,150,50,50);
		b4=new JButton("1");
		b4.setBounds(100,200,50,50);
		b5=new JButton("4");
		b5.setBounds(150,200,50,50);
		b6=new JButton("7");
		b6.setBounds(200,200,50,50);
		b7=new JButton("6");
		b7.setBounds(100,250,50,50);
		b8=new JButton("");
		b8.setBounds(150,250,50,50);
		b9=new JButton("8");
		b9.setBounds(200,250,50,50);
		
		reset=new JButton("Reset");
		reset.setBounds(150,350,75,40);
		
		frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);frame.add(b5);
		frame.add(b6);frame.add(b7);frame.add(b8);frame.add(b9);frame.add(reset);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		reset.addActionListener(this);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		}
		  public void actionPerformed(ActionEvent event)
		  {   
			  if(event.getSource()==b1)
			  {
				  String label=b1.getText();
				  if(b2.getText()=="")
				  {
					  b1.setText("");
					  b2.setText(label);
				  }
				  if(b4.getText()=="")
				  {
					  b1.setText("");
					  b4.setText(label);
				  }
			  }
			  
			  if(event.getSource()==b2)
			  {
				  String label=b2.getText();
				  if(b1.getText()=="")
				  {
					  b2.setText("");
					  b1.setText(label);
				  }
				  if(b3.getText()=="")
				  {
					  b2.setText("");
					  b3.setText(label);
				  }
				  if(b5.getText()=="")
				  {
					  b2.setText("");
					  b5.setText(label);
				  }
			  }
			  
			  if(event.getSource()==b3)
			  {
				  String label=b3.getText();
				  if(b2.getText()=="")
				  {
					  b3.setText("");
					  b2.setText(label);
				  }
				  if(b6.getText()=="")
				  {
					  b3.setText("");
					  b6.setText(label);
				  }
			  }
			  
			  if(event.getSource()==b4)
			  {
				  String label=b4.getText();
				  if(b1.getText()=="")
				  {
					  b4.setText("");
					  b1.setText(label);
				  }
				  if(b5.getText()=="")
				  {
					  b4.setText("");
					  b5.setText(label);
				  }
				  if(b7.getText()=="")
				  {
					  b4.setText("");
					  b7.setText(label);
				  }
			  }
				
			  if(event.getSource()==b5)
			  {
			  String label=b5.getText();
			  if(b2.getText()=="")
			  {
				  b5.setText("");
				  b2.setText(label);
			  }
			  if(b4.getText()=="")
			  {
				  b5.setText("");
				  b4.setText(label);
			  }
			  if(b6.getText()=="")
			  {
				  b5.setText("");
				  b6.setText(label);
			  }
			  if(b8.getText()=="")
			  {
				  b5.setText("");
				  b8.setText(label);
			  }
			  }
	
		  
		  if(event.getSource()==b6)
		  {
			  String label=b6.getText();
			  if(b3.getText()=="")
			  {
				  b6.setText("");
				  b3.setText(label);
			  }
			  if(b5.getText()=="")
			  {
				  b6.setText("");
				  b5.setText(label);
			  }
			  if(b9.getText()=="")
			  {
				  b6.setText("");
				  b9.setText(label);
			  }
		  }
		  
		  if(event.getSource()==b7)
		  {
			  String label=b7.getText();
			  if(b4.getText()=="")
			  {
				  b7.setText("");
				  b4.setText(label);
			  }
			  if(b8.getText()=="")
			  {
				  b7.setText("");
				  b8.setText(label);
			  }
		  }
		  
		  if(event.getSource()==b8)
		  {
			  String label=b8.getText();
			  if(b5.getText()=="")
			  {
				  b8.setText("");
				  b5.setText(label);
			  }
			  if(b7.getText()=="")
			  {
				  b8.setText("");
				  b7.setText(label);
			  }
			  if(b9.getText()=="")
			  {
				  b8.setText("");
				  b9.setText(label);  
			  }
		  }
		
		  if(event.getSource()==b9)
		  {
			  String label=b9.getText();
			  if(b8.getText()=="")
			  {
				  b9.setText("");
				  b8.setText(label);
			  }
			  if(b6.getText()=="")
			  {
				  b9.setText("");
				  b6.setText(label);
			  }
		  }	
		  
		  if(event.getSource()==reset)
		  {
			  b1.setText("5");
			  b2.setText("3");
			  b3.setText("2");
			  b4.setText("1");
			  b5.setText("4");
			  b6.setText("7");
			  b7.setText("6");
			  b8.setText("");
			  b9.setText("8");
		  }
		
		if(b1.getText()=="1"&&b2.getText()=="2"&&b3.getText()=="3"
				&&b4.getText()=="4"&&b5.getText()=="5"&&b6.getText()=="6"
				&&b7.getText()=="7"&&b8.getText()=="8"&&b9.getText()=="")
		{
			b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
			b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
			b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
			JOptionPane.showMessageDialog(frame, "Congratulations ! You Won !!!");
			System.exit(0);		
		}
		
	}	
		
	public static void main(String[] args) 
	{  
	   Puzzle p= new Puzzle(); 
	   
	} 
	}
	 


