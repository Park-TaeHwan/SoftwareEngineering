import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class insertGUI extends JFrame implements ActionListener{

		public insertGUI ()
		{
			JFrame frm = new JFrame("Project ");
			setSize(500, 500);
			setTitle ("Button Demo");
			Container contentPane = getContentPane ();
			contentPane.setBackground (Color.GRAY);
			contentPane.setLayout (new FlowLayout ());
			JButton stopButton = new JButton ("Insert");
			stopButton.addActionListener (this);
			contentPane.add (stopButton);
			
			JButton goButton = new JButton ("Update");
			goButton.addActionListener (this);
			goButton.setBounds(250, 60, 80, 30);
			stopButton.setBounds(140, 60, 80, 30);
			contentPane.add (goButton);
		}
		
		@Override
		public void actionPerformed (ActionEvent e)
		{
			Container contentPane = getContentPane ();
			if (e.getActionCommand ().equals ("Red"))
			contentPane.setBackground (Color.RED);
			else if (e.getActionCommand ().equals ("Green"))
			contentPane.setBackground (Color.GREEN);
			else
			System.out.println ("Error in button interface.");
		}
		/**
		Creates and displays a window of the class ButtonDemo.
		*/
		public static void main (String [] args)
		{
			insertGUI buttonGui = new insertGUI ();
			buttonGui.setVisible (true);
		}



	}
