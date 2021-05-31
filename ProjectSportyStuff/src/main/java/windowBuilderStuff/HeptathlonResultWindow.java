package windowBuilderStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import ourCode.Calculation;
import ourCode.ExcelService;
import ourCode.Man;
import ourCode.Woman;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class HeptathlonResultWindow {

	public JFrame frmSportyStuff;
	private JTextField onehundredMHurdlesTextField;
	private JTextField highJumpTextField;
	private JTextField shotPutTextField;
	private JTextField twohundredMTextField;
	private JTextField longJumpTextField;
	private JTextField javelinThrowTextField;
	private JTextField eighthundredMTextField;
	private Woman athlete;

	ExcelService se;
	WindowHandler windowHandler;
	//ExcelService se;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HeptathlonResultWindow window = new HeptathlonResultWindow();
//					window.frmSportyStuff.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public HeptathlonResultWindow(int athleteId) throws Exception {
		windowHandler = new WindowHandler();
		
		this.se = new ExcelService("test.xlsx");
		this.athlete = (Woman) se.getAthlete(athleteId);
		
		initialize();
		try {
			this.se = new ExcelService("test.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void startWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// windowHandler = wh;
					HeptathlonResultWindow window = new HeptathlonResultWindow(athlete.ID);
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
		frmSportyStuff.setBounds(100, 100, 450, 535);
		frmSportyStuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSportyStuff.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 30);
		frmSportyStuff.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel infoLbl = new JLabel(DirtyGlobalVariables.stAthlete.ID + " - "+ 
				DirtyGlobalVariables.stAthlete.firstName + " " + 
				DirtyGlobalVariables.stAthlete.lastName);//("info goes here");
		panel.add(infoLbl);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 52, 414, 350);
		frmSportyStuff.getContentPane().add(panel_1);
		panel_1.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("92px"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("86px"), FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("15px"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("14px"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("20px"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"),
						RowSpec.decode("31px"), RowSpec.decode("14px"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("20px"), FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20px"), }));

		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("149px"),
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("86px"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(30dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(77dlu;default)"),},
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
				RowSpec.decode("31px"),
				RowSpec.decode("14px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),}));
		
		JLabel eventLbl = new JLabel("Event");
		eventLbl.setHorizontalAlignment(SwingConstants.CENTER);
		eventLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(eventLbl, "2, 2, fill, top");

		JLabel resultTitleLbl = new JLabel("Result");
		resultTitleLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(resultTitleLbl, "8, 2");

		JLabel day1Lbl = new JLabel("Day 1");
		panel_1.add(day1Lbl, "2, 4, fill, top");

		JLabel onehundredMHurdlesLbl = new JLabel("100 metres hurdles");
		panel_1.add(onehundredMHurdlesLbl, "2, 6, right, center");

		panel_1.add(onehundredMHurdlesLbl, "2, 6, left, center");
		
		onehundredMHurdlesTextField = new JTextField();
//<<<<<<< HEAD
//		
//		if (athlete.getOnehundredMHurdles() != 0.0) {
//			onehundredMHurdlesTextField.setText(String.valueOf(athlete.getOnehundredMHurdles()));
//		} else {
//			onehundredMHurdlesTextField.setText("0.0");
//		}
//		
//=======
		onehundredMHurdlesTextField.setText("16.2");
		panel_1.add(onehundredMHurdlesTextField, "4, 6, left, top");
		onehundredMHurdlesTextField.setColumns(10);

		final JLabel onehundredMHurdlesResultLbl = new JLabel("Result");
		panel_1.add(onehundredMHurdlesResultLbl, "8, 6");

		JLabel highJumpLbl = new JLabel("High jump");
		panel_1.add(highJumpLbl, "2, 8, right, center");

		panel_1.add(highJumpLbl, "2, 8, left, center");
		
		highJumpTextField = new JTextField();
//<<<<<<< HEAD
//		
//		if (athlete.getHighJump() != 0.0) {
//			highJumpTextField.setText(String.valueOf(athlete.getHighJump()));
//		} else {
//			highJumpTextField.setText("0.0");
//		}
//		
//=======
		highJumpTextField.setText("213.4");
		panel_1.add(highJumpTextField, "4, 8, left, top");
		highJumpTextField.setColumns(10);

		final JLabel highJumpResultLbl = new JLabel("Result");
		panel_1.add(highJumpResultLbl, "8, 8");

		JLabel shotPutLbl = new JLabel("Shot put");
		panel_1.add(shotPutLbl, "2, 10, right, center");

		panel_1.add(shotPutLbl, "2, 10, left, center");
		
		shotPutTextField = new JTextField();
//<<<<<<< HEAD
//		
//		if (athlete.getShotPut() != 0.0) {
//			shotPutTextField.setText(String.valueOf(athlete.getShotPut()));
//		} else {
//			shotPutTextField.setText("0.0");
//		}
//		
//=======
		shotPutTextField.setText("17");
		panel_1.add(shotPutTextField, "4, 10, left, top");
		shotPutTextField.setColumns(10);

		final JLabel shotPutResultLbl = new JLabel("Result");
		panel_1.add(shotPutResultLbl, "8, 10");

		JLabel twohundredMLbl = new JLabel("200 metres");
		panel_1.add(twohundredMLbl, "2, 12, right, center");

		panel_1.add(twohundredMLbl, "2, 12, left, center");
		
		twohundredMTextField = new JTextField();
//<<<<<<< HEAD
//		
//		if (athlete.getTwohundredM() != 0.0) {
//			twohundredMTextField.setText(String.valueOf(athlete.getTwohundredM()));
//		} else {
//			twohundredMTextField.setText("0.0");
//		}
//		
//=======
		twohundredMTextField.setText("28.6");
		panel_1.add(twohundredMTextField, "4, 12, left, top");
		twohundredMTextField.setColumns(10);

		final JLabel twohundredMResultLbl = new JLabel("Result");
		panel_1.add(twohundredMResultLbl, "8, 12");

		JLabel day2Lbl = new JLabel("Day 2");
		panel_1.add(day2Lbl, "2, 14, fill, top");

		JLabel longJumpLbl = new JLabel("Long jump");
		panel_1.add(longJumpLbl, "2, 16, right, center");

		panel_1.add(longJumpLbl, "2, 16, left, center");
		
		longJumpTextField = new JTextField();
//<<<<<<< HEAD
//		
//		if (athlete.getLongJump() != 0.0) {
//			longJumpTextField.setText(String.valueOf(athlete.getLongJump()));
//		} else {
//			longJumpTextField.setText("0.0");
//		}
//		
//=======
		longJumpTextField.setText("673");
		panel_1.add(longJumpTextField, "4, 16, left, top");
		longJumpTextField.setColumns(10);

		final JLabel longJumpResultLbl = new JLabel("Result");
		panel_1.add(longJumpResultLbl, "8, 16");

		JLabel javelinThrowLbl = new JLabel("Javelin throw");
		panel_1.add(javelinThrowLbl, "2, 18, right, center");

		panel_1.add(javelinThrowLbl, "2, 18, left, center");
		
		javelinThrowTextField = new JTextField();
//<<<<<<< HEAD
//		
//		if (athlete.getJavelinThrow() != 0.0) {
//			javelinThrowTextField.setText(String.valueOf(athlete.getJavelinThrow()));
//		} else {
//			javelinThrowTextField.setText("0.0");
//		}
//		
//=======
		javelinThrowTextField.setText("62");
		panel_1.add(javelinThrowTextField, "4, 18, left, top");
		javelinThrowTextField.setColumns(10);

		final JLabel javelinThrowResultLbl = new JLabel("Result");
		panel_1.add(javelinThrowResultLbl, "8, 18");

		JLabel eighthundredMLbl = new JLabel("800 metres");
		panel_1.add(eighthundredMLbl, "2, 20, right, center");

		panel_1.add(eighthundredMLbl, "2, 20, left, center");
		
		eighthundredMTextField = new JTextField();
//<<<<<<< HEAD
//		
//		if (athlete.getEighthundredM() != 0.0) {
//			eighthundredMTextField.setText(String.valueOf(athlete.getEighthundredM()));
//		} else {
//			eighthundredMTextField.setText("0.0");
//		}
//		
//=======
		eighthundredMTextField.setText("112.7");
		panel_1.add(eighthundredMTextField, "4, 20, left, top");
		eighthundredMTextField.setColumns(10);

		final JLabel eighthundredMResultLbl = new JLabel("Result");
		panel_1.add(eighthundredMResultLbl, "8, 20");

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(222, 448, 202, 36);
		frmSportyStuff.getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 448, 202, 36);
		frmSportyStuff.getContentPane().add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		final JLabel saveConfirmLbl = new JLabel("saveConfirm");
		panel_3.add(saveConfirmLbl);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(222, 413, 202, 24);
		frmSportyStuff.getContentPane().add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		final JLabel totalResultLbl = new JLabel("totalResult");
		panel_4.add(totalResultLbl);
		

		JButton saveBtn = new JButton("Save");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Woman woman = new Woman();
				Calculation calc = new Calculation();
				if(checkNumbers()) {
					// save it all to excel file here
					

						// save it all to excel file here
					woman.ID = DirtyGlobalVariables.stAthlete.ID;
					woman.firstName = DirtyGlobalVariables.stAthlete.firstName;
					woman.lastName = DirtyGlobalVariables.stAthlete.lastName;
						
						double dub = 0;
						
						dub = Double.parseDouble(twohundredMTextField.getText());
						
						if(dub > 21) {
							woman.setTwohundredM(calc.CalculateHeptathlonResult(Double.parseDouble
								(twohundredMTextField.getText()), "200m"));
							twohundredMResultLbl.setText(String.valueOf(woman.getTwohundredM()));
						}
						dub = Double.parseDouble(eighthundredMTextField.getText());
						
						if(dub > 100) {
							woman.setEighthundredM(calc.CalculateHeptathlonResult(Double.parseDouble
								(eighthundredMTextField.getText()), "800m"));
							eighthundredMResultLbl.setText(String.valueOf(woman.getEighthundredM()));
						}
						dub = Double.parseDouble(onehundredMHurdlesTextField.getText());
						
						if(dub > 12) {
							woman.setOnehundredMHurdles(calc.CalculateHeptathlonResult(Double.parseDouble
								(onehundredMHurdlesTextField.getText()), "100m hurdles"));
							onehundredMHurdlesResultLbl.setText(String.valueOf(woman.getOnehundredMHurdles()));
						}
						dub = Double.parseDouble(highJumpTextField.getText());
						
						if(dub < 245) {
							woman.setHighJump(calc.CalculateHeptathlonResult(Double.parseDouble
								(highJumpTextField.getText()), "high jump"));
							highJumpResultLbl.setText(String.valueOf(woman.getHighJump()));
						}
						dub = Double.parseDouble(longJumpTextField.getText());
						
						if(dub < 895) {
							woman.setLongJump(calc.CalculateHeptathlonResult(Double.parseDouble
								(longJumpTextField.getText()), "long jump"));
							longJumpResultLbl.setText(String.valueOf(woman.getLongJump()));
						}
						dub = Double.parseDouble(shotPutTextField.getText());
						
						if(dub < 22) {
							woman.setShotPut(calc.CalculateHeptathlonResult(Double.parseDouble
								(shotPutTextField.getText()), "shot put"));
							shotPutResultLbl.setText(String.valueOf(woman.getShotPut()));
						}
						dub = Double.parseDouble(javelinThrowTextField.getText());
						
						if(dub < 95) {
							woman.setJavelinThrow(calc.CalculateHeptathlonResult(Double.parseDouble
								(javelinThrowTextField.getText()), "javelin throw"));
							javelinThrowResultLbl.setText(String.valueOf(woman.getJavelinThrow()));
						}
						
						totalResultLbl.setText("Total points: " + String.valueOf(woman.getTotalResult()));
						saveConfirmLbl.setText("Saved to excel file");
						se.updateWomanResults(woman);
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
				windowHandler.runLoginSignupWindow();
				frmSportyStuff.setVisible(false);
				//System.exit(69);
			}
		});
		exitBtn.setPreferredSize(new Dimension(85, 23));
		panel_2.add(exitBtn);


	}

	
	boolean checkNumbers()
	{
		boolean areTheyAllOkay = false;
		int i = 0;
		
		if(DirtyGlobalVariables.isThisANumber(onehundredMHurdlesTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(highJumpTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(shotPutTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(twohundredMTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(longJumpTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(javelinThrowTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}
		if(DirtyGlobalVariables.isThisANumber(eighthundredMTextField.getText()))
		{
			areTheyAllOkay = true;
			i++;
		}

		if(i != 7)
			areTheyAllOkay = false;
		
		return areTheyAllOkay;
			
	}
	
}