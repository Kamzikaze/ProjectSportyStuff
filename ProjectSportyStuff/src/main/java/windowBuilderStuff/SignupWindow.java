package windowBuilderStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import ourCode.Man;
import ourCode.Woman;
import windowBuilderStuff.DirtyGlobalVariables.Status;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignupWindow {

	private JFrame frmSportyStuff;
	public JTextField firstNameTextField;
	public JTextField lastNameTextField;
	public JButton nextBtn;
	public JButton CancelBtn;
	static WindowHandler wh = new WindowHandler();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupWindow window = new SignupWindow();
					window.frmSportyStuff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignupWindow() {
		initialize();
	}
	
	
	public void startWindow() 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupWindow window = new SignupWindow();
					window.frmSportyStuff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
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
		frmSportyStuff.setBounds(100, 100, 450, 190);
		frmSportyStuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSportyStuff.getContentPane().setLayout(null);
		
		JPanel choicePanel = new JPanel();
		choicePanel.setBounds(10, 11, 414, 35);
		frmSportyStuff.getContentPane().add(choicePanel);
		choicePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("What event do you want to register for?");
		choicePanel.add(lblNewLabel);
		
		final JRadioButton decathlonRadioBtn = new JRadioButton("Decathlon");
		choicePanel.add(decathlonRadioBtn);
		
		final JRadioButton heptathlonRadioBtn = new JRadioButton("Heptathlon");
		choicePanel.add(heptathlonRadioBtn);
		
		JPanel namePanel = new JPanel();
		namePanel.setBounds(10, 57, 414, 35);
		frmSportyStuff.getContentPane().add(namePanel);
		namePanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First name: ");
		lblNewLabel_1.setBounds(10, 8, 70, 14);
		namePanel.add(lblNewLabel_1);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setBounds(90, 5, 110, 20);
		firstNameTextField.setMaximumSize(new Dimension(100, 100));
		namePanel.add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last name: ");
		lblNewLabel_2.setBounds(210, 8, 74, 14);
		namePanel.add(lblNewLabel_2);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setBounds(294, 5, 110, 20);
		lastNameTextField.setMaximumSize(new Dimension(100, 100));
		namePanel.add(lastNameTextField);
		lastNameTextField.setColumns(10);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(10, 103, 414, 35);
		frmSportyStuff.getContentPane().add(btnPanel);
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		nextBtn = new JButton("Next");
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirtyGlobalVariables.currStatus = Status.SIGNUPnext;
				DirtyGlobalVariables.currID++;
				if(decathlonRadioBtn.isSelected())
				{
					wh.addAthlete(new Man(firstNameTextField.getText(), lastNameTextField.getText(), DirtyGlobalVariables.currID));
				}
				
				if(heptathlonRadioBtn.isSelected())
				{
					wh.addAthlete(new Woman(firstNameTextField.getText(), lastNameTextField.getText(), DirtyGlobalVariables.currID));
				}
				
				wh.runEnterResultWindow();
			}
		});
		nextBtn.setPreferredSize(new Dimension(90, 23));
		btnPanel.add(nextBtn);
		
		CancelBtn = new JButton("Cancel");
		CancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirtyGlobalVariables.currStatus = Status.SIGNUPcancel;
				wh.printParticipants();
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
