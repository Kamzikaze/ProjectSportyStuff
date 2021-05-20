package windowBuilderStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import ourCode.Athlete;
import ourCode.ExcelService;
import ourCode.Man;
import ourCode.Woman;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class UserAddedWindow {

	private JFrame frmSportyStuff;

	WindowHandler windowHandler;
	Athlete lastAthlete;
	ExcelService se;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UserAddedWindow window = new UserAddedWindow();
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
	public UserAddedWindow() {
		windowHandler = new WindowHandler();
		initialize();

	}

	public void startWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					UserAddedWindow window = new UserAddedWindow();
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
		frmSportyStuff.setBounds(100, 100, 350, 250);
		frmSportyStuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSportyStuff.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 314, 143);
		frmSportyStuff.getContentPane().add(panel);
		panel.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, }));

		
		try {
			se = new ExcelService("test.xlsx");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JLabel newUserAddedLbl = new JLabel("New user registered!");
		newUserAddedLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(newUserAddedLbl, "2, 2");

		JLabel yourInfoLbl = new JLabel("Your information: ");
		panel.add(yourInfoLbl, "2, 4");

		lastAthlete = se.getRecentAthlete();
		DirtyGlobalVariables.stAthlete = lastAthlete;

		JLabel firstNameLbl = new JLabel(lastAthlete.firstName);
		panel.add(firstNameLbl, "4, 4");

		JLabel lastNameLbl = new JLabel(lastAthlete.lastName);
		panel.add(lastNameLbl, "4, 6");

		JLabel uniqueIdLbl = new JLabel(String.valueOf(lastAthlete.ID));
		panel.add(uniqueIdLbl, "4, 8");

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 165, 314, 35);
		frmSportyStuff.getContentPane().add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton registerResultBtn = new JButton("Register results");
		registerResultBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowHandler = new WindowHandler();
				frmSportyStuff.setVisible(false);

				
				
				if(se.getRecentAthlete().getClass() == Woman.class) {
					windowHandler.runHeptathlonWindow();
				}
				if(se.getRecentAthlete().getClass() == Man.class) {
					windowHandler.runDecathlonWindow();
				}
				
			}
		});
		registerResultBtn.setPreferredSize(new Dimension(125, 23));
		panel_1.add(registerResultBtn);

		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(69);
			}
		});
		exitBtn.setPreferredSize(new Dimension(125, 23));
		panel_1.add(exitBtn);
	}
}
