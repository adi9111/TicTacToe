import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Tictactoe extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel; 
	JButton[] button;
	 int count=0;
	 int sign=0;
	
	
	public Tictactoe()
	{
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		panel.setSize(300, 300);
		this.add(panel);
		
		button= new JButton[9];
		for(int i=0;i<=8;i++)
		{
			button[i]=new JButton();
			panel.add(button[i]);
			button[i].setEnabled(true);
		}
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		Set s = new Set();
	
		
		for(int i=0;i<=8;i++)
		{
			button[i].addActionListener(s);
		}
	
	}
	
	private  class Set implements ActionListener
	{
		
			@Override
		public void actionPerformed(ActionEvent e)
		{
				count++;
				
				for(int i=0;i<=8;i++)
				{
					if(button[i]==(JButton)e.getSource()){
						if(sign%2==0)
						{
							button[i].setText("X");
							button[i].setEnabled(false);
						}else
						{
							button[i].setText("O");
							button[i].setEnabled(false);
						}
						
					}
					
				}
				
				if(count>=9)
				{
					JOptionPane.showMessageDialog(null, "Cuts round");
					for(int j=0;j<=8;j++)
					{
						button[j].setText(" ");
						button[j].setEnabled(true);
					}
					count=0;
					sign=0;
					return;
				}
				
				
				sign++;
					
					
				CheckWinner();	
			
		
		}
			
	
		
		
		
		
		
	
		
		
		
		
	}
	
	  public void CheckWinner()
	  {
		  if(button[0].getText()=="X"&&button[1].getText()=="X"&&button[2].getText()=="X")
		  {
			  JOptionPane.showMessageDialog(null, "X Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
		  if(button[3].getText()=="X"&&button[4].getText()=="X"&&button[5].getText()=="X")
		  {
			  JOptionPane.showMessageDialog(null, "X Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
		  if(button[6].getText()=="X"&&button[7].getText()=="X"&&button[8].getText()=="X")
		  {
			  JOptionPane.showMessageDialog(null, "X Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
		  if(button[0].getText()=="X"&&button[4].getText()=="X"&&button[8].getText()=="X")
		  {
			  JOptionPane.showMessageDialog(null, "X Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
		  if(button[2].getText()=="X"&&button[4].getText()=="X"&&button[6].getText()=="X")
		  {
			  JOptionPane.showMessageDialog(null, "X Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
			 
		  }
		  
		  if(button[0].getText()=="O"&&button[1].getText()=="O"&&button[2].getText()=="O")
		  {
			  JOptionPane.showMessageDialog(null, "O Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
		  if(button[3].getText()=="O"&&button[4].getText()=="O"&&button[5].getText()=="O")
		  {
			  JOptionPane.showMessageDialog(null, "O Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
		  if(button[6].getText()=="O"&&button[7].getText()=="O"&&button[8].getText()=="O")
		  {
			  JOptionPane.showMessageDialog(null, "O Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
		  if(button[0].getText()=="O"&&button[4].getText()=="O"&&button[8].getText()=="O")
		  {
			  JOptionPane.showMessageDialog(null, "O Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
		  if(button[2].getText()=="O"&&button[4].getText()=="O"&&button[6].getText()=="O")
		  {
			  JOptionPane.showMessageDialog(null, "O Wins");
			  for(int j=0;j<=8;j++)
				{
					button[j].setText(" ");
					button[j].setEnabled(true);
					
				}
			  count=0;
				sign=0;
		  }
	  }
	
	
	
	
	
	
	
	
	
		
	
	 
	
	

}
