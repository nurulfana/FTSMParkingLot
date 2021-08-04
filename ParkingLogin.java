import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParkingLogin	 {

	private JFrame frameLogin;
	private JTextField textusername;
	private JPasswordField textpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingLogin window = new ParkingLogin();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ParkingLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLogin = new JFrame();
		frameLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frameLogin.setBounds(100, 100, 451, 327);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.setLocationRelativeTo(null);
		frameLogin.getContentPane().setLayout(null);
		
		JLabel UserNmae = new JLabel("USERNAME");
		UserNmae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		UserNmae.setBounds(41, 100, 84, 14);
		frameLogin.getContentPane().add(UserNmae);
		
		textusername = new JTextField();
		textusername.setBackground(SystemColor.inactiveCaptionBorder);
		textusername.setBounds(135, 99, 240, 20);
		frameLogin.getContentPane().add(textusername);
		textusername.setColumns(10);
		
		JLabel Password = new JLabel("PASSWORD");
		Password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Password.setBounds(41, 130, 84, 14);
		frameLogin.getContentPane().add(Password);
		
		JButton Loginbutton = new JButton("LOGIN");
		Loginbutton.setBackground(new Color(152, 251, 152));
		Loginbutton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				FileReader fr=new FileReader("createAccount.txt");
				BufferedReader br=new BufferedReader(fr);
				String in=br.readLine();
				String m=textusername.getText();
				String m1=textpassword.getText();
				while(in!=null){
					String[] prts = in.split(" ");
				
					if(prts[0].equals(m1)){
						
						if(prts[1].equals(m)){
							
							String s=prts[3];
							ParkingLot1 p1= new ParkingLot1();   // calling home window will come.
						   ParkingLot1.main(null);
						   frameLogin.setVisible(false);
						break;
						}
						else{
							JOptionPane.showMessageDialog(Loginbutton,"Wrong Password");
							break;
						}
				}
					in=br.readLine();
					if(in==null){
							JOptionPane.showMessageDialog(Loginbutton,"Create Acccount First");
					}
				}
					br.close();
				}
				catch(FileNotFoundException e){
					e.printStackTrace();
				}
				catch(IOException e){
					System.out.println(e.getMessage());
				}
				catch(NumberFormatException e){
					System.out.println(e.getMessage());
				}
				frameLogin.setVisible(false);
				
//				String username= textusername.getText();
//				String password= textpassword.getText();
//				
//				if(password.contains("12345")&& username.contains("leonardo")) {
//					ParkingLot1 p1= new ParkingLot1();   // calling home window will come.
//					ParkingLot1.main(null);
//					frameLogin.setVisible(false);
//					
//					/*textusername.setText(null);
//					textpassword.setText(null);*/
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "Username/Password Invalid","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
//				}
				
			}
			
		});
		Loginbutton.setBounds(59, 181, 316, 23);
		frameLogin.getContentPane().add(Loginbutton);
		
		textpassword = new JPasswordField();
		textpassword.setBackground(SystemColor.inactiveCaptionBorder);
		textpassword.setBounds(135, 129, 240, 20);
		frameLogin.getContentPane().add(textpassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 68, 419, 11);
		frameLogin.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN TO FTSM PARKING LOT");
		lblNewLabel_2.setForeground(new Color(135, 206, 250));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2.setBounds(41, 11, 334, 46);
		frameLogin.getContentPane().add(lblNewLabel_2);
		
		JButton Createbutton = new JButton("CREATE NEW ACCOUNT");
		Createbutton.setBackground(new Color(255, 250, 205));
		Createbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CreateNewAcc cn= new CreateNewAcc();   //creating account window will come.
				CreateNewAcc.main(null);
			}
		});
		Createbutton.setBounds(59, 215, 316, 23);
		frameLogin.getContentPane().add(Createbutton);
		
		JButton Exitbutton = new JButton("EXIT");
		Exitbutton.setBackground(new Color(250, 128, 114));
		Exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameLogin = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frameLogin, "Are you sure if you want to exit?", null, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		Exitbutton.setBounds(61, 249, 314, 23);
		frameLogin.getContentPane().add(Exitbutton);
}
}

