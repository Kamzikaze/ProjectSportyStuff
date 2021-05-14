package windowBuilderStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
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

	WindowHandler windowHandler;

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
	 */
	public HeptathlonResultWindow() {
		windowHandler = new WindowHandler();
		initialize();
	}

	public void startWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// windowHandler = wh;
					HeptathlonResultWindow window = new HeptathlonResultWindow();
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

		JLabel infoLbl = new JLabel("info goes here");
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

		onehundredMHurdlesTextField = new JTextField();
		onehundredMHurdlesTextField.setText("0.0");
		panel_1.add(onehundredMHurdlesTextField, "4, 6, left, top");
		onehundredMHurdlesTextField.setColumns(10);

		JLabel onehundredMHurdlesResultLbl = new JLabel("Result");
		panel_1.add(onehundredMHurdlesResultLbl, "8, 6");

		JLabel highJumpLbl = new JLabel("High jump");
		panel_1.add(highJumpLbl, "2, 8, right, center");

		highJumpTextField = new JTextField();
		highJumpTextField.setText("0.0");
		panel_1.add(highJumpTextField, "4, 8, left, top");
		highJumpTextField.setColumns(10);

		JLabel highJumpResultLbl = new JLabel("Result");
		panel_1.add(highJumpResultLbl, "8, 8");

		JLabel shotPutLbl = new JLabel("Shot put");
		panel_1.add(shotPutLbl, "2, 10, right, center");

		shotPutTextField = new JTextField();
		shotPutTextField.setText("0.0");
		panel_1.add(shotPutTextField, "4, 10, left, top");
		shotPutTextField.setColumns(10);

		JLabel shotPutResultLbl = new JLabel("Result");
		panel_1.add(shotPutResultLbl, "8, 10");

		JLabel twohundredMLbl = new JLabel("200 metres");
		panel_1.add(twohundredMLbl, "2, 12, right, center");

		twohundredMTextField = new JTextField();
		twohundredMTextField.setText("0.0");
		panel_1.add(twohundredMTextField, "4, 12, left, top");
		twohundredMTextField.setColumns(10);

		JLabel twohundredMResultLbl = new JLabel("Result");
		panel_1.add(twohundredMResultLbl, "8, 12");

		JLabel day2Lbl = new JLabel("Day 2");
		panel_1.add(day2Lbl, "2, 14, fill, top");

		JLabel longJumpLbl = new JLabel("Long jump");
		panel_1.add(longJumpLbl, "2, 16, right, center");

		longJumpTextField = new JTextField();
		longJumpTextField.setText("0.0");
		panel_1.add(longJumpTextField, "4, 16, left, top");
		longJumpTextField.setColumns(10);

		JLabel longJumpResultLbl = new JLabel("Result");
		panel_1.add(longJumpResultLbl, "8, 16");

		JLabel javelinThrowLbl = new JLabel("Javelin throw");
		panel_1.add(javelinThrowLbl, "2, 18, right, center");

		javelinThrowTextField = new JTextField();
		javelinThrowTextField.setText("0.0");
		panel_1.add(javelinThrowTextField, "4, 18, left, top");
		javelinThrowTextField.setColumns(10);

		JLabel javelinThrowResultLbl = new JLabel("Result");
		panel_1.add(javelinThrowResultLbl, "8, 18");

		JLabel eighthundredMLbl = new JLabel("800 metres");
		panel_1.add(eighthundredMLbl, "2, 20, right, center");

		eighthundredMTextField = new JTextField();
		eighthundredMTextField.setText("0.0");
		panel_1.add(eighthundredMTextField, "4, 20, left, top");
		eighthundredMTextField.setColumns(10);

		JLabel eighthundredMResultLbl = new JLabel("Result");
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

		JLabel totalResultLbl = new JLabel("totalResult");
		panel_4.add(totalResultLbl);
		

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
