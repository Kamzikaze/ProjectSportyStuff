package windowBuilderStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import ourCode.ExcelService;
import ourCode.Man;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class DecathlonResultWindow {

	private JFrame frmSportyStuff;
	private JTextField onehundredMTextField;
	private JTextField longJumpTextField;
	private JTextField shotPutTextField;
	private JTextField highJumpTextField;
	private JTextField fourhundredMTextField;
	private JTextField onehundredtenMHurdlesTextField;
	private JTextField discusThrowTextField;
	private JTextField poleVaultTextField;
	private JTextField javelinThrowTextField;
	private JTextField thousandfivehundredMTextField;

	private Man athlete;

	WindowHandler windowHandler;
	ExcelService se;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DecathlonResultWindow window = new DecathlonResultWindow();
//					window.frmSportyStuff.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * 
	 * @param wh
	 * @throws Exception 
	 */
	public DecathlonResultWindow(int athleteId) throws Exception {
		windowHandler = new WindowHandler();
		
		this.se = new ExcelService("test.xlsx");
		this.athlete = (Man) se.getAthlete(athleteId);
		
		initialize();
	}

	public void startWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// windowHandler = wh;
					DecathlonResultWindow window = new DecathlonResultWindow(athlete.ID);
					window.frmSportyStuff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		// windowHandler = new WindowHandler();
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
		frmSportyStuff.setBounds(100, 100, 450, 600);
		frmSportyStuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSportyStuff.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 30);
		frmSportyStuff.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel infoLbl = new JLabel("info goes here");
		panel.add(infoLbl);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 53, 414, 334);
		frmSportyStuff.getContentPane().add(panel_1);
		panel_1.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("92px"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("86px"), FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("15px"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("14px"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("20px"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"), RowSpec.decode("31px"),
						RowSpec.decode("14px"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("20px"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"), }));

		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("right:149px"),
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("86px"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(30dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(77dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("15px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("14px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				RowSpec.decode("31px"),
				RowSpec.decode("14px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),}));

		JLabel eventTitleLbl = new JLabel("Event");
		eventTitleLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		eventTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(eventTitleLbl, "2, 2, fill, top");

		JLabel resultTitleLbl = new JLabel("Result   ");
		resultTitleLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(resultTitleLbl, "8, 2");

		JLabel day1Lbl = new JLabel("Day 1");
		panel_1.add(day1Lbl, "2, 4, fill, top");

		JLabel onehundredMLbl = new JLabel("100 metres");
		panel_1.add(onehundredMLbl, "2, 6, right, center");

		panel_1.add(onehundredMLbl, "2, 6, left, center");
		
		onehundredMTextField = new JTextField();
		
		if (athlete.getOnehundredM() != 0.0) {
			onehundredMTextField.setText(String.valueOf(athlete.getOnehundredM()));
		} else {
			onehundredMTextField.setText("0.0");
		}
		
		panel_1.add(onehundredMTextField, "4, 6, left, top");
		onehundredMTextField.setColumns(10);

		JLabel onehundredMResultLbl = new JLabel("Result");
		panel_1.add(onehundredMResultLbl, "8, 6");

		panel_1.add(onehundredMResultLbl, "8, 6, 3, 1");
		
		JLabel longJumpLbl = new JLabel("Long jump");

		panel_1.add(longJumpLbl, "2, 8, right, center");

		panel_1.add(longJumpLbl, "2, 8, left, center");

		longJumpTextField = new JTextField();

		if (athlete.getLongJump() != 0.0) {
			longJumpTextField.setText(String.valueOf(athlete.getLongJump()));
		} else {
			longJumpTextField.setText("0.0");
		}
		
		panel_1.add(longJumpTextField, "4, 8, left, top");
		longJumpTextField.setColumns(10);

		JLabel longJumpResultLbl = new JLabel("Result");
		panel_1.add(longJumpResultLbl, "8, 8");

		JLabel shotPutLbl = new JLabel("Shot put ");

		panel_1.add(shotPutLbl, "2, 10, right, center");


		panel_1.add(shotPutLbl, "2, 10, left, center");
		
		shotPutTextField = new JTextField();
		
		if (athlete.getShotPut() != 0.0) {
			shotPutTextField.setText(String.valueOf(athlete.getShotPut()));
		} else {
			shotPutTextField.setText("0.0");
		}
		
		panel_1.add(shotPutTextField, "4, 10, left, top");
		shotPutTextField.setColumns(10);

		JLabel shotPutResultLbl = new JLabel("Result");
		panel_1.add(shotPutResultLbl, "8, 10");

		JLabel highJumpLbl = new JLabel("High jump");
		panel_1.add(highJumpLbl, "2, 12, right, center");

		panel_1.add(highJumpLbl, "2, 12, left, center");
		
		highJumpTextField = new JTextField();
		
		if (athlete.getHighJump() != 0.0) {
			highJumpTextField.setText(String.valueOf(athlete.getHighJump()));
		} else {
			highJumpTextField.setText("0.0");
		}
		
		panel_1.add(highJumpTextField, "4, 12, left, top");
		highJumpTextField.setColumns(10);

		JLabel highJumpResultLbl = new JLabel("Result");
		panel_1.add(highJumpResultLbl, "8, 12");

		JLabel fourhundredMLbl = new JLabel("400 metres");

		panel_1.add(fourhundredMLbl, "2, 14, right, center");

		panel_1.add(fourhundredMLbl, "2, 14, left, center");
		
		fourhundredMTextField = new JTextField();
		
		if (athlete.getFourhundredM() != 0.0) {
			fourhundredMTextField.setText(String.valueOf(athlete.getFourhundredM()));
		} else {
			fourhundredMTextField.setText("0.0");
		}
		
		panel_1.add(fourhundredMTextField, "4, 14, left, top");
		fourhundredMTextField.setColumns(10);

		JLabel fourhundredMResultLbl = new JLabel("Result");
		panel_1.add(fourhundredMResultLbl, "8, 14");

		JLabel day2Lbl = new JLabel("Day 2");
		panel_1.add(day2Lbl, "2, 16, fill, top");

		JLabel onehundredtenMHurdlesLbl = new JLabel("110 metres hurdles");
		panel_1.add(onehundredtenMHurdlesLbl, "2, 18, right, center");

		panel_1.add(onehundredtenMHurdlesLbl, "2, 18, left, center");
		
		onehundredtenMHurdlesTextField = new JTextField();
		
		if (athlete.getFourhundredM() != 0.0) {
			onehundredtenMHurdlesTextField.setText(String.valueOf(athlete.getOnehundredtenMHurdles()));
		} else {
			onehundredtenMHurdlesTextField.setText("0.0");
		}
		
		panel_1.add(onehundredtenMHurdlesTextField, "4, 18, left, top");
		onehundredtenMHurdlesTextField.setColumns(10);

		JLabel onehundredtenMHurdlesResultLbl = new JLabel("Result");
		panel_1.add(onehundredtenMHurdlesResultLbl, "8, 18");

		JLabel discusThrowLbl = new JLabel("Discus throw");
		panel_1.add(discusThrowLbl, "2, 20, right, center");

		panel_1.add(discusThrowLbl, "2, 20, left, center");
		
		discusThrowTextField = new JTextField();
		
		if (athlete.getDiscusThrow() != 0.0) {
			discusThrowTextField.setText(String.valueOf(athlete.getDiscusThrow()));
		} else {
			discusThrowTextField.setText("0.0");
		}
		
		panel_1.add(discusThrowTextField, "4, 20, left, top");
		discusThrowTextField.setColumns(10);

		JLabel discusThrowResultLbl = new JLabel("Result");
		panel_1.add(discusThrowResultLbl, "8, 20");

		JLabel poleVaultLbl = new JLabel("Pole vault");
		panel_1.add(poleVaultLbl, "2, 22, right, center");

		panel_1.add(poleVaultLbl, "2, 22, left, center");
		
		poleVaultTextField = new JTextField();

		if (athlete.getPoleVault() != 0.0) {
			poleVaultTextField.setText(String.valueOf(athlete.getPoleVault()));
		} else {
			poleVaultTextField.setText("0.0");
		}
		
		panel_1.add(poleVaultTextField, "4, 22, left, top");
		poleVaultTextField.setColumns(10);

		JLabel poleVaultResultLbl = new JLabel("Result");
		panel_1.add(poleVaultResultLbl, "8, 22");

		JLabel javelinThrowLbl = new JLabel("Javelin throw");
		panel_1.add(javelinThrowLbl, "2, 24, right, center");

		panel_1.add(javelinThrowLbl, "2, 24, left, center");
		
		javelinThrowTextField = new JTextField();
		
		if (athlete.getJavelinThrow() != 0.0) {
			javelinThrowTextField.setText(String.valueOf(athlete.getJavelinThrow()));
		} else {
			javelinThrowTextField.setText("0.0");
		}
		
		panel_1.add(javelinThrowTextField, "4, 24, left, top");
		javelinThrowTextField.setColumns(10);

		JLabel javelinThrowResultLbl = new JLabel("Result");
		panel_1.add(javelinThrowResultLbl, "8, 24");

		JLabel thousandfivehundredMLbl = new JLabel("1500 metres");
		panel_1.add(thousandfivehundredMLbl, "2, 26, right, center");

		panel_1.add(thousandfivehundredMLbl, "2, 26, left, center");
		
		thousandfivehundredMTextField = new JTextField();
		
		if (athlete.getOnethousandfivehundredM() != 0.0) {
			thousandfivehundredMTextField.setText(String.valueOf(athlete.getOnethousandfivehundredM()));
		} else {
			thousandfivehundredMTextField.setText("0.0");
		}
		
		panel_1.add(thousandfivehundredMTextField, "4, 26, left, top");
		thousandfivehundredMTextField.setColumns(10);

		JLabel thousandfivehundredMResultLbl = new JLabel("Result");
		panel_1.add(thousandfivehundredMResultLbl, "8, 26");

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(220, 513, 204, 37);
		frmSportyStuff.getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 513, 204, 37);
		frmSportyStuff.getContentPane().add(panel_3);

		final JLabel saveConfirmLbl = new JLabel("saveConfirm");
		panel_3.add(saveConfirmLbl);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(220, 472, 204, 30);
		frmSportyStuff.getContentPane().add(panel_5);

		JLabel totalResultLbl = new JLabel("totalResult");
		panel_5.add(totalResultLbl);
		

		JButton saveBtn = new JButton("Save");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkNumbers()) {
					// save it all to excel file here
					
					saveConfirmLbl.setText("Saved to excel file");
				}
				else {
					saveConfirmLbl.setText("Error, check text fields");
				}
				
				
			}
		});
		saveBtn.setPreferredSize(new Dimension(85, 23));
		panel_2.add(saveBtn);

		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(69);
			}
		});
		exitBtn.setPreferredSize(new Dimension(85, 23));
		panel_2.add(exitBtn);


	}
	
	
	boolean checkNumbers()
	{
		boolean areTheyAllOkay = false;
		int i = 0;
		
		if(DirtyGlobalVariables.isThisANumber(onehundredMTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(longJumpTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(shotPutTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(highJumpTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(fourhundredMTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(onehundredtenMHurdlesTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(discusThrowTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(poleVaultTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(javelinThrowTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(thousandfivehundredMTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(i != 10)
			areTheyAllOkay = false;
		
		return areTheyAllOkay;
			
	}
}
