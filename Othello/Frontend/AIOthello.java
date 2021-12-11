import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javafx.scene.layout.Border;

import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AIOthello {

	public JFrame frame;
	public JFrame frame1;
	
	//static int arr[];
	public JButton btn_00;
	public JButton btn_01;
	public JButton btn_02;
	public JButton btn_03;
	public JButton btn_04;
	public JButton btn_05;
	public JButton btn_06;
	public JButton btn_07;
	
	public JButton btn_10;
	public JButton btn_11;
	public JButton btn_12;
	public JButton btn_13;
	public JButton btn_14;
	public JButton btn_15;
	public JButton btn_16;
	public JButton btn_17;
	
	public JButton btn_20;
	public JButton btn_21;
	public JButton btn_22;
	public JButton btn_23;
	public JButton btn_24;
	public JButton btn_25;
	public JButton btn_26;
	public JButton btn_27;
	
	
	public JButton btn_30;
	public JButton btn_31;
	public JButton btn_32;
	public JButton btn_33;
	public JButton btn_34;
	public JButton btn_35;
	public JButton btn_36;
	public JButton btn_37;
	
	public JButton btn_40;
	public JButton btn_41;
	public JButton btn_42;
	public JButton btn_43;
	public JButton btn_44;
	public JButton btn_45;
	public JButton btn_46;
	public JButton btn_47;
	
	public JButton btn_50;
	public JButton btn_51;
	public JButton btn_52;
	public JButton btn_53;
	public JButton btn_54;
	public JButton btn_55;
	public JButton btn_56;
	public JButton btn_57;
	
	public JButton btn_60;
	public JButton btn_61;
	public JButton btn_62;
	public JButton btn_63;
	public JButton btn_64;
	public JButton btn_65;
	public JButton btn_66;
	public JButton btn_67;
	
	public JButton btn_70;
	public JButton btn_71;
	public JButton btn_72;
	public JButton btn_73;
	public JButton btn_74;
	public JButton btn_75;
	public JButton btn_76;
	public JButton btn_77;
	public JButton button;
	public static int xInput;
	public static int yInput;
	public static int Pturn;
	JTextField txtField1;
	JTextField txtField2;
	Dimension size1; 
	Dimension size2;
	JLabel lab1;
	JLabel lab2;
	ImageIcon pink;
	ImageIcon blue;
	ImageIcon grey;
	ImageIcon white;
	ImageIcon black;
	JPanel  pan;
	JComboBox jcom;
	/**
	 * Launch the application.
	 */
	public static void Main(AIOthello window)/*public static void main(String args[])*/ {
		//AIOthello window = new AIOthello();
		fun(window);
	}

	static void fun(AIOthello window) {
		window.frame1.setVisible(true);	
	}

	/**
	 * Create the application.
	 */
	public AIOthello() {

		initialize();	
	}


	/**
	 * Initialize the contents of the frame.
	 * 
	 * @return
	 */

	public void initialize() {

		//enableColor();
		//enableKey();
		/*
				First frame displaying game name
				choosing player
		*/
		frame1 = new JFrame();
		pan = new JPanel();
		pan.setLayout(null);
		frame1.setSize(700,500);
		JLabel  l = new JLabel("Welcome to Othello");
		l.setLayout(null);
		l.setFont(new Font("Serif", Font.PLAIN, 44));
		
		l.setBounds(160,30,700,200); 
		String s[] = {"Man to Man", "Man to Computer"};
		
		jcom = new JComboBox(s);
		
		//jcom.setLayout(null);
		jcom.setBounds(250,200,200,30);
		pan.setBounds(0,0,700,700);
				frame1.setResizable(false);
		frame1.getContentPane().add(pan);
		button = new JButton("Start");
		button.setFont(new Font("Serif", Font.PLAIN, 20));
		button.setLayout(null);
		button.setBounds(250,300,200,30);
		frame = new JFrame();
		frame.setVisible(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				Pturn = jcom.getSelectedIndex();
				Pturn = Pturn + 1;
				//JOptionPane.showMessageDialog(frame1, Pturn);
				frame1.setVisible(false);	// disabling first frame
				frame.setVisible(true);	// disabling game board frame
				enableKey();
			
				
			}
		});

		pan.add(button);
		pan.add(l);
		pan.add(jcom);

		frame1.setVisible(true);




		
		
		JPanel panel = new JPanel(new GridLayout(1, 1));
		
		//panel.setLayout(new FlowLayout()); 

		lab1 = new JLabel("White's Score: ");
		lab2 = new JLabel("Black's Score: ");
		txtField1 = new JTextField(); 
		txtField2 = new JTextField();
		txtField1.setEnabled(false);
		txtField2.setEnabled(false);
		panel.setBounds(10, 10, 100, 100);
		size1 = lab1.getPreferredSize();
		size2 = lab2.getPreferredSize();		
		lab1.setBounds(10, 10, size1.width, size1.height);
		lab2.setBounds(10 + size1.width, 10, size2.width, size2.height);
		
		//lab1.setBounds(0,20 , 50, 50);
		//lab2.setBounds(100,20 , 50, 50);
		panel.add(lab1);
		panel.add(txtField1);
		panel.add(lab2);
		panel.add(txtField2);

		JPanel p1 = new JPanel(new GridLayout(8, 8));
		pink = new ImageIcon("pink.png");
		blue = new ImageIcon("blue.png");
		black = new ImageIcon("black.png");
		white = new ImageIcon("white.png");
		btn_00 = new JButton(pink);
		btn_00.setMargin(new Insets(0, 0, 0, 0));
		btn_00.setBackground(Color.green);
		btn_00.setBorder(null);

		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				//btn_00.setIcon(pink);
				xInput = 0;
				yInput = 0;
				enableKey();
				enableColor();
			
			}
		});
		p1.add(btn_00);
		btn_01 = new JButton(pink);
		btn_01.setMargin(new Insets(0, 0, 0, 0));
		btn_01.setBackground(Color.green);
		btn_01.setBorder(null);
		btn_01.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 0;
				yInput = 1;
				enableKey();
				enableColor();
				
			}
		});
		p1.add(btn_01);

		btn_02 = new JButton(pink);
		btn_02.setMargin(new Insets(0, 0, 0, 0));
		btn_02.setBackground(Color.green);
		btn_02.setBorder(null);
		btn_02.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
			
				xInput = 0;
				yInput = 2;
				enableKey();
				enableColor();
			}
		});
		p1.add(btn_02);
		btn_03 = new JButton(pink);
		btn_03.setMargin(new Insets(0, 0, 0, 0));
		btn_03.setBackground(Color.green);
		btn_03.setBorder(null);
		btn_03.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 0;
				yInput = 3;
				enableKey();
				enableColor();
			}
		});
		p1.add(btn_03);
		btn_04 = new JButton(pink);
		btn_04.setMargin(new Insets(0, 0, 0, 0));
		btn_04.setBackground(Color.green);
		btn_04.setBorder(null);
		btn_04.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 0;
				yInput = 4;
				
				enableKey();
				enableColor();
			}
		});
		p1.add(btn_04);
		btn_05 = new JButton(pink);
		btn_05.setMargin(new Insets(0, 0, 0, 0));
		btn_05.setBackground(Color.green);
		btn_05.setBorder(null);
		btn_05.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				xInput = 0;
				yInput = 5;
				enableColor();
				enableKey();
			}
		});
		p1.add(btn_05);
		btn_06 = new JButton(pink);
		btn_06.setMargin(new Insets(0, 0, 0, 0));
		btn_06.setBackground(Color.green);
		btn_06.setBorder(null);
		btn_06.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				xInput = 0;yInput = 6;enableColor();
				enableKey();
			}
		});
		p1.add(btn_06);
		btn_07 = new JButton(pink);
		btn_07.setMargin(new Insets(0, 0, 0, 0));
		btn_07.setBackground(Color.green);
		btn_07.setBorder(null);
		btn_07.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				xInput = 0;yInput = 7;enableColor();
				enableKey();
			}
		});
		p1.add(btn_07);

		btn_10 = new JButton(pink);
		btn_10.setMargin(new Insets(0, 0, 0, 0));
		btn_10.setBackground(Color.green);
		btn_10.setBorder(null);
		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				xInput = 1;yInput = 0;enableColor();
				enableKey();
			}
		});
		p1.add(btn_10);
		btn_11 = new JButton(pink);
		btn_11.setMargin(new Insets(0, 0, 0, 0));
		btn_11.setBackground(Color.green);
		btn_11.setBorder(null);
		btn_11.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				 xInput = 1;xInput = 1;enableColor();
				enableKey();
			}
		});
		p1.add(btn_11);
		btn_12 = new JButton(pink);
		btn_12.setMargin(new Insets(0, 0, 0, 0));
		btn_12.setBackground(Color.green);
		btn_12.setBorder(null);
		btn_12.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 1;yInput = 2;enableColor();
				enableKey();
			}
		});
		p1.add(btn_12);
		btn_13 = new JButton(pink);
		btn_13.setMargin(new Insets(0, 0, 0, 0));
		btn_13.setBackground(Color.green);
		btn_13.setBorder(null);
		btn_13.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 1;yInput = 3;enableColor();
				enableKey();
			}
		});
		p1.add(btn_13);
		btn_14 = new JButton(pink);
		btn_14.setMargin(new Insets(0, 0, 0, 0));
		btn_14.setBackground(Color.green);
		btn_14.setBorder(null);
		btn_14.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 1;yInput = 4;enableColor();
				enableKey();
			}
		});
		p1.add(btn_14);
		btn_15 = new JButton(pink);
		btn_15.setMargin(new Insets(0, 0, 0, 0));
		btn_15.setBackground(Color.green);
		btn_15.setBorder(null);
		btn_15.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 1;yInput = 5;enableColor();
				enableKey();
			}
		});
		p1.add(btn_15);
		btn_16 = new JButton(pink);
		btn_16.setMargin(new Insets(0, 0, 0, 0));
		btn_16.setBackground(Color.green);
		btn_16.setBorder(null);
		btn_16.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 1;yInput = 6;enableColor();
				enableKey();
			}
		});
		p1.add(btn_16);
		btn_17 = new JButton(pink);
		btn_17.setMargin(new Insets(0, 0, 0, 0));
		btn_17.setBackground(Color.green);
		btn_17.setBorder(null);
		btn_17.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 1;yInput = 7;enableColor();
				enableKey();
			}
		});
		p1.add(btn_17);

		btn_20= new JButton(pink);
		btn_20.setMargin(new Insets(0, 0, 0, 0));
		btn_20.setBackground(Color.green);
		btn_20.setBorder(null);
		btn_20.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 2;yInput = 0;enableColor();
				enableKey();
			}
		});
		p1.add(btn_20);
		btn_21= new JButton(pink);
		btn_21.setMargin(new Insets(0, 0, 0, 0));
		btn_21.setBackground(Color.green);
		btn_21.setBorder(null);
		btn_21.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 2;yInput = 1;enableColor();
				enableKey();
			}
		});
		p1.add(btn_21);
		btn_22= new JButton(pink);
		btn_22.setMargin(new Insets(0, 0, 0, 0));
		btn_22.setBackground(Color.green);
		btn_22.setBorder(null);
		btn_22.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 2;yInput = 2;enableColor();
				enableKey();
			}
		});
		p1.add(btn_22);
		btn_23= new JButton(pink);
		btn_23.setMargin(new Insets(0, 0, 0, 0));
		btn_23.setBackground(Color.green);
		btn_23.setBorder(null);
		btn_23.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 2;yInput = 3;enableColor();
				enableKey();
			}
		});
		p1.add(btn_23);
		btn_24= new JButton(pink);
		btn_24.setMargin(new Insets(0, 0, 0, 0));
		btn_24.setBackground(Color.green);
		btn_24.setBorder(null);
		btn_24.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 2;yInput = 4;enableColor();
				enableKey();
			}
		});
		p1.add(btn_24);
		btn_25= new JButton(pink);
		btn_25.setMargin(new Insets(0, 0, 0, 0));
		btn_25.setBackground(Color.green);
		btn_25.setBorder(null);
		btn_25.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 2;yInput = 5;enableColor();
				enableKey();
			}
		});
		p1.add(btn_25);
		btn_26= new JButton(pink);
		btn_26.setMargin(new Insets(0, 0, 0, 0));
		btn_26.setBackground(Color.green);
		btn_26.setBorder(null);
		btn_26.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 2;yInput = 6;enableColor();
				enableKey();
			}
		});
		p1.add(btn_26);
		btn_27= new JButton(pink);
		btn_27.setMargin(new Insets(0, 0, 0, 0));
		btn_27.setBackground(Color.green);
		btn_27.setBorder(null);
		btn_27.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
			 xInput = 2;yInput = 7;enableColor();
				enableKey();
			}
		});
		p1.add(btn_27);

		btn_30= new JButton(pink);
		btn_30.setMargin(new Insets(0, 0, 0, 0));
		btn_30.setBackground(Color.green);
		btn_30.setBorder(null);
		btn_30.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 3;yInput = 0;enableColor();
				enableKey();
			}
		});
		p1.add(btn_30);
		btn_31= new JButton(pink);
		btn_31.setMargin(new Insets(0, 0, 0, 0));
		btn_31.setBackground(Color.green);
		btn_31.setBorder(null);
		
		btn_31.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 3;yInput = 1;enableColor();
				enableKey();
			}
		});
		p1.add(btn_31);
		btn_32= new JButton(pink);
		btn_32.setMargin(new Insets(0, 0, 0, 0));
		btn_32.setBackground(Color.green);
		btn_32.setBorder(null);
		btn_32.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 3;yInput = 2;enableColor();
				enableKey();
			}
		});
		p1.add(btn_32);
		btn_33= new JButton(pink);
		btn_33.setMargin(new Insets(0, 0, 0, 0));
		btn_33.setBackground(Color.green);
		btn_33.setBorder(null);
		
		btn_33.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 3;yInput = 3;enableColor();
				enableKey();
			}
		});
		p1.add(btn_33);
		btn_34= new JButton(pink);
		btn_34.setMargin(new Insets(0, 0, 0, 0));
		btn_34.setBackground(Color.green);
		btn_34.setBorder(null);
	
		btn_34.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 3;yInput = 4;enableColor();
				enableKey();
			}
		});
		p1.add(btn_34);
		btn_35= new JButton(pink);
		btn_35.setMargin(new Insets(0, 0, 0, 0));
		btn_35.setBackground(Color.green);
		btn_35.setBorder(null);
		
		btn_35.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 3;yInput = 5;enableColor();
				enableKey();
			}
		});
		p1.add(btn_35);
		btn_36= new JButton(pink);
		btn_36.setMargin(new Insets(0, 0, 0, 0));
		btn_36.setBackground(Color.green);
		btn_36.setBorder(null);
		
		btn_36.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 3;yInput = 6;enableColor();
				enableKey();
			}
		});
		p1.add(btn_36);
		btn_37= new JButton(pink);
		btn_37.setMargin(new Insets(0, 0, 0, 0));
		btn_37.setBackground(Color.green);
		btn_37.setBorder(null);
		
		btn_37.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 3;yInput = 7;enableColor();
				enableKey();
			}
		});
		p1.add(btn_37);

		btn_40= new JButton(pink);
		btn_40.setMargin(new Insets(0, 0, 0, 0));
		btn_40.setBackground(Color.green);
		btn_40.setBorder(null);
		btn_40.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 4;yInput = 0;enableColor();
				enableKey();
			}
		});
		p1.add(btn_40);
		btn_41= new JButton(pink);
		btn_41.setMargin(new Insets(0, 0, 0, 0));
		btn_41.setBackground(Color.green);
		btn_41.setBorder(null);
		btn_41.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 4;yInput = 1;enableColor();
				enableKey();
			}
		});
		p1.add(btn_41);
		btn_42= new JButton(pink);
		btn_42.setMargin(new Insets(0, 0, 0, 0));
		btn_42.setBackground(Color.green);
		btn_42.setBorder(null);
		btn_42.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 4;yInput = 2;enableColor();
				enableKey();
			}
		});
		p1.add(btn_42);
		btn_43= new JButton(pink);
		btn_43.setMargin(new Insets(0, 0, 0, 0));
		btn_43.setBackground(Color.green);
		btn_43.setBorder(null);
		btn_43.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 4;yInput = 3;enableColor();
				enableKey();
			}
		});
		p1.add(btn_43);
		btn_44= new JButton(pink);
		btn_44.setMargin(new Insets(0, 0, 0, 0));
		btn_44.setBackground(Color.green);
		btn_44.setBorder(null);
		btn_44.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 4;yInput = 4;enableColor();
				enableKey();
			}
		});
		p1.add(btn_44);
		btn_45= new JButton(pink);
		btn_45.setMargin(new Insets(0, 0, 0, 0));
		btn_45.setBackground(Color.green);
		btn_45.setBorder(null);
		btn_45.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 4;yInput = 5;enableColor();
				enableKey();
			}
		});
		p1.add(btn_45);
		btn_46= new JButton(pink);
		btn_46.setMargin(new Insets(0, 0, 0, 0));
		btn_46.setBackground(Color.green);
		btn_46.setBorder(null);
		btn_46.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 4;yInput = 6;enableColor();
				enableKey();
			}
		});
		p1.add(btn_46);
		btn_47= new JButton(pink);
		btn_47.setMargin(new Insets(0, 0, 0, 0));
		btn_47.setBackground(Color.green);
		btn_47.setBorder(null);
		btn_47.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 4;yInput = 7;enableColor();
				enableKey();
			}
		});
		p1.add(btn_47);

		btn_50= new JButton(pink);
		btn_50.setMargin(new Insets(0, 0, 0, 0));
		btn_50.setBackground(Color.green);
		btn_50.setBorder(null);
		btn_50.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 5;yInput = 0;enableColor();
				enableKey();
			}
		});
		p1.add(btn_50);
		btn_51= new JButton(pink);
		btn_51.setMargin(new Insets(0, 0, 0, 0));
		btn_51.setBackground(Color.green);
		btn_51.setBorder(null);
		btn_51.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 5;yInput = 1;enableColor();
				enableKey();
			}
		});
		p1.add(btn_51);
		btn_52= new JButton(pink);
		btn_52.setMargin(new Insets(0, 0, 0, 0));
		btn_52.setBackground(Color.green);
		btn_52.setBorder(null);
		btn_52.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 5;yInput = 2;enableColor();
				enableKey();
			}
		});
		p1.add(btn_52);
		btn_53= new JButton(pink);
		btn_53.setMargin(new Insets(0, 0, 0, 0));
		btn_53.setBackground(Color.green);
		btn_53.setBorder(null);
		btn_53.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 5;yInput = 3;enableColor();
				enableKey();
			}
		});
		p1.add(btn_53);
		btn_54= new JButton(pink);
		btn_54.setMargin(new Insets(0, 0, 0, 0));
		btn_54.setBackground(Color.green);
		btn_54.setBorder(null);
		btn_54.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 5;yInput = 4;enableColor();
				enableKey();
			}
		});
		p1.add(btn_54);
		btn_55= new JButton(pink);
		btn_55.setMargin(new Insets(0, 0, 0, 0));
		btn_55.setBackground(Color.green);
		btn_55.setBorder(null);
		btn_55.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
			 xInput = 5;yInput = 5;enableColor();
				enableKey();
			}
		});
		p1.add(btn_55);
		btn_56= new JButton(pink);
		btn_56.setMargin(new Insets(0, 0, 0, 0));
		btn_56.setBackground(Color.green);
		btn_56.setBorder(null);
		btn_56.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 5;yInput = 6;enableColor();
				enableKey();
			}
		});
		p1.add(btn_56);
		btn_57= new JButton(pink);
		btn_57.setMargin(new Insets(0, 0, 0, 0));
		btn_57.setBackground(Color.green);
		btn_57.setBorder(null);
		btn_57.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 5;yInput = 7;enableColor();
				enableKey();
			}
		});
		p1.add(btn_57);

		btn_60= new JButton(pink);
		btn_60.setMargin(new Insets(0, 0, 0, 0));
		btn_60.setBackground(Color.green);
		btn_60.setBorder(null);
		btn_60.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 6;yInput = 0;enableColor();
				enableKey();
			}
		});
		p1.add(btn_60);
		btn_61= new JButton(pink);
		btn_61.setMargin(new Insets(0, 0, 0, 0));
		btn_61.setBackground(Color.green);
		btn_61.setBorder(null);
		btn_61.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 6;yInput = 1;enableColor();
				enableKey();
			}
		});
		p1.add(btn_61);
		btn_62= new JButton(pink);
		btn_62.setMargin(new Insets(0, 0, 0, 0));
		btn_62.setBackground(Color.green);
		btn_62.setBorder(null);
		btn_62.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 6;yInput = 2;enableColor();
				enableKey();
			}
		});
		p1.add(btn_62);
		btn_63= new JButton(pink);
		btn_63.setMargin(new Insets(0, 0, 0, 0));
		btn_63.setBackground(Color.green);
		btn_63.setBorder(null);
		btn_63.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 6;yInput = 3;enableColor();
				enableKey();
			}
		});
		p1.add(btn_63);
		btn_64= new JButton(pink);
		btn_64.setMargin(new Insets(0, 0, 0, 0));
		btn_64.setBackground(Color.green);
		btn_64.setBorder(null);
		btn_64.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 6;yInput = 4;enableColor();
				enableKey();
			}
		});
		p1.add(btn_64);
		btn_65= new JButton(pink);
		btn_65.setMargin(new Insets(0, 0, 0, 0));
		btn_65.setBackground(Color.green);
		btn_65.setBorder(null);
		btn_65.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 6;yInput = 5;enableColor();
				enableKey();
			}
		});
		p1.add(btn_65);
		btn_66= new JButton(pink);
		btn_66.setMargin(new Insets(0, 0, 0, 0));
		btn_66.setBackground(Color.green);
		btn_66.setBorder(null);
		btn_66.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 6;yInput = 6;enableColor();
				enableKey();
			}
		});
		p1.add(btn_66);
		btn_67= new JButton(pink);
		btn_67.setMargin(new Insets(0, 0, 0, 0));
		btn_67.setBackground(Color.green);
		btn_67.setBorder(null);
		btn_67.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				 xInput = 6;yInput = 7;enableColor();
				enableKey();
			}
		});
		p1.add(btn_67);

		btn_70= new JButton(pink);
		btn_70.setMargin(new Insets(0, 0, 0, 0));
		btn_70.setBackground(Color.green);
		btn_70.setBorder(null);
		btn_70.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 7;yInput = 0;enableColor();
				enableKey();
			}
		});
		p1.add(btn_70);
		btn_71= new JButton(pink);
		btn_71.setMargin(new Insets(0, 0, 0, 0));
		btn_71.setBackground(Color.green);
		btn_71.setBorder(null);
		btn_71.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 7;yInput = 1;enableColor();
				enableKey();
			}
		});
		p1.add(btn_71);
		btn_72= new JButton(pink);
		btn_72.setMargin(new Insets(0, 0, 0, 0));
		btn_72.setBackground(Color.green);
		btn_72.setBorder(null);
		btn_72.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 7;yInput = 2;enableColor();
				enableKey();
			}
		});
		p1.add(btn_72);
		btn_73= new JButton(pink);
		btn_73.setMargin(new Insets(0, 0, 0, 0));
		btn_73.setBackground(Color.green);
		btn_73.setBorder(null);
		btn_73.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 7;yInput = 3;enableColor();
				enableKey();
			}
		});
		p1.add(btn_73);
		btn_74= new JButton(pink);
		btn_74.setMargin(new Insets(0, 0, 0, 0));
		btn_74.setBackground(Color.green);
		btn_74.setBorder(null);
		btn_74.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 7;yInput = 4;enableColor();
				enableKey();
			}
		});
		p1.add(btn_74);
		btn_75= new JButton(pink);
		btn_75.setMargin(new Insets(0, 0, 0, 0));
		btn_75.setBackground(Color.green);
		btn_75.setBorder(null);
		btn_75.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 7;yInput = 5;enableColor();
				enableKey();
			}
		});
		p1.add(btn_75);
		btn_76= new JButton(pink);
		btn_76.setMargin(new Insets(0, 0, 0, 0));
		btn_76.setBackground(Color.green);
		btn_76.setBorder(null);
		btn_76.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 7;yInput = 6;enableColor();
				enableKey();
			}
		});
		p1.add(btn_76);
		btn_77= new JButton(pink);
		btn_77.setMargin(new Insets(0, 0, 0, 0));
		btn_77.setBackground(Color.green);
		btn_77.setBorder(null);
		btn_77.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				xInput = 7;yInput = 7;enableColor();
				enableKey();
			}
		});
		p1.add(btn_77);
		//panel.getContentPane().add(l1, BorderLayout.EAST);
		//panel.getContentPane().add(l1, BorderLayout.EAST);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		frame.getContentPane().add(p1, BorderLayout.SOUTH);
		frame.pack();
	//	frame.setVisible(true);
		

		

	}
	

	public void enableKey() {
		if (Front.gameBoard[0][0] != 2) // Enabling and Disabling Key ---- start
		{
			btn_00.setEnabled(false);
		} else {
			btn_00.setEnabled(true);
		}

		if (Front.gameBoard[0][1] != 2) {
			btn_01.setEnabled(false);
		} else {
			btn_01.setEnabled(true);
		}

		if (Front.gameBoard[0][2] != 2) {
			btn_02.setEnabled(false);
		} else {
			btn_02.setEnabled(true);
		}

		if (Front.gameBoard[0][3] != 2) {
			btn_03.setEnabled(false);
		} else {
			btn_03.setEnabled(true);
		}
		if (Front.gameBoard[0][4] != 2) {
			btn_04.setEnabled(false);
		} else {
			btn_04.setEnabled(true);
		}

		if (Front.gameBoard[0][5] != 2) {
			btn_05.setEnabled(false);
		} else {
			btn_05.setEnabled(true);
		}

		if (Front.gameBoard[0][6] != 2) {
			btn_06.setEnabled(false);
		} else {
			btn_06.setEnabled(true);
		}
		if (Front.gameBoard[0][7] != 2) {
			btn_07.setEnabled(false);
		} else {
			btn_07.setEnabled(true);
		}

		if (Front.gameBoard[1][0] != 2) {
			btn_10.setEnabled(false);
		} else {
			btn_10.setEnabled(true);
		}

		if (Front.gameBoard[1][1] != 2) {
			btn_11.setEnabled(false);
		} else {
			btn_11.setEnabled(true);
		}

		if (Front.gameBoard[1][2] != 2) {
			btn_12.setEnabled(false);
		} else {
			btn_12.setEnabled(true);
		}

		if (Front.gameBoard[1][3] != 2) {
			btn_13.setEnabled(false);
		} else {
			btn_13.setEnabled(true);
		}
		if (Front.gameBoard[1][4] != 2) {
			btn_14.setEnabled(false);
		} else {
			btn_14.setEnabled(true);
		}

		if (Front.gameBoard[1][5] != 2) {
			btn_15.setEnabled(false);
		} else {
			btn_15.setEnabled(true);
		}

		if (Front.gameBoard[1][6] != 2) {
			btn_16.setEnabled(false);
		} else {
			btn_16.setEnabled(true);
		}
		if (Front.gameBoard[1][7] != 2) {
			btn_17.setEnabled(false);
		} else {
			btn_17.setEnabled(true);
		}

		if (Front.gameBoard[2][0] != 2) {
			btn_20.setEnabled(false);
		} else {
			btn_20.setEnabled(true);
		}

		if (Front.gameBoard[2][1] != 2) {
			btn_21.setEnabled(false);
		} else {
			btn_21.setEnabled(true);
		}

		if (Front.gameBoard[2][2] != 2) {
			btn_22.setEnabled(false);
		} else {
			btn_22.setEnabled(true);
		}

		if (Front.gameBoard[2][3] != 2) {
			btn_23.setEnabled(false);
		} else {
			btn_23.setEnabled(true);
		}
		if (Front.gameBoard[2][4] != 2) {
			btn_24.setEnabled(false);
		} else {
			btn_24.setEnabled(true);
		}

		if (Front.gameBoard[2][5] != 2) {
			btn_25.setEnabled(false);
		} else {
			btn_25.setEnabled(true);
		}

		if (Front.gameBoard[2][6] != 2) {
			btn_26.setEnabled(false);
		} else {
			btn_26.setEnabled(true);
		}
		if (Front.gameBoard[2][7] != 2) {
			btn_27.setEnabled(false);
		} else {
			btn_27.setEnabled(true);
		}

		if (Front.gameBoard[3][0] != 2) {
			btn_30.setEnabled(false);
		} else {
			btn_30.setEnabled(true);
		}

		if (Front.gameBoard[3][1] != 2) {
			btn_31.setEnabled(false);
		} else {
			btn_31.setEnabled(true);
		}

		if (Front.gameBoard[3][2] != 2) {
			btn_32.setEnabled(false);
		} else {
			btn_32.setEnabled(true);
		}

		if (Front.gameBoard[3][3] != 2) {
			btn_33.setEnabled(false);
		} else {
			btn_33.setEnabled(true);
		}
		if (Front.gameBoard[3][4] != 2) {
			btn_34.setEnabled(false);
		} else {
			btn_34.setEnabled(true);
		}

		if (Front.gameBoard[3][5] != 2) {
			btn_35.setEnabled(false);
		} else {
			btn_35.setEnabled(true);
		}

		if (Front.gameBoard[3][6] != 2) {
			btn_36.setEnabled(false);
		} else {
			btn_36.setEnabled(true);
		}
		if (Front.gameBoard[3][7] != 2) {
			btn_37.setEnabled(false);
		} else {
			btn_37.setEnabled(true);
		}

		if (Front.gameBoard[4][0] != 2) {
			btn_40.setEnabled(false);
		} else {
			btn_40.setEnabled(true);
		}

		if (Front.gameBoard[4][1] != 2) {
			btn_41.setEnabled(false);
		} else {
			btn_41.setEnabled(true);
		}

		if (Front.gameBoard[4][2] != 2) {
			btn_42.setEnabled(false);
		} else {
			btn_42.setEnabled(true);
		}

		if (Front.gameBoard[4][3] != 2) {
			btn_43.setEnabled(false);
		} else {
			btn_43.setEnabled(true);
		}
		if (Front.gameBoard[4][4] != 2) {
			btn_44.setEnabled(false);
		} else {
			btn_44.setEnabled(true);
		}

		if (Front.gameBoard[4][5] != 2) {
			btn_45.setEnabled(false);
		} else {
			btn_45.setEnabled(true);
		}

		if (Front.gameBoard[4][6] != 2) {
			btn_46.setEnabled(false);
		} else {
			btn_46.setEnabled(true);
		}
		if (Front.gameBoard[4][7] != 2) {
			btn_47.setEnabled(false);
		} else {
			btn_47.setEnabled(true);
		}

		if (Front.gameBoard[5][0] != 2) {
			btn_50.setEnabled(false);
		} else {
			btn_50.setEnabled(true);
		}

		if (Front.gameBoard[5][1] != 2) {
			btn_51.setEnabled(false);
		} else {
			btn_51.setEnabled(true);
		}

		if (Front.gameBoard[5][2] != 2) {
			btn_52.setEnabled(false);
		} else {
			btn_52.setEnabled(true);
		}

		if (Front.gameBoard[5][3] != 2) {
			btn_53.setEnabled(false);
		} else {
			btn_53.setEnabled(true);
		}
		if (Front.gameBoard[5][4] != 2) {
			btn_54.setEnabled(false);
		} else {
			btn_54.setEnabled(true);
		}

		if (Front.gameBoard[5][5] != 2) {
			btn_55.setEnabled(false);
		} else {
			btn_55.setEnabled(true);
		}

		if (Front.gameBoard[5][6] != 2) {
			btn_56.setEnabled(false);
		} else {
			btn_56.setEnabled(true);
		}
		if (Front.gameBoard[5][7] != 2) {
			btn_57.setEnabled(false);
		} else {
			btn_57.setEnabled(true);
		}

		if (Front.gameBoard[6][0] != 2) {
			btn_60.setEnabled(false);
		} else {
			btn_60.setEnabled(true);
		}

		if (Front.gameBoard[6][1] != 2) {
			btn_61.setEnabled(false);
		} else {
			btn_61.setEnabled(true);
		}

		if (Front.gameBoard[6][2] != 2) {
			btn_62.setEnabled(false);
		} else {
			btn_62.setEnabled(true);
		}

		if (Front.gameBoard[6][3] != 2) {
			btn_63.setEnabled(false);
		} else {
			btn_63.setEnabled(true);
		}
		if (Front.gameBoard[6][4] != 2) {
			btn_64.setEnabled(false);
		} else {
			btn_64.setEnabled(true);
		}

		if (Front.gameBoard[6][5] != 2) {
			btn_65.setEnabled(false);
		} else {
			btn_65.setEnabled(true);
		}

		if (Front.gameBoard[6][6] != 2) {
			btn_66.setEnabled(false);
		} else {
			btn_66.setEnabled(true);
		}
		if (Front.gameBoard[6][7] != 2) {
			btn_67.setEnabled(false);
		} else {
			btn_67.setEnabled(true);
		}

		if (Front.gameBoard[7][0] != 2) {
			btn_70.setEnabled(false);
		} else {
			btn_70.setEnabled(true);
		}

		if (Front.gameBoard[7][1] != 2) {
			btn_71.setEnabled(false);
		} else {
			btn_71.setEnabled(true);
		}

		if (Front.gameBoard[7][2] != 2) {
			btn_72.setEnabled(false);
		} else {
			btn_72.setEnabled(true);
		}

		if (Front.gameBoard[7][3] != 2) {
			btn_73.setEnabled(false);
		} else {
			btn_73.setEnabled(true);
		}
		if (Front.gameBoard[7][4] != 2) {
			btn_74.setEnabled(false);
		} else {
			btn_74.setEnabled(true);
		}

		if (Front.gameBoard[7][5] != 2) {
			btn_75.setEnabled(false);
		} else {
			btn_75.setEnabled(true);
		}

		if (Front.gameBoard[7][6] != 2) {
			btn_76.setEnabled(false);
		} else {
			btn_76.setEnabled(true);
		}
		if (Front.gameBoard[7][7] != 2) {
			btn_77.setEnabled(false);
		} else {
			btn_77.setEnabled(true);
		}

	} // Enabling and Disabling Key ---- end

	public void enableColor() // Changing colour of keys ------ start
	{
			if(Front.gameBoard[0][0] == 0)		
			{
			
				btn_00.setBackground(Color.WHITE);
				btn_00.setIcon(black);
			}
			else if(Front.gameBoard[0][0] == 1)
			{
				btn_00.setBackground(Color.BLACK);
				btn_00.setIcon(white);
			}

			if(Front.gameBoard[0][1] == 0)
			{
				btn_01.setBackground(Color.WHITE);
				btn_01.setIcon(black);
			}
			else if(Front.gameBoard[0][1] == 1)
			{
				btn_01.setBackground(Color.BLACK);
				btn_00.setIcon(white);
			}


			if(Front.gameBoard[0][2] == 0)
			{
				btn_02.setBackground(Color.WHITE);
				btn_02.setIcon(black);
			}
			else if(Front.gameBoard[0][2] == 1)
			{
				btn_02.setBackground(Color.BLACK);
				btn_02.setIcon(white);
			}

			if(Front.gameBoard[0][3] == 0)
			{
				btn_03.setBackground(Color.WHITE);
				btn_03.setIcon(black);
			}
			else if(Front.gameBoard[0][3] == 1)
			{
				btn_03.setBackground(Color.BLACK);
				btn_03.setIcon(white);
			}
			if(Front.gameBoard[0][4] == 0)		
			{
				btn_04.setBackground(Color.WHITE);
				btn_04.setIcon(black);
			}
			else if(Front.gameBoard[0][4] == 1)
			{
				btn_04.setBackground(Color.BLACK);
				btn_04.setIcon(white);
			}


			if(Front.gameBoard[0][5] == 0)
			{
				btn_05.setBackground(Color.WHITE);
				btn_05.setIcon(black);
			}
			else if(Front.gameBoard[0][5] == 1)
			{
				btn_05.setBackground(Color.BLACK);
				btn_05.setIcon(white);
			}


			if(Front.gameBoard[0][6] == 0)
			{
				btn_06.setBackground(Color.WHITE);
				btn_06.setIcon(black);
			}
			else if(Front.gameBoard[0][6] == 1)
			{
				btn_06.setBackground(Color.BLACK);
				btn_06.setIcon(white);
			}
			if(Front.gameBoard[0][7] == 0)
			{
				btn_07.setBackground(Color.WHITE);
				btn_07.setIcon(black);
			}
			else if(Front.gameBoard[0][7] == 1)
			{
				btn_07.setBackground(Color.BLACK);
				btn_07.setIcon(white);
			}
			
			
			if(Front.gameBoard[1][0] == 0)		// Enabling Disabling Key start point
			{
				btn_10.setBackground(Color.WHITE);
				btn_10.setIcon(black);
			}
			else if(Front.gameBoard[1][0] == 1)
			{
				btn_10.setBackground(Color.BLACK);
				btn_10.setIcon(white);
			}


			if(Front.gameBoard[1][1] == 0)
			{
				btn_11.setBackground(Color.WHITE);
				btn_11.setIcon(black);
			}
			else if(Front.gameBoard[1][1] == 1)
			{
				btn_11.setBackground(Color.BLACK);
				btn_11.setIcon(white);
			}


			if(Front.gameBoard[1][2] == 0)
			{
				btn_12.setBackground(Color.WHITE);
				btn_12.setIcon(black);
			}
			else if(Front.gameBoard[1][2] == 1)
			{
				btn_12.setBackground(Color.BLACK);
				btn_12.setIcon(white);
			}

			if(Front.gameBoard[1][3] == 0)
			{
				btn_13.setBackground(Color.WHITE);
				btn_13.setIcon(black);
			}
			else if(Front.gameBoard[1][3] == 1)
			{
				btn_13.setBackground(Color.BLACK);
				btn_13.setIcon(white);
			}
			if(Front.gameBoard[1][4] == 0)		
			{
				btn_14.setBackground(Color.WHITE);
				btn_14.setIcon(black);
			}
			else if(Front.gameBoard[1][4] == 1)
			{
				btn_14.setBackground(Color.BLACK);
				btn_14.setIcon(white);
			}


			if(Front.gameBoard[1][5] == 0)
			{
				btn_15.setBackground(Color.WHITE);
				btn_15.setIcon(black);

			}
			else if(Front.gameBoard[1][5] == 1)
			{
				btn_15.setBackground(Color.BLACK);
				btn_15.setIcon(white);
			}


			if(Front.gameBoard[1][6] == 0)
			{
				btn_16.setBackground(Color.WHITE);
				btn_16.setIcon(black);
			}
			else if(Front.gameBoard[1][6] == 1)
			{
				btn_16.setBackground(Color.BLACK);
				btn_16.setIcon(white);
			}
			if(Front.gameBoard[1][7] == 0)
			{
				btn_17.setBackground(Color.WHITE);
				btn_17.setIcon(black);
			}
			else if(Front.gameBoard[1][7] == 1)
			{
				btn_17.setBackground(Color.BLACK);
				btn_17.setIcon(white);
			}
			
			if(Front.gameBoard[2][0] == 0)		
			{
				btn_20.setBackground(Color.WHITE);
				btn_20.setIcon(black);
			}
			else if(Front.gameBoard[2][0] == 1)
			{
				btn_20.setBackground(Color.BLACK);
				btn_20.setIcon(white);
			}


			if(Front.gameBoard[2][1] == 0)
			{
				btn_21.setBackground(Color.WHITE);
				btn_21.setIcon(black);
			}
			else if(Front.gameBoard[2][1] == 1)
			{
				btn_21.setBackground(Color.BLACK);
				btn_21.setIcon(white);
			}


			if(Front.gameBoard[2][2] == 0)
			{
				btn_22.setBackground(Color.WHITE);
				btn_22.setIcon(black);
			}
			else if(Front.gameBoard[2][2] == 1)
			{
				btn_22.setBackground(Color.BLACK);
				btn_22.setIcon(white);
			}

			if(Front.gameBoard[2][3] == 0)
			{
				btn_23.setBackground(Color.WHITE);
				btn_23.setIcon(black);
			}
			else if(Front.gameBoard[2][3] == 1)
			{
				btn_23.setBackground(Color.BLACK);
				btn_23.setIcon(white);
			}
			if(Front.gameBoard[2][4] == 0)		
			{
				btn_24.setBackground(Color.WHITE);
				btn_24.setIcon(black);
			}
			else if(Front.gameBoard[2][4] == 1)
			{
				btn_24.setBackground(Color.BLACK);
				btn_24.setIcon(white);
			}


			if(Front.gameBoard[2][5] == 0)
			{
				btn_25.setBackground(Color.WHITE);
				btn_25.setIcon(black);
			}
			else if(Front.gameBoard[2][5] == 1)
			{
				btn_25.setBackground(Color.BLACK);
				btn_25.setIcon(white);
			}


			if(Front.gameBoard[2][6] == 0)
			{
				btn_26.setBackground(Color.WHITE);
				btn_26.setIcon(black);
			}
			else if(Front.gameBoard[2][6] == 1)
			{
				btn_26.setBackground(Color.BLACK);
				btn_26.setIcon(white);
			}
			if(Front.gameBoard[2][7] == 0)
			{
				btn_27.setBackground(Color.WHITE);
				btn_27.setIcon(black);
			}
			else if(Front.gameBoard[2][7] == 1)
			{
				btn_27.setBackground(Color.BLACK);
				btn_27.setIcon(white);
			}
			
			
			
			
			if(Front.gameBoard[3][0] == 0)		
			{
				btn_30.setBackground(Color.WHITE);
				btn_30.setIcon(black);
			}
			else if(Front.gameBoard[3][0] == 1)
			{
				btn_30.setBackground(Color.BLACK);
				btn_30.setIcon(white);
			}


			if(Front.gameBoard[3][1] == 0)
			{
				btn_31.setBackground(Color.WHITE);
				btn_31.setIcon(black);
			}
			else if(Front.gameBoard[3][1] == 1)
			{
				btn_31.setBackground(Color.BLACK);
				btn_31.setIcon(white);
			}


			if(Front.gameBoard[3][2] == 0)
			{
				btn_32.setBackground(Color.WHITE);
				btn_32.setIcon(black);
			}
			else if(Front.gameBoard[3][2] == 1)
			{
				btn_32.setBackground(Color.BLACK);
				btn_32.setIcon(white);
			}

			if(Front.gameBoard[3][3] == 0)
			{
				//btn_33.setIcon(new ImageIcon("white.png"));
				btn_33.setIcon(black);
				btn_33.setBackground(Color.white);
			}
			else if(Front.gameBoard[3][3] == 1)
			{
				btn_33.setIcon(black);
				btn_33.setBackground(Color.WHITE);
				//btn_33.setIcon(new ImageIcon("white.png"));
				

			}
			if(Front.gameBoard[3][4] == 0)		
			{
				btn_34.setBackground(Color.WHITE);
				btn_34.setIcon(black);
			}
			else if(Front.gameBoard[3][4] == 1)
			{
				btn_34.setBackground(Color.BLACK);
				btn_34.setIcon(white);
			}


			if(Front.gameBoard[3][5] == 0)
			{
				btn_35.setBackground(Color.WHITE);
				btn_35.setIcon(black);
			}
			else if(Front.gameBoard[3][5] == 1)
			{
				btn_35.setBackground(Color.BLACK);
				btn_35.setIcon(white);
			}


			if(Front.gameBoard[3][6] == 0)
			{
				btn_36.setBackground(Color.WHITE);
				btn_36.setIcon(black);
			}
			else if(Front.gameBoard[3][6] == 1)
			{
				btn_36.setBackground(Color.BLACK);
				btn_36.setIcon(white);
			}
			if(Front.gameBoard[3][7] == 0)
			{
				btn_37.setBackground(Color.WHITE);
				btn_37.setIcon(black);
			}
			else if(Front.gameBoard[3][7] == 1)
			{
				btn_37.setBackground(Color.BLACK);
				btn_37.setIcon(white);
			}

			
			
			if(Front.gameBoard[4][0] == 0)
			{
				btn_40.setBackground(Color.WHITE);
				btn_40.setIcon(black);
			}
			else if(Front.gameBoard[4][0] == 1)
			{
				btn_40.setBackground(Color.BLACK);
				btn_40.setIcon(white);
			}


			if(Front.gameBoard[4][1] == 0)
			{
				btn_41.setBackground(Color.WHITE);
				btn_41.setIcon(black);
			}
			else if(Front.gameBoard[4][1] == 1)
			{
				btn_41.setBackground(Color.BLACK);
				btn_41.setIcon(white);
			}


			if(Front.gameBoard[4][2] == 0)
			{
				btn_42.setBackground(Color.WHITE);
				btn_42.setIcon(black);
			}
			else if(Front.gameBoard[4][2] == 1)
			{
				btn_42.setBackground(Color.BLACK);
				btn_42.setIcon(white);
			}

			if(Front.gameBoard[4][3] == 0)
			{
				
				btn_43.setBackground(Color.WHITE);
				btn_43.setIcon(black);
			}
			else if(Front.gameBoard[4][3] == 1)
			{
				btn_43.setBackground(Color.BLACK);
				btn_43.setIcon(white);
			}
			if(Front.gameBoard[4][4] == 0)		
			{
				btn_44.setBackground(Color.WHITE);
				btn_44.setIcon(black);
			}
			else if(Front.gameBoard[4][4] == 1)
			{
				btn_44.setBackground(Color.BLACK);
				btn_44.setIcon(white);
			}


			if(Front.gameBoard[4][5] == 0)
			{
				btn_45.setBackground(Color.WHITE);
				btn_45.setIcon(black);
			}
			else if(Front.gameBoard[4][5] == 1)
			{
				btn_45.setBackground(Color.BLACK);
				btn_45.setIcon(white);
			}


			if(Front.gameBoard[4][6] == 0)
			{
				btn_46.setBackground(Color.WHITE);
				btn_46.setIcon(black);
			}
			else if(Front.gameBoard[4][6] == 1)
			{
				btn_46.setBackground(Color.BLACK);
				btn_46.setIcon(white);
			}
			if(Front.gameBoard[4][7] == 0)
			{
				btn_47.setBackground(Color.WHITE);
				btn_47.setIcon(black);
			}
			else if(Front.gameBoard[4][7] == 1)
			{
				btn_47.setBackground(Color.BLACK);
				btn_47.setIcon(white);
			}
			
			
			
			if(Front.gameBoard[5][0] == 0)		
			{
				btn_50.setBackground(Color.WHITE);
				btn_50.setIcon(black);
			}
			else if(Front.gameBoard[5][0] == 1)
			{
				btn_50.setBackground(Color.BLACK);
				btn_50.setIcon(white);
			}


			if(Front.gameBoard[5][1] == 0)
			{
				btn_51.setBackground(Color.WHITE);
				btn_51.setIcon(black);
			}
			else if(Front.gameBoard[5][1] == 1)
			{
				btn_51.setBackground(Color.BLACK);
				btn_51.setIcon(white);
			}


			if(Front.gameBoard[5][2] == 0)
			{
				btn_52.setBackground(Color.WHITE);
				btn_52.setIcon(black);
			}
			else if(Front.gameBoard[5][2] == 1)
			{
				btn_52.setBackground(Color.BLACK);
				btn_52.setIcon(white);
			}

			if(Front.gameBoard[5][3] == 0)
			{
				btn_53.setBackground(Color.WHITE);
				btn_53.setIcon(black);
			}
			else if(Front.gameBoard[5][3] == 1)
			{
				btn_53.setBackground(Color.BLACK);
				btn_53.setIcon(white);
			}
			if(Front.gameBoard[5][4] == 0)		
			{
				btn_54.setBackground(Color.WHITE);
				btn_54.setIcon(black);
			}
			else if(Front.gameBoard[5][4] == 1)
			{
				btn_54.setBackground(Color.BLACK);
				btn_54.setIcon(white);
			}


			if(Front.gameBoard[5][5] == 0)
			{
				btn_55.setBackground(Color.WHITE);
				btn_55.setIcon(black);
			}
			else if(Front.gameBoard[5][5] == 1)
			{
				btn_55.setBackground(Color.BLACK);
				btn_55.setIcon(white);
			}


			if(Front.gameBoard[5][6] == 0)
			{
				btn_56.setBackground(Color.WHITE);
				btn_56.setIcon(black);
			}
			else if(Front.gameBoard[5][6] == 1)
			{
				btn_56.setBackground(Color.BLACK);
				btn_56.setIcon(white);
			}
			if(Front.gameBoard[5][7] == 0)
			{
				btn_57.setBackground(Color.WHITE);
				btn_57.setIcon(black);
			}
			else if(Front.gameBoard[5][7] == 1)
			{
				btn_57.setBackground(Color.BLACK);
				btn_57.setIcon(white);
			}

			if(Front.gameBoard[6][0] == 0)		
			{
				btn_60.setBackground(Color.WHITE);
				btn_60.setIcon(black);
			}
			else if(Front.gameBoard[6][0] == 1)
			{
				btn_60.setBackground(Color.BLACK);
				btn_60.setIcon(white);
			}


			if(Front.gameBoard[6][1] == 0)
			{
				btn_61.setBackground(Color.WHITE);
				btn_61.setIcon(black);
			}
			else if(Front.gameBoard[6][1] == 1)
			{
				btn_61.setBackground(Color.BLACK);
				btn_61.setIcon(white);
			}


			if(Front.gameBoard[6][2] == 0)
			{
				btn_62.setBackground(Color.WHITE);
				btn_62.setIcon(black);
			}
			else if(Front.gameBoard[6][2] == 1)
			{
				btn_62.setBackground(Color.BLACK);
				btn_62.setIcon(white);
			}

			if(Front.gameBoard[6][3] == 0)
			{
				btn_63.setBackground(Color.WHITE);
				btn_63.setIcon(black);
			}
			else if(Front.gameBoard[6][3] == 1)
			{
				btn_63.setBackground(Color.BLACK);
				btn_63.setIcon(white);
			}
			if(Front.gameBoard[6][4] == 0)		
			{
				btn_64.setBackground(Color.WHITE);
				btn_64.setIcon(black);
			}
			else if(Front.gameBoard[6][4] == 1)
			{
				btn_64.setBackground(Color.BLACK);
				btn_64.setIcon(white);
			}


			if(Front.gameBoard[6][5] == 0)
			{
				btn_65.setBackground(Color.WHITE);
				btn_65.setIcon(black);
			}
			else if(Front.gameBoard[6][5] == 1)
			{
				btn_65.setBackground(Color.BLACK);
				btn_65.setIcon(white);
			}


			if(Front.gameBoard[6][6] == 0)
			{
				btn_66.setBackground(Color.WHITE);
				btn_66.setIcon(black);
			}
			else if(Front.gameBoard[6][6] == 1)
			{
				btn_66.setBackground(Color.BLACK);
				btn_66.setIcon(white);
			}
			if(Front.gameBoard[6][7] == 0)
			{
				btn_67.setBackground(Color.WHITE);
				btn_67.setIcon(black);
			}
			else if(Front.gameBoard[6][7] == 1)
			{
				btn_67.setBackground(Color.BLACK);
				btn_67.setIcon(white);
			}


			if(Front.gameBoard[7][0] == 0)		
			{
				btn_70.setBackground(Color.WHITE);
				btn_70.setIcon(black);
			}
			else if(Front.gameBoard[7][0] == 1)
			{
				btn_70.setBackground(Color.BLACK);
				btn_70.setIcon(white);
			}


			if(Front.gameBoard[7][1] == 0)
			{
				btn_71.setBackground(Color.WHITE);
				btn_71.setIcon(black);
			}
			else if(Front.gameBoard[7][1] == 1)
			{
				btn_71.setBackground(Color.BLACK);
				btn_71.setIcon(white);
			}


			if(Front.gameBoard[7][2] == 0)
			{
				btn_72.setBackground(Color.WHITE);
				btn_72.setIcon(black);
			}
			else if(Front.gameBoard[7][2] == 1)
			{
				btn_72.setBackground(Color.BLACK);
				btn_72.setIcon(white);
			}

			if(Front.gameBoard[7][3] == 0)
			{
				btn_73.setBackground(Color.WHITE);
				
				btn_73.setIcon(black);
			}
			else if(Front.gameBoard[7][3] == 1)
			{
				btn_73.setBackground(Color.BLACK);
				btn_73.setIcon(white);
			}
			if(Front.gameBoard[7][4] == 0)		
			{
				btn_74.setBackground(Color.WHITE);
				btn_74.setIcon(black);
			}
			else if(Front.gameBoard[7][4] == 1)
			{
				btn_74.setBackground(Color.BLACK);
				btn_74.setIcon(white);
			}


			if(Front.gameBoard[7][5] == 0)
			{
				btn_75.setBackground(Color.WHITE);
				btn_75.setIcon(black);
			}
			else if(Front.gameBoard[7][5] == 1)
			{
				btn_75.setBackground(Color.BLACK);
				btn_75.setIcon(white);
			}


			if(Front.gameBoard[7][6] == 0)
			{
				btn_76.setBackground(Color.WHITE);
				btn_76.setIcon(black);
			}
			else if(Front.gameBoard[7][6] == 1)
			{
				btn_76.setBackground(Color.BLACK);
				btn_76.setIcon(white);
			}
			if(Front.gameBoard[7][7] == 0)
			{
				btn_77.setBackground(Color.WHITE);
				btn_77.setIcon(black);
			}
			else if(Front.gameBoard[7][7] == 1)
			{
				btn_77.setBackground(Color.BLACK);
				btn_77.setIcon(white);
			}
	}					// Changing colour of keys ------ end
}
