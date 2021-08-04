import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;


public class CreateNewAcc {

	private JFrame frameCreateAccount;
	private JTextField usernametext;
	private JTextField passwordtext;
	private JTextField emailtext;
	private JTextField mobiletext;
	private JTextField birthdaytext;
	private JTextField gendertext;
	private JTextField nametext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewAcc window = new CreateNewAcc();
					window.frameCreateAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateNewAcc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameCreateAccount = new JFrame();
		frameCreateAccount.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frameCreateAccount.getContentPane().setBackground(new Color(135, 206, 250));
		frameCreateAccount.setTitle("Create Account");
		frameCreateAccount.setBounds(100, 100, 481, 610);
		frameCreateAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCreateAccount.setLocationRelativeTo(null);
		frameCreateAccount.getContentPane().setLayout(null);
		
		JLabel caName = new JLabel("USERNAME");
		caName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		caName.setBounds(52, 363, 77, 23);
		frameCreateAccount.getContentPane().add(caName);
		
		JLabel label = new JLabel("CREATE NEW ACCOUNT\r\n");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(107, 11, 248, 34);
		frameCreateAccount.getContentPane().add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 56, 419, 2);
		frameCreateAccount.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 302, 419, 15);
		frameCreateAccount.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_10 = new JLabel("PERSONAL INFO\r\n");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(52, 87, 131, 23);
		frameCreateAccount.getContentPane().add(lblNewLabel_10);
		
		JLabel lblLoginInfo = new JLabel("LOGIN INFO\r\n");
		lblLoginInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoginInfo.setBounds(52, 329, 113, 23);
		frameCreateAccount.getContentPane().add(lblLoginInfo);
		
		JLabel caPassword = new JLabel("PASSWORD");
		caPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		caPassword.setBounds(52, 440, 79, 22);
		frameCreateAccount.getContentPane().add(caPassword);
		
		JLabel caEmail = new JLabel("EMAIL");
		caEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		caEmail.setBounds(50, 234, 54, 23);
		frameCreateAccount.getContentPane().add(caEmail);
		
		JLabel caMobile = new JLabel("MOBILE NO");
		caMobile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		caMobile.setBounds(50, 268, 83, 23);
		frameCreateAccount.getContentPane().add(caMobile);
		
		JLabel caBirth = new JLabel("BIRTHDAY");
		caBirth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		caBirth.setBounds(50, 188, 77, 22);
		frameCreateAccount.getContentPane().add(caBirth);
		
		JLabel lblNewLabel_8 = new JLabel("(EXP: 23/12/2020)");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(50, 209, 89, 14);
		frameCreateAccount.getContentPane().add(lblNewLabel_8);
		
		usernametext = new JTextField();
		usernametext.setBounds(137, 365, 156, 23);
		frameCreateAccount.getContentPane().add(usernametext);
		usernametext.setColumns(10);
		
		passwordtext = new JTextField();
		passwordtext.setColumns(10);
		passwordtext.setBounds(139, 441, 154, 24);
		frameCreateAccount.getContentPane().add(passwordtext);
		
		emailtext = new JTextField();
		emailtext.setColumns(10);
		emailtext.setBounds(137, 234, 156, 23);
		frameCreateAccount.getContentPane().add(emailtext);
		
		mobiletext = new JTextField();
		mobiletext.setColumns(10);
		mobiletext.setBounds(137, 268, 156, 23);
		frameCreateAccount.getContentPane().add(mobiletext);
		
		birthdaytext = new JTextField();
		birthdaytext.setColumns(10);
		birthdaytext.setBounds(137, 190, 156, 23);
		frameCreateAccount.getContentPane().add(birthdaytext);
		
		JButton Signinbutton = new JButton("SIGN IN");
		Signinbutton.setBackground(new Color(152, 251, 152));
		Signinbutton.setBackground(new Color(152, 251, 152));
		Signinbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					
				    FileWriter pr=new FileWriter("createAccount.txt",true);
					BufferedWriter bw=new BufferedWriter(pr);
					String a=passwordtext.getText();
					String p=usernametext.getText();	
					String n=nametext.getText();
					String g=gendertext.getText();
					String b=birthdaytext.getText();
					String ip=emailtext.getText();
					String po=mobiletext.getText();
					
					
					
					 //pr.append(" ").println();
					 
						bw.write(a+" "+p+" "+n+" "+g+" "+b+" "+ip+" "+po);
						 // bw.append("\n");
						bw.newLine();
						bw.close();
					}
					catch(Exception e){
						System.out.print("Exception");
					}
				
				
				
//				if(obj== btnNewButton) {
//					createAccount temp = new createAccount(usernametext.getText(), passwordtext.getText(),
//					nametext.getText(),gendertext.getText(),birthdaytext.getText(),emailtext.getText(),mobiletext.getText());
//					if (hp.get(temp)==null) {
//						create.add(temp);
//						hp.put(temp, true);
//						passwordtext.setText("");
//						usernametext.setText("");
//						nametext.setText("");
//						gendertext.setText("");
//						birthdaytext.setText("");
//						emailtext.setText("");
//						mobiletext.setText("");
//						//searchMessage.setText("");
//					}  else {
//						passwordtext.setText("");
//						usernametext.setText("");
//						nametext.setText("");
//						gendertext.setText("");
//						birthdaytext.setText("");
//						emailtext.setText("");
//						mobiletext.setText("");
//						//searchMessage.setText("");
//					}
//					try {
//						PrintWriter bw= new PrintWriter(new BufferedWriter(new FileWriter("createAccount.txt", true)));
//						for(int i=0; i<create.size();i++) {
//							bw.println(create.get(i).username+" "+ create.get(i).password+ " "+ create.get(i).name+ " "+
//							create.get(i).gender+" "+create.get(i).birthday+" "+create.get(i).email+" "+create.get(i).mobile;
//					
//						}
//						bw.close();
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
				
				
				ParkingLogin pl= new ParkingLogin();
				ParkingLogin.main(null);
				frameCreateAccount.setVisible(false);
			}
		});
		Signinbutton.setBounds(23, 541, 419, 23);
		frameCreateAccount.getContentPane().add(Signinbutton);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(50, 121, 77, 22);
		frameCreateAccount.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GENDER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(49, 156, 67, 23);
		frameCreateAccount.getContentPane().add(lblNewLabel_1);
		
		gendertext = new JTextField();
		gendertext.setColumns(10);
		gendertext.setBounds(137, 156, 156, 23);
		frameCreateAccount.getContentPane().add(gendertext);
		
		nametext = new JTextField();
		nametext.setColumns(10);
		nametext.setBounds(137, 121, 254, 23);
		frameCreateAccount.getContentPane().add(nametext);
		
		JLabel lblNewLabel_2 = new JLabel("*MUST FILL IN ALL FORMS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setBounds(52, 69, 170, 14);
		frameCreateAccount.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("(must contains only 1 word, only letters and no space)");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(52, 397, 326, 17);
		frameCreateAccount.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("(must contains only numbers and no space)");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(52, 473, 278, 14);
		frameCreateAccount.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("(EXP: leonardo)");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(52, 417, 131, 14);
		frameCreateAccount.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("(EXP: 1234)");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setBounds(52, 489, 113, 14);
		frameCreateAccount.getContentPane().add(lblNewLabel_6);
		
	}
}