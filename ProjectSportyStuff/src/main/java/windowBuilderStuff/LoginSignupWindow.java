package windowBuilderStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSignupWindow {

	static WindowHandler wh = new WindowHandler();
	
	public JFrame frmSportyStuff;
	public JButton signupBtn;
	public JButton loginBtn;
	

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSignupWindow window = new LoginSignupWindow();
					window.frmSportyStuff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void startWindow()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSignupWindow window = new LoginSignupWindow();
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
	 * Create the application.
	 */
	public LoginSignupWindow() {
		//wh = new WindowHandler();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmSportyStuff = new JFrame();
		frmSportyStuff.setTitle("Sporty Stuff");
		frmSportyStuff.setResizable(false);
		frmSportyStuff.setBounds(100, 100, 240, 109);
		frmSportyStuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSportyStuff.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 214, 33);
		frmSportyStuff.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		loginBtn = new JButton("Log in");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed login from lsw class");
				wh.runEnterResultWindow();
			}
		});
		panel.add(loginBtn);
		
		signupBtn = new JButton("Sign Up");
		signupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed sign up from lsw class");
				frmSportyStuff.setVisible(false);
				wh.runSignupWindow();
			}
		});
		panel.add(signupBtn);
		
		JLabel loginLbl = new JLabel("Welcome to Sporty Stuff!");
		loginLbl.setHorizontalAlignment(SwingConstants.CENTER);
		loginLbl.setBounds(10, 11, 214, 14);
		frmSportyStuff.getContentPane().add(loginLbl);
	}
}
