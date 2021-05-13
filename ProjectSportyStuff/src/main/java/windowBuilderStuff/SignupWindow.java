package windowBuilderStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

import javax.naming.directory.AttributeModificationException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import ourCode.Athlete;
import ourCode.Man;
import ourCode.Woman;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class SignupWindow {

	private JFrame frmSportyStuff;
	public JTextField firstNameTextField;
	public JTextField lastNameTextField;
	public JButton nextBtn;
	public JButton CancelBtn;
	WindowHandler windowHandler;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignupWindow window = new SignupWindow(windowHandler);
//					window.frmSportyStuff.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public SignupWindow() {
		windowHandler = new WindowHandler();
		initialize();
		
	}
	
	
	public void startWindow() 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//windowHandler = wh;
					SignupWindow window = new SignupWindow();
					window.frmSportyStuff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//windowHandler = new WindowHandler();
	}
	
	public void closeWindow() {
		frmSportyStuff.setVisible(false);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSportyStuff = new JFrame();
		frmSportyStuff.setTitle("Sporty Stuff");
		frmSportyStuff.setBounds(100, 100, 543, 195);
		frmSportyStuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSportyStuff.getContentPane().setLayout(null);
		
		JPanel choicePanel = new JPanel();
		choicePanel.setBounds(10, 11, 495, 35);
		frmSportyStuff.getContentPane().add(choicePanel);
		choicePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("What event do you want to register for?");
		choicePanel.add(lblNewLabel);
		
		final JRadioButton decathlonRadioBtn = new JRadioButton("Decathlon");
		choicePanel.add(decathlonRadioBtn);
		
		final JRadioButton heptathlonRadioBtn = new JRadioButton("Heptathlon");
		choicePanel.add(heptathlonRadioBtn);
		
		JPanel namePanel = new JPanel();
		namePanel.setBounds(10, 57, 495, 35);
		frmSportyStuff.getContentPane().add(namePanel);
		namePanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("First name: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		namePanel.add(lblNewLabel_1);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setMaximumSize(new Dimension(100, 100));
		namePanel.add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last name: ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		namePanel.add(lblNewLabel_2);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setMaximumSize(new Dimension(100, 100));
		namePanel.add(lastNameTextField);
		lastNameTextField.setColumns(10);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(10, 103, 495, 35);
		frmSportyStuff.getContentPane().add(btnPanel);
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		nextBtn = new JButton("Next");
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowHandler = new WindowHandler();
				windowHandler.initialize();
				
				Athlete athlete = new Athlete();

				if(decathlonRadioBtn.isSelected())
				{
					athlete = new Man(firstNameTextField.getText(), lastNameTextField.getText(), windowHandler.currID);
					//windowHandler.addAthlete(new Man(firstNameTextField.getText(), lastNameTextField.getText(), windowHandler.currID));
					System.out.println("added man...");
				}
				
				if(heptathlonRadioBtn.isSelected())
				{
					athlete = new Woman(firstNameTextField.getText(), lastNameTextField.getText(), windowHandler.currID);
					//windowHandler.addAthlete(new Woman(firstNameTextField.getText(), lastNameTextField.getText(), windowHandler.currID));
					System.out.println("added woman...");
				}
				windowHandler.addAthlete(athlete);
				frmSportyStuff.setVisible(false);
				windowHandler.runUserAddedWindow();
			}
		});
		nextBtn.setPreferredSize(new Dimension(90, 23));
		btnPanel.add(nextBtn);
		
		CancelBtn = new JButton("Cancel");
		CancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//windowHandler.printParticipants();
				System.exit(69);
			}
		});
		CancelBtn.setPreferredSize(new Dimension(90, 23));
		btnPanel.add(CancelBtn);
		
		ButtonGroup group = new ButtonGroup();
		group.add(decathlonRadioBtn);
		group.add(heptathlonRadioBtn);
	}
}
