package windowBuilderStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import ourCode.Athlete;
import ourCode.ExcelService;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class LoginWindow {

	private JFrame frmSportystuff;
	private JTextField idTextField;
	WindowHandler windowHandler;
	ExcelService se;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginWindow window = new LoginWindow();
//					window.frmSportystuff.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public LoginWindow() throws FileNotFoundException, IOException {
		windowHandler = new WindowHandler();
		initialize();
		this.se = new ExcelService("test.xlsx");
	}

	public void startWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// windowHandler = wh;
					LoginWindow window = new LoginWindow();
					window.frmSportystuff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		// windowHandler = new WindowHandler();
	}

	public void closeWindow() {
		frmSportystuff.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSportystuff = new JFrame();
		frmSportystuff.setTitle("Sporty Stuff");
		frmSportystuff.setBounds(100, 100, 350, 250);
		frmSportystuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSportystuff.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 169, 314, 31);
		frmSportystuff.getContentPane().add(panel_1);

		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Athlete athlete;
				
				try {
					int inputID = Integer.parseInt(idTextField.getText());

					if (inputID >= 1 && inputID <= 40) {
						try {
							athlete = se.getAthlete(inputID);
							DirtyGlobalVariables.stAthlete = athlete;
						} catch (Exception n) {
							JOptionPane.showMessageDialog(null, "No athlete found with that ID. Try again.", "Invalid",
									JOptionPane.ERROR_MESSAGE);
							return;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Number out of range, 1-40", "Invalid",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

				} catch (NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "Login with your unique ID", "Invalid",
							JOptionPane.ERROR_MESSAGE);
					return;

				}
				
				frmSportystuff.setVisible(false);
				windowHandler = new WindowHandler();

				if (se.getGender(athlete.ID) == "man") {
					try {
						
						windowHandler.runDecathlonWindow(athlete.ID);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else {
					try {
						windowHandler.runHeptathlonWindow(athlete.ID);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		loginBtn.setPreferredSize(new Dimension(80, 23));
		panel_1.add(loginBtn);

		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(69);
			}
		});
		cancelBtn.setPreferredSize(new Dimension(80, 23));
		panel_1.add(cancelBtn);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 314, 147);
		frmSportystuff.getContentPane().add(panel);
		panel.setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("31px"), ColumnSpec.decode("100px"), FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("86px"), FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("14px"), RowSpec.decode("31px"),
						RowSpec.decode("20px"), }));

		JLabel lblNewLabel = new JLabel("Enter your unique ID    ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblNewLabel, "2, 2, 3, 1, fill, top");

		JLabel lblNewLabel_1 = new JLabel("Unique ID: ");
		panel.add(lblNewLabel_1, "2, 4, right, center");

		idTextField = new JTextField();
		panel.add(idTextField, "4, 4, 3, 1, left, top");
		idTextField.setColumns(10);

	}
}