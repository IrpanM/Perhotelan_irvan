
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class reservasi {
	public static void main (String[] args)	 


	{
		JFrame form = new JFrame();
		form.setTitle("");
		form.setSize(500,600);
		form.setLocationRelativeTo(null);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setResizable(false);
		form.setVisible(true);
		
		form.setLayout(null);
		
		JLabel labell = new JLabel();
		labell.setText ("RESERVASI");
		labell.setFont(new Font("Tahoma", Font.BOLD, 22));
		labell.setForeground(Color.black);	
		labell.setHorizontalAlignment(JLabel.CENTER);
		labell.setBounds(0, 40, 500, 20);
		form.add(labell);
		
		JLabel label2 = new JLabel ();
		label2.setText("id_reservasi");
		label2.setHorizontalAlignment(JLabel.LEFT);
		label2.setBounds (50, 100, 150, 20);
		form.add(label2);
		
		JLabel label3 = new JLabel ();
		label3.setText("id_kamar");
		label3.setHorizontalAlignment(JLabel.LEFT);
		label3.setBounds (50, 160, 150, 20);
		//20 = from left, 70 = from up, 150 = lebar label, 20 = tinggi  
		form.add(label3);
		//didalam tanda kutif boleh menggunakn spasi
		
		JLabel label4 = new JLabel ();
		label4.setText("id_tamu");
		label4.setHorizontalAlignment(JLabel.LEFT);
		label4.setBounds (50, 220, 150, 20);
		form.add(label4);
		
		JLabel label5 = new JLabel ();
		label5.setText("harga_kamar");
		label5.setHorizontalAlignment(JLabel.LEFT);
		label5.setBounds (50, 280, 150, 20);
		form.add(label5);
		
		JLabel label6 = new JLabel ();
		label6.setText("cara_bayar");
		label6.setHorizontalAlignment(JLabel.LEFT);
		label6.setBounds (50, 340, 150, 20);
		form.add(label6);
		
		JLabel label7 = new JLabel ();
		label7.setText("cek_in");
		label7.setHorizontalAlignment(JLabel.LEFT);
		label7.setBounds (50, 400, 150, 20);
		form.add(label7);
		
		JLabel label8 = new JLabel ();
		label8.setText("cek_out");
		label8.setHorizontalAlignment(JLabel.LEFT);
		label8.setBounds (50, 460, 150, 20);
		form.add(label8);
		
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
		
		JTextField TextName = new JTextField();
		TextName.setBounds(180, 275, 200, 28);
		form.add(TextName);	
			
		JTextField TextPass = new JTextField();
		TextPass.setBounds(180, 335, 200, 28);				
		form.add(TextPass);
			
		JTextField TextIn = new JTextField();
		TextIn.setBounds(180, 395, 200, 28);				
		form.add(TextIn);
		
		JTextField TextOut = new JTextField();
		TextOut.setBounds(180, 455, 200, 28);				
		form.add(TextOut);
		
	}	
}