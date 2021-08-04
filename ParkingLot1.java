import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;


public class ParkingLot1 {
	String s; 
	int counter=1;
	int counter2=1;
	int counter3=0;
	int counter4=0;
	int setno;
	String status;
	String gender;
	String words;

	private JFrame frameGL;
	private JTextField nameParktext;
	private JTextField modelParktext;
	private JTextField platenoParktext;
	private JTextField placenoParktext;
	private JTextField cellnoParktext;
	private JTable phtable;
	private JTable appointable;
	private JTextField textName;
	private JTextField textStaffID;
	private JTextField textICNo;
	private JTextField textCellNo;
	private JTextField textDateAppoint;
	private JTextField textDateEnd;
	private JTextField textRName;
	private JTextField textRModel;
	private JTextField textRPlate;
	private JTextField textRMobile;
	private JTextField textRIC;
	private JTextField textRNo;
	private JTable rhtable;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingLot1 window = new ParkingLot1();
					window.frameGL.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ParkingLot1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameGL = new JFrame();
		frameGL.getContentPane().setBackground(new Color(135, 206, 250));
		frameGL.setBounds(100, 100, 1104, 688);
		frameGL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameGL.setLocationRelativeTo(null);
		frameGL.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FTSM PARKING LOT");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(293, 9, 416, 64);
		frameGL.getContentPane().add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 84, 1072, 558);
		frameGL.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("PARK VEHICLE", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PLEASE SELECT A PARKING LOT TYPE:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 11, 255, 14);
		panel.add(lblNewLabel_1);
		
		JButton Generalbutton = new JButton("GENERAL");
		Generalbutton.setFont(new Font("Tahoma", Font.BOLD, 11));
		Generalbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingLot1 p1= new ParkingLot1();   
				ParkingLot1.main(null);
				frameGL.setVisible(false);
			}
		});
		Generalbutton.setBackground(new Color(135, 206, 250));
		Generalbutton.setBounds(57, 36, 113, 23);
		panel.add(Generalbutton);
		
		JButton Motorbutton = new JButton("MOTORCYLE");
		Motorbutton.setFont(new Font("Tahoma", Font.BOLD, 11));
		Motorbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingLot2 p2= new ParkingLot2();   
				ParkingLot2.main(null);
				frameGL.setVisible(false);
			}
		});
		Motorbutton.setBackground(new Color(135, 206, 250));
		Motorbutton.setBounds(169, 36, 113, 23);
		panel.add(Motorbutton);
		
		JButton Staffbutton = new JButton("STAFF");
		Staffbutton.setFont(new Font("Tahoma", Font.BOLD, 11));
		Staffbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingLot3 p3= new ParkingLot3();   
				ParkingLot3.main(null);
				frameGL.setVisible(false);
			}
		});
		Staffbutton.setBackground(new Color(135, 206, 250));
		Staffbutton.setBounds(281, 36, 113, 23);
		panel.add(Staffbutton);
		
		JButton MStaffbutton = new JButton("MANAGEMENT STAFF");
		MStaffbutton.setFont(new Font("Tahoma", Font.BOLD, 11));
		MStaffbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingLot4 p4= new ParkingLot4();   
				ParkingLot4.main(null);
				frameGL.setVisible(false);
			}
		});
		MStaffbutton.setBackground(new Color(135, 206, 250));
		MStaffbutton.setBounds(392, 36, 165, 23);
		panel.add(MStaffbutton);
		
		JLabel lblNewLabel_2 = new JLabel("-GENERAL CAR PARKING LOT-");
		lblNewLabel_2.setBackground(SystemColor.info);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(169, 83, 239, 32);
		panel.add(lblNewLabel_2);
			
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(135, 206, 250), 4, true));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(58, 115, 462, 352);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton buttonA1 = new JButton("A1");
		buttonA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA1) {
					buttonA1.setEnabled(false);
					String s= "A1,GL";
					placenoParktext.setText(s);
				}
			}
		});
		buttonA1.setBounds(27, 11, 61, 23);
		panel_4.add(buttonA1);
		
		JButton buttonA2 = new JButton("A2");
		buttonA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA2) {
					String s= "A2,GL";
					placenoParktext.setText(s);
					buttonA2.setEnabled(false);
				}
			}
		});
		buttonA2.setBounds(27, 45, 61, 23);
		panel_4.add(buttonA2);
		
		JButton buttonA3 = new JButton("A3");
		buttonA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA3) {
					String s= "A3,GL";
					placenoParktext.setText(s);
					buttonA3.setEnabled(false);
				}
			}
		});
		buttonA3.setBounds(27, 79, 61, 23);
		panel_4.add(buttonA3);
		
		JButton buttonA4 = new JButton("A4");
		buttonA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA4) {
					String s= "A4,GL";
					placenoParktext.setText(s);
					buttonA4.setEnabled(false);
				}
			}
		});
		buttonA4.setBounds(27, 113, 61, 23);
		panel_4.add(buttonA4);
		
		JButton buttonA5 = new JButton("A5");
		buttonA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA5) {
					String s= "A5,GL";
					placenoParktext.setText(s);
					buttonA5.setEnabled(false);
				}
			}
		});
		buttonA5.setBounds(27, 147, 61, 23);
		panel_4.add(buttonA5);
		
		JButton buttonA6 = new JButton("A6");
		buttonA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA6) {
					String s= "A6,GL";
					placenoParktext.setText(s);
					buttonA6.setEnabled(false);
				}
			}
		});
		buttonA6.setBounds(27, 181, 61, 23);
		panel_4.add(buttonA6);
		
		JButton buttonA7 = new JButton("A7");
		buttonA7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA7) {
					String s= "A7,GL";
					placenoParktext.setText(s);
					buttonA7.setEnabled(false);
				}
			}
		});
		buttonA7.setBounds(27, 215, 61, 23);
		panel_4.add(buttonA7);
		
		JButton buttonA8 = new JButton("A8");
		buttonA8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA8) {
					String s= "A8,GL";
					placenoParktext.setText(s);
					buttonA8.setEnabled(false);
				}
			}
		});
		buttonA8.setBounds(27, 249, 61, 23);
		panel_4.add(buttonA8);
		
		JButton buttonA9 = new JButton("A9");
		buttonA9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA9) {
					String s= "A9,GL";
					placenoParktext.setText(s);
					buttonA9.setEnabled(false);
				}
			}
		});
		buttonA9.setBounds(27, 283, 61, 23);
		panel_4.add(buttonA9);
		
		JButton buttonA10 = new JButton("A10");
		buttonA10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		buttonA10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA10) {
					String s= "A10,GL";
					placenoParktext.setText(s);
					buttonA10.setEnabled(false);
				}
			}
		});
		buttonA10.setBounds(27, 317, 61, 23);
		panel_4.add(buttonA10);
		
		JButton buttonB1 = new JButton("B1");
		buttonB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB1) {
					String s= "B1,GL";
					placenoParktext.setText(s);
					buttonB1.setEnabled(false);
				}
			}
		});
		buttonB1.setBounds(98, 11, 61, 23);
		panel_4.add(buttonB1);
		
		JButton buttonB2 = new JButton("B2");
		buttonB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB2) {
					String s= "B2,GL";
					placenoParktext.setText(s);
					buttonB2.setEnabled(false);
				}
			}
		});
		buttonB2.setBounds(98, 45, 61, 23);
		panel_4.add(buttonB2);
		
		JButton buttonB3 = new JButton("B3");
		buttonB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB3) {
					String s= "B3,GL";
					placenoParktext.setText(s);
					buttonB3.setEnabled(false);
				}
			}
		});
		buttonB3.setBounds(98, 79, 61, 23);
		panel_4.add(buttonB3);
		
		JButton buttonB4 = new JButton("B4");
		buttonB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB4) {
					String s= "B4,GL";
					placenoParktext.setText(s);
					buttonB4.setEnabled(false);
				}
			}
		});
		buttonB4.setBounds(98, 113, 61, 23);
		panel_4.add(buttonB4);
		
		JButton buttonB5 = new JButton("B5");
		buttonB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB5) {
					String s= "B5,GL";
					placenoParktext.setText(s);
					buttonB5.setEnabled(false);
				}
			}
		});
		buttonB5.setBounds(98, 147, 61, 23);
		panel_4.add(buttonB5);
		
		JButton buttonB6 = new JButton("B6");
		buttonB6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB6) {
					String s= "B6,GL";
					placenoParktext.setText(s);
					buttonB6.setEnabled(false);
				}
			}
		});
		buttonB6.setBounds(98, 181, 61, 23);
		panel_4.add(buttonB6);
		
		JButton buttonB7 = new JButton("B7");
		buttonB7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB7) {
					String s= "B7,GL";
					placenoParktext.setText(s);
					buttonB7.setEnabled(false);
				}
			}
		});
		buttonB7.setBounds(98, 215, 61, 23);
		panel_4.add(buttonB7);
		
		JButton buttonB8 = new JButton("B8");
		buttonB8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB8) {
					String s= "B8,GL";
					placenoParktext.setText(s);
					buttonB8.setEnabled(false);
				}
			}
		});
		buttonB8.setBounds(98, 249, 61, 23);
		panel_4.add(buttonB8);
		
		JButton buttonB9 = new JButton("B9");
		buttonB9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB9) {
					String s= "B9,GL";
					placenoParktext.setText(s);
					buttonB9.setEnabled(false);
				}
			}
		});
		buttonB9.setBounds(98, 283, 61, 23);
		panel_4.add(buttonB9);
		
		JButton buttonB10 = new JButton("B10");
		buttonB10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		buttonB10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonB10) {
					String s= "B10,GL";
					placenoParktext.setText(s);
					buttonB10.setEnabled(false);
				}
			}
		});
		buttonB10.setBounds(98, 317, 61, 23);
		panel_4.add(buttonB10);
		
		JButton buttonC1 = new JButton("C1");
		buttonC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC1) {
					String s= "C1,GL";
					placenoParktext.setText(s);
					buttonC1.setEnabled(false);
				}
			}
		});
		buttonC1.setBounds(205, 11, 61, 23);
		panel_4.add(buttonC1);
		
		JButton buttonC2 = new JButton("C2");
		buttonC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC2) {
					String s= "C2,GL";
					placenoParktext.setText(s);
					buttonC2.setEnabled(false);
				}
			}
		});
		buttonC2.setBounds(205, 45, 61, 23);
		panel_4.add(buttonC2);
		
		JButton buttonC3 = new JButton("C3");
		buttonC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC3) {
					String s= "C3,GL";
					placenoParktext.setText(s);
					buttonC3.setEnabled(false);
				}
			}
		});
		buttonC3.setBounds(205, 79, 61, 23);
		panel_4.add(buttonC3);
		
		JButton buttonC4 = new JButton("C4");
		buttonC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC4) {
					String s= "C4,GL";
					placenoParktext.setText(s);
					buttonC4.setEnabled(false);
				}
			}
		});
		buttonC4.setBounds(205, 113, 61, 23);
		panel_4.add(buttonC4);
		
		JButton buttonC5 = new JButton("C5");
		buttonC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC5) {
					String s= "C5,GL";
					placenoParktext.setText(s);
					buttonC5.setEnabled(false);
				}
			}
		});
		buttonC5.setBounds(205, 147, 61, 23);
		panel_4.add(buttonC5);
		
		JButton buttonC6 = new JButton("C6");
		buttonC6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC6) {
					String s= "C6,GL";
					placenoParktext.setText(s);
					buttonC6.setEnabled(false);
				}
			}
		});
		buttonC6.setBounds(205, 181, 61, 23);
		panel_4.add(buttonC6);
		
		JButton buttonC7 = new JButton("C7");
		buttonC7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC7) {
					String s= "C7,GL";
					placenoParktext.setText(s);
					buttonC7.setEnabled(false);
				}
			}
		});
		buttonC7.setBounds(205, 215, 61, 23);
		panel_4.add(buttonC7);
		
		JButton buttonC8 = new JButton("C8");
		buttonC8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC8) {
					String s= "C8,GL";
					placenoParktext.setText(s);
					buttonC8.setEnabled(false);
				}
			}
		});
		buttonC8.setBounds(205, 249, 61, 23);
		panel_4.add(buttonC8);
		
		JButton buttonC9 = new JButton("C9");
		buttonC9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC9) {
					String s= "C9,GL";
					placenoParktext.setText(s);
					buttonC9.setEnabled(false);
				}
			}
		});
		buttonC9.setBounds(205, 283, 61, 23);
		panel_4.add(buttonC9);
		
		JButton buttonC10 = new JButton("C10");
		buttonC10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		buttonC10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonC10) {
					String s= "C10,GL";
					placenoParktext.setText(s);
					buttonC10.setEnabled(false);
				}
			}
		});
		buttonC10.setBounds(205, 317, 61, 23);
		panel_4.add(buttonC10);
		
		JButton buttonD1 = new JButton("D1");
		buttonD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD1) {
					String s= "D1,GL";
					placenoParktext.setText(s);
					buttonD1.setEnabled(false);
				}
			}
		});
		buttonD1.setBounds(276, 11, 61, 23);
		panel_4.add(buttonD1);
		
		JButton buttonD2 = new JButton("D2");
		buttonD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD2) {
					String s= "D2,GL";
					placenoParktext.setText(s);
					buttonD2.setEnabled(false);
				}
			}
		});
		buttonD2.setBounds(276, 45, 61, 23);
		panel_4.add(buttonD2);
		
		JButton buttonD3 = new JButton("D3");
		buttonD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD3) {
					String s= "D3,GL";
					placenoParktext.setText(s);
					buttonD3.setEnabled(false);
				}
			}
		});
		buttonD3.setBounds(276, 79, 61, 23);
		panel_4.add(buttonD3);
		
		JButton buttonD4 = new JButton("D4");
		buttonD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD4) {
					String s= "D4,GL";
					placenoParktext.setText(s);
					buttonD4.setEnabled(false);
				}
			}
		});
		buttonD4.setBounds(276, 113, 61, 23);
		panel_4.add(buttonD4);
		
		JButton buttonD5 = new JButton("D5");
		buttonD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD5) {
					String s= "D5,GL";
					placenoParktext.setText(s);
					buttonD5.setEnabled(false);
				}
			}
		});
		buttonD5.setBounds(276, 147, 61, 23);
		panel_4.add(buttonD5);
		
		JButton buttonD6 = new JButton("D6");
		buttonD6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD6) {
					String s= "D6,GL";
					placenoParktext.setText(s);
					buttonD6.setEnabled(false);
				}
			}
		});
		buttonD6.setBounds(276, 181, 61, 23);
		panel_4.add(buttonD6);
		
		JButton buttonD7 = new JButton("D7");
		buttonD7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD7) {
					String s= "D7,GL";
					placenoParktext.setText(s);
					buttonD7.setEnabled(false);
				}
			}
		});
		buttonD7.setBounds(276, 215, 61, 23);
		panel_4.add(buttonD7);
		
		JButton buttonD8 = new JButton("D8");
		buttonD8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD8) {
					String s= "D8,GL";
					placenoParktext.setText(s);
					buttonD8.setEnabled(false);
				}
			}
		});
		buttonD8.setBounds(276, 249, 61, 23);
		panel_4.add(buttonD8);
		
		JButton buttonD9 = new JButton("D9");
		buttonD9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD9) {
					String s= "D9,GL";
					placenoParktext.setText(s);
					buttonD9.setEnabled(false);
				}
			}
		});
		buttonD9.setBounds(276, 283, 61, 23);
		panel_4.add(buttonD9);
		
		JButton buttonD10 = new JButton("D10");
		buttonD10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		buttonD10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonD10) {
					String s= "D10,GL";
					placenoParktext.setText(s);
					buttonD10.setEnabled(false);
				}
			}
		});
		buttonD10.setBounds(276, 317, 61, 23);
		panel_4.add(buttonD10);
		
		JButton buttonE1 = new JButton("E1");
		buttonE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE1) {
					String s= "E1,GL";
					placenoParktext.setText(s);
					buttonE1.setEnabled(false);
				}
			}
		});
		buttonE1.setBounds(382, 11, 61, 23);
		panel_4.add(buttonE1);
		
		JButton buttonE2 = new JButton("E2");
		buttonE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE2) {
					String s= "E2,GL";
					placenoParktext.setText(s);
					buttonE2.setEnabled(false);
				}
			}
		});
		buttonE2.setBounds(382, 45, 61, 23);
		panel_4.add(buttonE2);
		
		JButton buttonE3 = new JButton("E3");
		buttonE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE3) {
					String s= "E3,GL";
					placenoParktext.setText(s);
					buttonE3.setEnabled(false);
				}
			}
		});
		buttonE3.setBounds(382, 79, 61, 23);
		panel_4.add(buttonE3);
		
		JButton buttonE4 = new JButton("E4");
		buttonE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE4) {
					String s= "E4,GL";
					placenoParktext.setText(s);
					buttonE4.setEnabled(false);
				}
			}
		});
		buttonE4.setBounds(382, 113, 61, 23);
		panel_4.add(buttonE4);
		
		JButton buttonE5 = new JButton("E5");
		buttonE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE5) {
					String s= "E5,GL";
					placenoParktext.setText(s);
					buttonE5.setEnabled(false);
				}
			}
		});
		buttonE5.setBounds(382, 147, 61, 23);
		panel_4.add(buttonE5);
		
		JButton buttonE6 = new JButton("E6");
		buttonE6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE6) {
					String s= "E6,GL";
					placenoParktext.setText(s);
					buttonE6.setEnabled(false);
				}
			}
		});
		buttonE6.setBounds(382, 181, 61, 23);
		panel_4.add(buttonE6);
		
		JButton buttonE7 = new JButton("E7");
		buttonE7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE7) {
					String s= "E7,GL";
					placenoParktext.setText(s);
					buttonE7.setEnabled(false);
				}
			}
		});
		buttonE7.setBounds(382, 215, 61, 23);
		panel_4.add(buttonE7);
		
		JButton buttonE8 = new JButton("E8");
		buttonE8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE8) {
					String s= "E8,GL";
					placenoParktext.setText(s);
					buttonE8.setEnabled(false);
				}
			}
		});
		buttonE8.setBounds(382, 249, 61, 23);
		panel_4.add(buttonE8);
		
		JButton buttonE9 = new JButton("E9");
		buttonE9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE9) {
					String s= "E9,GL";
					placenoParktext.setText(s);
					buttonE9.setEnabled(false);
				}
			}
		});
		buttonE9.setBounds(382, 283, 61, 23);
		panel_4.add(buttonE9);
		
		JButton buttonE10 = new JButton("E10");
		buttonE10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		buttonE10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonE10) {
					String s= "E10,GL";
					placenoParktext.setText(s);
					buttonE10.setEnabled(false);
				}
			}
		});
		buttonE10.setBounds(382, 317, 61, 23);
		panel_4.add(buttonE10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(135, 206, 250), 4));
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(600, 115, 347, 352);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 36, 48, 14);
		panel_5.add(lblNewLabel_3);
		
		nameParktext = new JTextField();
		nameParktext.setBounds(57, 34, 268, 20);
		panel_5.add(nameParktext);
		nameParktext.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("OCCUPATION");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 68, 87, 14);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("VEHICLE TYPE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 105, 98, 17);
		panel_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("VEHICLE MODEL");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 138, 105, 14);
		panel_5.add(lblNewLabel_6);
		
		modelParktext = new JTextField();
		modelParktext.setBounds(117, 136, 179, 20);
		panel_5.add(modelParktext);
		modelParktext.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("PLATE NO");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(10, 165, 87, 14);
		panel_5.add(lblNewLabel_7);
		
		platenoParktext = new JTextField();
		platenoParktext.setBounds(117, 163, 106, 20);
		panel_5.add(platenoParktext);
		platenoParktext.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("PLACE NO");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(10, 196, 73, 14);
		panel_5.add(lblNewLabel_8);
		
		placenoParktext = new JTextField();
		placenoParktext.setBounds(117, 194, 48, 20);
		panel_5.add(placenoParktext);
		placenoParktext.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("MOBILE NO");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(10, 227, 87, 14);
		panel_5.add(lblNewLabel_9);
		
		cellnoParktext = new JTextField();
		cellnoParktext.setBounds(117, 225, 106, 20);
		panel_5.add(cellnoParktext);
		cellnoParktext.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT ONE", "STUDENT", "STAFF", "MANAGEMENT STAFF", "VISITOR"}));
		comboBox.setBounds(107, 65, 161, 22);
		panel_5.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ONE", "CAR", "MOTORCYCLE", "LORRY", "BUS"}));
		comboBox_1.setBounds(107, 103, 161, 22);
		panel_5.add(comboBox_1);
		
		JButton Parkbutton = new JButton("PARK VEHICLE HERE");
		Parkbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				if(comboBox_1.getSelectedItem()=="MOTORCYCLE" || comboBox_1.getSelectedItem()=="BUS" || comboBox_1.getSelectedItem()=="LORRY") {
					JOptionPane.showMessageDialog(Parkbutton, "PLEASE CHANGE VEHICLETYPE/PARKINGTYPE. TQ.","NOT ALLOWED TO PARK HERE",JOptionPane.OK_OPTION);
				}
				else {
				DefaultTableModel model = (DefaultTableModel) phtable.getModel();
				int no;
				model.addRow(new Object[] {
						counter,
						nameParktext.getText(),
						comboBox.getSelectedItem(),
						comboBox_1.getSelectedItem(),
						modelParktext.getText(),
						platenoParktext.getText(),
						placenoParktext.getText(),
						cellnoParktext.getText(),
						
				});
				counter=counter+1;
				counter3=counter-1;
				
		
				JOptionPane.showMessageDialog(Parkbutton,"INFO HAS BEEN ADDED TO PARKING HISTORY");
				JOptionPane.showMessageDialog(Parkbutton," DATA HAS BEEN SAVED TO ParkingLot.txt");
				try{
					
				    FileWriter pr=new FileWriter("ParkingLot.txt",true);
					BufferedWriter bw=new BufferedWriter(pr);
					nameParktext.getText();	
					comboBox.getSelectedItem();
					comboBox_1.getSelectedItem();
					modelParktext.getText();
					platenoParktext.getText();
					placenoParktext.getText();
					cellnoParktext.getText();
					 //pr.append(" ").println();
					
						bw.write(nameParktext.getText()+" "+comboBox.getSelectedItem()+" "+comboBox_1.getSelectedItem()
						+" "+modelParktext.getText()+" "+platenoParktext.getText()+" "+placenoParktext.getText()+" "+
						cellnoParktext.getText());
						 // bw.append("\n");
						bw.newLine();
						bw.close();
					}
					catch(Exception arg1){
						System.out.print("Exception");
					}
				if(phtable.getSelectedRow() == -1) {
					if(phtable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(Parkbutton, "INFO HAS BEEN ADDED","SUCCESS", JOptionPane.OK_OPTION);
					}
				}
			}
			}
		});
		Parkbutton.setBackground(new Color(144, 238, 144));
		Parkbutton.setBounds(171, 286, 166, 23);
		panel_5.add(Parkbutton);
		
		JButton Resetbutton = new JButton("RESET");
		Resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameParktext.setText("");
				comboBox.setSelectedItem("SELECT ONE");
				comboBox_1.setSelectedItem("SELECT ONE");
				modelParktext.setText("");
				platenoParktext.setText("");
				placenoParktext.setText("");
				cellnoParktext.setText("");
			}
		});
		Resetbutton.setBackground(new Color(135, 206, 250));
		Resetbutton.setBounds(76, 286, 91, 23);
		panel_5.add(Resetbutton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("REGISTER", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(135, 206, 235), 4, true));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(75, 101, 612, 333);
		panel_2.add(panel_6);
		
		JLabel lblFullName = new JLabel("FULL NAME");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFullName.setBounds(10, 47, 87, 14);
		panel_6.add(lblFullName);
		
		textRName = new JTextField();
		textRName.setColumns(10);
		textRName.setBounds(101, 45, 363, 20);
		panel_6.add(textRName);
		
		JLabel label_1 = new JLabel("OCCUPATION");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 79, 87, 14);
		panel_6.add(label_1);
		
		JLabel label_2 = new JLabel("VEHICLE TYPE");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(10, 142, 87, 20);
		panel_6.add(label_2);
		
		JLabel label_3 = new JLabel("VEHICLE MODEL");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(10, 173, 105, 18);
		panel_6.add(label_3);
		
		textRModel = new JTextField();
		textRModel.setColumns(10);
		textRModel.setBounds(121, 173, 161, 20);
		panel_6.add(textRModel);
		
		JLabel label_4 = new JLabel("PLATE NO");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(10, 206, 71, 14);
		panel_6.add(label_4);
		
		textRPlate = new JTextField();
		textRPlate.setColumns(10);
		textRPlate.setBounds(121, 204, 106, 20);
		panel_6.add(textRPlate);
		
		JLabel label_6 = new JLabel("MOBILE NO");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(10, 237, 87, 14);
		panel_6.add(label_6);
		
		textRMobile = new JTextField();
		textRMobile.setColumns(10);
		textRMobile.setBounds(121, 235, 161, 20);
		panel_6.add(textRMobile);
		
		JComboBox comboBox_R = new JComboBox();
		comboBox_R.setModel(new DefaultComboBoxModel(new String[] {"SELECT ONE", "STUDENT", "STAFF", "MANAGEMENT STAFF", "VISITOR"}));
		comboBox_R.setToolTipText("");
		comboBox_R.setBounds(101, 76, 161, 22);
		panel_6.add(comboBox_R);
		
		JComboBox comboBox_R1 = new JComboBox();
		comboBox_R1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ONE", "CAR", "MOTORCYCLE"}));
		comboBox_R1.setBounds(121, 140, 161, 22);
		panel_6.add(comboBox_R1);
		
		JButton Donebutton = new JButton("DONE");
		Donebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) rhtable.getModel();
				int no;
				model.addRow(new Object[] {
						textRName.getText(),
						comboBox_R.getSelectedItem(),
						textRNo.getText(),
						textRIC.getText(),
						comboBox_R1.getSelectedItem(),
						textRModel.getText(),
						textRPlate.getText(),
						textRMobile.getText(),
						
				});
				JOptionPane.showMessageDialog(Donebutton,"INFO HAS BEEN ADDED TO REGISTRATION HISTORY");
				JOptionPane.showMessageDialog(Donebutton," DATA HAS BEEN SAVED to Register.txt");
					Object obj = e.getSource();
					try{
						
					    FileWriter er=new FileWriter("Register.txt",true);
						BufferedWriter bb=new BufferedWriter(er);
						textRName.getText();
						comboBox_R.getSelectedItem();
						textRNo.getText();
						textRIC.getText();
						comboBox_R1.getSelectedItem();
						textRModel.getText();
						textRPlate.getText();
						textRMobile.getText();
						 //pr.append(" ").println();
						
							bb.write(textRName.getText()+" "+comboBox_R.getSelectedItem()+" "+textRNo.getText()
							+" "+textRIC.getText()+" "+comboBox_R1.getSelectedItem()+" "+textRModel.getText()+" "+
							textRPlate.getText()+" "+textRMobile.getText());
							 // bw.append("\n");
							bb.newLine();
							bb.close();
						}
						catch(Exception arg1){
							System.out.print("Exception");
						}
				if(rhtable.getSelectedRow() == -1) {
					if(rhtable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(Donebutton, "INFO HAS BEEN ADDED","SUCCESS", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		Donebutton.setBackground(new Color(144, 238, 144));
		Donebutton.setBounds(498, 299, 91, 23);
		panel_6.add(Donebutton);
		
		JButton Reset3button = new JButton("RESET");
		Reset3button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRName.setText("");
				comboBox_R.setSelectedItem("SELECT ONE");
				textRNo.setText("");
				textRIC.setText("");
				comboBox_R1.setSelectedItem("SELECT ONE");
				textRModel.setText("");
				textRPlate.setText("");
				textRMobile.setText("");
			}
		});
		Reset3button.setBackground(new Color(135, 206, 250));
		Reset3button.setBounds(397, 299, 91, 23);
		panel_6.add(Reset3button);
		
		JLabel lblNewLabel_16 = new JLabel("IC NO");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_16.setBounds(37, 108, 44, 21);
		panel_6.add(lblNewLabel_16);
		
		textRIC = new JTextField();
		textRIC.setBounds(101, 109, 161, 20);
		panel_6.add(textRIC);
		textRIC.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("MATRIC/STAFF/VISITOR NO");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_27.setBounds(275, 111, 171, 18);
		panel_6.add(lblNewLabel_27);
		
		textRNo = new JTextField();
		textRNo.setBounds(456, 109, 120, 20);
		panel_6.add(textRNo);
		textRNo.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("REGISTRATION NO");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_15.setBounds(10, 266, 120, 20);
		panel_6.add(lblNewLabel_15);
		
		JLabel lblNewLabel_26 = new JLabel("*MUST FILL IN ALL SLOTS");
		lblNewLabel_26.setForeground(new Color(255, 69, 0));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_26.setBounds(10, 11, 184, 14);
		panel_6.add(lblNewLabel_26);
		
		textField = new JTextField();
		textField.setBounds(131, 266, 152, 20);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("REGISTER VEHICLE");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_17.setBounds(20, 28, 158, 24);
		panel_2.add(lblNewLabel_17);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("PARKING HISTORY", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("PARKING HISTORY");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_12.setBounds(20, 11, 190, 25);
		panel_1.add(lblNewLabel_12);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 47, 1001, 276);
		panel_1.add(scrollPane);
		
		phtable = new JTable();
		phtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NO", "NAME", "OCCUPATION", "VEHICLE TYPE", "VEHICLE MODEL", "PLATE NO", "PLACE NO", "CELL NO"
			}
		));
		phtable.getColumnModel().getColumn(0).setPreferredWidth(42);
		phtable.getColumnModel().getColumn(1).setPreferredWidth(297);
		phtable.getColumnModel().getColumn(2).setPreferredWidth(162);
		phtable.getColumnModel().getColumn(3).setPreferredWidth(135);
		phtable.getColumnModel().getColumn(4).setPreferredWidth(136);
		phtable.getColumnModel().getColumn(5).setPreferredWidth(121);
		phtable.getColumnModel().getColumn(7).setPreferredWidth(120);
		phtable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		scrollPane.setViewportView(phtable);
		
		
		
		JButton Print2button = new JButton("PRINT");
		Print2button.setBackground(new Color(135, 206, 250));
		Print2button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				try {
					phtable.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("NO PRINTER FOUND", e.getMessage());
				}
			}
		});
		Print2button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Print2button.setBounds(829, 334, 91, 23);
		panel_1.add(Print2button);
		
		JButton Delete3button = new JButton("DELETE");
		Delete3button.setBackground(new Color(255, 99, 71));
		Delete3button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) phtable.getModel();
				if(phtable.getSelectedRow()==-1) {
					if(phtable.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "NO DATA TO DELETE",null,JOptionPane.OK_OPTION);
					}
					else {
						JOptionPane.showMessageDialog(null, "SELECT A ROW TO DELETE", null, JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(phtable.getSelectedRow());
					}
				}
			});
		Delete3button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Delete3button.setBounds(930, 334, 91, 23);
		panel_1.add(Delete3button);
		
		JButton Save3button = new JButton("SAVE");
		Save3button.setBackground(new Color(144, 238, 144));
		Save3button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Parkbutton," DATA HAS BEEN SAVED TO ParkingLot.txt");
				Object obj = e.getSource();
				try{
					
				    FileWriter pr=new FileWriter("ParkingLot.txt",true);
					BufferedWriter bw=new BufferedWriter(pr);
					nameParktext.getText();	
					comboBox.getSelectedItem();
					comboBox_1.getSelectedItem();
					modelParktext.getText();
					platenoParktext.getText();
					placenoParktext.getText();
					cellnoParktext.getText();
					 //pr.append(" ").println();
					
						bw.write(nameParktext.getText()+" "+comboBox.getSelectedItem()+" "+comboBox_1.getSelectedItem()
						+" "+modelParktext.getText()+" "+platenoParktext.getText()+" "+placenoParktext.getText()+" "+
						cellnoParktext.getText());
						 // bw.append("\n");
						bw.newLine();
						bw.close();
					}
					catch(Exception arg1){
						System.out.print("Exception");
					}

			}
		});
		Save3button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Save3button.setBounds(728, 334, 91, 23);
		panel_1.add(Save3button);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		tabbedPane.addTab("REGISTRATION HISTORY", null, panel_7, null);
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 60, 1047, 240);
		panel_7.add(scrollPane_2);
		
		JLabel lblNewLabel_28 = new JLabel("REGISTRATION HISTORY");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_28.setBounds(10, 22, 237, 23);
		panel_7.add(lblNewLabel_28);
					
		rhtable = new JTable();
		rhtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "OCCUPATION", "M/S/V NO", "IC NO", "VEHICLE TYPE", "VEHICLE MODEL", "PLATENO", "MOBILENO", "R NO"
			}
		));
		rhtable.getColumnModel().getColumn(0).setPreferredWidth(279);
		rhtable.getColumnModel().getColumn(1).setPreferredWidth(176);
		rhtable.getColumnModel().getColumn(2).setPreferredWidth(95);
		rhtable.getColumnModel().getColumn(3).setPreferredWidth(97);
		rhtable.getColumnModel().getColumn(4).setPreferredWidth(111);
		rhtable.getColumnModel().getColumn(5).setPreferredWidth(114);
		rhtable.getColumnModel().getColumn(6).setPreferredWidth(84);
		rhtable.getColumnModel().getColumn(7).setPreferredWidth(104);
		rhtable.getColumnModel().getColumn(8).setPreferredWidth(90);
		scrollPane_2.setViewportView(rhtable);
		
		JButton Delete2button = new JButton("DELETE");
		Delete2button.setBackground(new Color(255, 99, 71));
		Delete2button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) rhtable.getModel();
				if(rhtable.getSelectedRow()==-1) {
					if(rhtable.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "NO DATA TO DELETE",null,JOptionPane.OK_OPTION);
					}
					else {
						JOptionPane.showMessageDialog(null, "SELECT A ROW TO DELETE", null, JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(rhtable.getSelectedRow());
					}
				}
			});
		Delete2button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Delete2button.setBounds(966, 311, 91, 23);
		panel_7.add(Delete2button);
		
		JButton Printbutton = new JButton("PRINT");
		Printbutton.setBackground(new Color(135, 206, 250));
		Printbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					phtable.print();
				}
				catch(java.awt.print.PrinterException arg) {
					System.err.format("NO PRINTER FOUND", arg.getMessage());
				}
			}
		});
		Printbutton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Printbutton.setBounds(865, 311, 91, 23);
		panel_7.add(Printbutton);
		
		JButton Save2button = new JButton("SAVE");
		Save2button.setBackground(new Color(144, 238, 144));
		Save2button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Save2button," DATA HAS BEEN SAVED to Register.txt");
				Object obj = e.getSource();
				try{
					
				    FileWriter er=new FileWriter("Register.txt",true);
					BufferedWriter bb=new BufferedWriter(er);
					textRName.getText();
					comboBox_R.getSelectedItem();
					textRNo.getText();
					textRIC.getText();
					comboBox_R1.getSelectedItem();
					textRModel.getText();
					textRPlate.getText();
					textRMobile.getText();
					 //pr.append(" ").println();
					
						bb.write(textRName.getText()+" "+comboBox_R.getSelectedItem()+" "+textRNo.getText()
						+" "+textRIC.getText()+" "+comboBox_R1.getSelectedItem()+" "+textRModel.getText()+" "+
						textRPlate.getText()+" "+textRMobile.getText());
						 // bw.append("\n");
						bb.newLine();
						bb.close();
					}
					catch(Exception arg1){
						System.out.print("Exception");
					}

			}
		});
		Save2button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Save2button.setBounds(764, 311, 91, 23);
		panel_7.add(Save2button);
		counter4= counter2-1;
		placenoParktext.setForeground(new Color(0, 0, 255));
		
		JLabel lblNewLabel_13 = new JLabel("(choose from diagram)");
		lblNewLabel_13.setForeground(new Color(255, 0, 0));
		lblNewLabel_13.setBounds(175, 197, 139, 14);
		panel_5.add(lblNewLabel_13);
		
		JLabel lblNewLabel_11 = new JLabel("*MUST FILL IN ALL SLOTS");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setForeground(new Color(220, 20, 60));
		lblNewLabel_11.setBounds(10, 11, 198, 14);
		panel_5.add(lblNewLabel_11);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"}));
		comboBox_2.setBounds(158, 478, 59, 22);
		panel.add(comboBox_2);
		
		JButton ResetParkbutton = new JButton("RESET");
		ResetParkbutton.setBackground(new Color(135, 206, 250));
		ResetParkbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				placenoParktext.setText("");
				if(comboBox_2.getSelectedItem()=="A1") {
					buttonA1.setEnabled(true);
				}
				if(comboBox_2.getSelectedItem()=="A2") {
					buttonA2.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="A3") {
					buttonA3.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="A4") {
					buttonA4.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="A5") {
					buttonA5.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="A6") {
					buttonA6.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="A7") {
					buttonA7.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="A8") {
					buttonA8.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="A9") {
					buttonA9.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="A10") {
					buttonA10.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B1") {
					buttonB1.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B2") {
					buttonB2.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B3") {
					buttonB3.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B4") {
					buttonB4.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B5") {
					buttonB5.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B6") {
					buttonB6.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B7") {
					buttonB7.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B8") {
					buttonB8.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B9") {
					buttonB9.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="B10") {
					buttonB10.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C1") {
					buttonC1.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C2") {
					buttonC2.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C3") {
					buttonC3.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C4") {
					buttonC4.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C5") {
					buttonC5.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C6") {
					buttonC6.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C7") {
					buttonC7.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C8") {
					buttonC8.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C9") {
					buttonC9.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="C10") {
					buttonC10.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D1") {
					buttonD1.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D2") {
					buttonD2.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D3") {
					buttonD3.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D4") {
					buttonD4.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D5") {
					buttonD5.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D6") {
					buttonD6.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D7") {
					buttonD7.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D8") {
					buttonD8.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D9") {
					buttonD9.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="D10") {
					buttonD10.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E1") {
					buttonE1.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E2") {
					buttonE2.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E3") {
					buttonE3.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E4") {
					buttonE4.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E5") {
					buttonE5.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E6") {
					buttonE6.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E7") {
					buttonE7.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E8") {
					buttonE8.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E9") {
					buttonE9.setEnabled(true);
				}
				else if(comboBox_2.getSelectedItem()=="E10") {
					buttonE10.setEnabled(true);
				}
			}
		});
		ResetParkbutton.setBounds(57, 478, 91, 23);
		panel.add(ResetParkbutton);
		
		JLabel lblNewLabel_10 = new JLabel("NOTE: Only use this to reset the button you MISCLICKED.");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(227, 471, 293, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_14 = new JLabel("Do not reset button that has been added to \"PARKING HISTORY\".");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_14.setForeground(Color.RED);
		lblNewLabel_14.setBounds(227, 486, 330, 14);
		panel.add(lblNewLabel_14);
	
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("APPOINT STAFF", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("APPOINT STAFF TO MANAGEMENT STAFF");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_18.setBounds(10, 11, 305, 14);
		panel_3.add(lblNewLabel_18);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 36, 1037, 183);
		panel_3.add(scrollPane_1);
		
		appointable = new JTable();
		appointable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NO", "NAME", "STAFF ID", "IC NUMBER", "CELL NO", "DATE APPOINTED", "DATE END", "STATUS"
			}
		));
		appointable.getColumnModel().getColumn(0).setPreferredWidth(36);
		appointable.getColumnModel().getColumn(1).setPreferredWidth(217);
		appointable.getColumnModel().getColumn(4).setPreferredWidth(106);
		appointable.getColumnModel().getColumn(5).setPreferredWidth(115);
		appointable.getColumnModel().getColumn(6).setPreferredWidth(104);
		appointable.getColumnModel().getColumn(7).setPreferredWidth(143);
		
		scrollPane_1.setViewportView(appointable);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(135, 206, 235), 4, true));
		panel_10.setBackground(new Color(255, 255, 255));
		panel_10.setBounds(20, 235, 510, 284);
		panel_3.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("NAME");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_19.setBounds(10, 42, 46, 21);
		panel_10.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("STAFF ID");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_20.setBounds(10, 74, 73, 21);
		panel_10.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("IC NO");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_21.setBounds(10, 106, 46, 21);
		panel_10.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("CELL NO");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_22.setBounds(10, 138, 60, 21);
		panel_10.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("DATE APPOINTED");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_23.setBounds(10, 185, 115, 21);
		panel_10.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("DATE END");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24.setBounds(52, 217, 67, 21);
		panel_10.add(lblNewLabel_24);
		
		textName = new JTextField();
		textName.setBounds(87, 44, 330, 20);
		panel_10.add(textName);
		textName.setColumns(10);
		
		textStaffID = new JTextField();
		textStaffID.setBounds(87, 76, 128, 20);
		panel_10.add(textStaffID);
		textStaffID.setColumns(10);
		
		textICNo = new JTextField();
		textICNo.setBounds(87, 108, 151, 20);
		panel_10.add(textICNo);
		textICNo.setColumns(10);
		
		textCellNo = new JTextField();
		textCellNo.setBounds(87, 139, 149, 20);
		panel_10.add(textCellNo);
		textCellNo.setColumns(10);
		
		textDateAppoint = new JTextField();
		textDateAppoint.setBounds(155, 187, 106, 20);
		panel_10.add(textDateAppoint);
		textDateAppoint.setColumns(10);
		
		textDateEnd = new JTextField();
		textDateEnd.setBounds(155, 218, 106, 20);
		panel_10.add(textDateEnd);
		textDateEnd.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnNewRadioButton) {
					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					Date date = new Date();
					String b= dateFormat.format(date);
					textDateAppoint.setText(b);
			}
			}
		});
		rdbtnNewRadioButton.setBounds(131, 185, 23, 23);
		panel_10.add(rdbtnNewRadioButton);
		
		JButton Appointbutton = new JButton("APPOINT");
		Appointbutton.setBackground(new Color(144, 238, 144));
		Appointbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) appointable.getModel();
				int no;
				model.addRow(new Object[] {
						counter2,
						textName.getText(),
						textStaffID.getText(),
						textICNo.getText(),
						textCellNo.getText(),
						textDateAppoint.getText(),
						textDateEnd.getText(),
						status="MANAGEMENT STAFF",
						
				});
				counter2=counter2+1;
		
		
				JOptionPane.showMessageDialog(Parkbutton,textName.getText()+" HAS SUCCESSFULLY APPOINTED AS MANAGEMENT STAFF");
				
				if(appointable.getSelectedRow() == -1) {
					if(appointable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(Parkbutton, "INFO HAS BEEN ADDED","SUCCESS", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		Appointbutton.setBounds(380, 250, 91, 23);
		panel_10.add(Appointbutton);
		
		JButton Reset2button = new JButton("RESET");
		Reset2button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textStaffID.setText("");
				textICNo.setText("");
				textCellNo.setText("");
				textDateAppoint.setText("");
				textDateEnd.setText("");

			}
		});
		Reset2button.setBackground(new Color(135, 206, 235));
		Reset2button.setBounds(279, 250, 91, 23);
		panel_10.add(Reset2button);
		
		JLabel lblNewLabel_25 = new JLabel("*MUST FILL IN ALL SLOTS");
		lblNewLabel_25.setForeground(new Color(255, 69, 0));
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_25.setBounds(10, 17, 191, 14);
		panel_10.add(lblNewLabel_25);
		
		JButton Deletebutton = new JButton("DELETE");
		Deletebutton.setBackground(new Color(255, 99, 71));
		Deletebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) appointable.getModel();
				if(appointable.getSelectedRow()==-1) {
					if(appointable.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "NO DATA TO DELETE",null,JOptionPane.OK_OPTION);
					}
					else {
						JOptionPane.showMessageDialog(null, "SELECT A ROW TO DELETE", null, JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(appointable.getSelectedRow());
					}
			}
		});
		Deletebutton.setBounds(966, 230, 91, 23);
		panel_3.add(Deletebutton);
		
		JButton Savebutton = new JButton("SAVE");
		Savebutton.setBackground(new Color(144, 238, 144));
		Savebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Parkbutton," DATA HAS BEEN SAVED to ManagementStaf.txt");
				Object obj = e.getSource();
				try{
					
				    FileWriter pr=new FileWriter("ManagementStaff.txt",true);
					BufferedWriter bw=new BufferedWriter(pr);
					textName.getText();
					textStaffID.getText();
					textICNo.getText();
					textCellNo.getText();
					textDateAppoint.getText();
					textDateEnd.getText();
					 //pr.append(" ").println();
					
						bw.write(textName.getText()+" "+textStaffID.getText()+" "+textICNo.getText()
						+" "+textCellNo.getText()+" "+textDateAppoint.getText()+" "+textDateEnd.getText()+" "+
						cellnoParktext.getText());
						 // bw.append("\n");
						bw.newLine();
						bw.close();
					}
					catch(Exception arg1){
						System.out.print("Exception");
					}
			}
		});
		Savebutton.setBounds(679, 230, 91, 23);
		panel_3.add(Savebutton);
		
		JButton EndAppointbutton = new JButton("END APPOINTMENT");
		EndAppointbutton.setBackground(new Color(255, 99, 71));
		EndAppointbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) appointable.getModel();
				if(appointable.getSelectedRow()==-1) {
					if(appointable.getRowCount()==0) {
						
						JOptionPane.showMessageDialog(null, "NO DATA",null,JOptionPane.OK_OPTION);
					}
					else {
						JOptionPane.showMessageDialog(null, "SELECT A ROW", null, JOptionPane.OK_OPTION);
					}
				}else {
					DefaultTableModel model2 = (DefaultTableModel) appointable.getModel();
					int no;
					model.addRow(new Object[] {
							words="X",
							textName.getText(),
							textStaffID.getText(),
							textICNo.getText(),
							textCellNo.getText(),
							textDateAppoint.getText(),
							textDateEnd.getText(),
							status="STAFF",
					
					});
					JOptionPane.showMessageDialog(EndAppointbutton,textName.getText()+" IS NOW A STAFF");
				}
			}
		});
		EndAppointbutton.setBounds(780, 230, 176, 23);
		panel_3.add(EndAppointbutton);
		
		JButton Logoutbutton = new JButton("LOGOUT");
		Logoutbutton.setBackground(new Color(255, 255, 224));
		Logoutbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingLogin pl= new ParkingLogin();
				ParkingLogin.main(null);
				frameGL.setVisible(false);
			}
		});
		Logoutbutton.setFont(new Font("Tahoma", Font.BOLD, 11));
		Logoutbutton.setBounds(901, 34, 137, 23);
		frameGL.getContentPane().add(Logoutbutton);
			}
	}



	
