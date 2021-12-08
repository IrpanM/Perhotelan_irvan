
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login {
	public static void main (String[] args)	 


	{
		JFrame form = new JFrame();
		form.setTitle("");
		form.setSize(500,350);
		form.setLocationRelativeTo(null);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setResizable(false);
		form.setVisible(true);
		
		form.setLayout(null);
		
		JLabel labell = new JLabel();
		labell.setText ("LOGIN");
		labell.setFont(new Font("Tahoma", Font.BOLD, 22));
		labell.setForeground(Color.black);	
		labell.setHorizontalAlignment(JLabel.CENTER);
		labell.setBounds(0, 40, 500, 20);
		form.add(labell);
		
		JLabel label2 = new JLabel ();
		label2.setText("id_login");
		label2.setHorizontalAlignment(JLabel.LEFT);
		label2.setBounds (50, 100, 150, 20);
		form.add(label2);
		
		JLabel label3 = new JLabel ();
		label3.setText("username");
		label3.setHorizontalAlignment(JLabel.LEFT);
		label3.setBounds (50, 160, 150, 20);
		//20 = from left, 70 = from up, 150 = lebar label, 20 = tinggi  
		form.add(label3);
		//didalam tanda kutif boleh menggunakn spasi
		
		JLabel label4 = new JLabel ();
		label4.setText("password");
		label4.setHorizontalAlignment(JLabel.LEFT);
		label4.setBounds (50, 220, 150, 20);
		form.add(label4);
		
		form.setLayout(null);
			
		JTextField TextID = new JTextField();
		TextID.setBounds(180, 95, 200, 28);				
		form.add(TextID);
		
		JTextField TextContact = new JTextField();
		TextContact.setBounds(180, 155, 200, 28);
		form.add(TextContact);	
			
		JTextField TextAddress = new JTextField();
		TextAddress.setBounds(180, 215, 200, 28);				
		form.add(TextAddress);
		form.setForeground(Color.red);
				
	}	
}