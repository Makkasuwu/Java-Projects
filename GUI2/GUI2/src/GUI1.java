import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GUI1 extends JFrame 
{
	 private JFrame frame = new JFrame();

public GUI1() 
{
	super("My Simple Frame"); setBounds(100,100,300,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    
    JLabel Sa= new JLabel("Sales");
    JLabel Sal= new JLabel("Salary");
    add(Sa);
	add(Sal);
    setVisible(true); 
    setLayout(new GridLayout(0, 1));
}

public static void main(String[] args)
{
	
	
} 

/*private class SalesFieldListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		
	double salary= 0.0 ;*/
	

	
		
		
		
		
	
}
		

