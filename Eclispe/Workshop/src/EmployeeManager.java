import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class EmployeeManager {

	private JFrame frmEmployeeManager;
	static EmployeePanel employeePanel = new EmployeePanel();
	static QAPanel QAPanel = new QAPanel();
	
	CardLayout appLayout;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManager window = new EmployeeManager();
					window.frmEmployeeManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeManager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmEmployeeManager = new JFrame();
		frmEmployeeManager.setTitle("Employee Manager");
		frmEmployeeManager.setBounds(100, 100, 800, 500);
		//frmEmployeeManager.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEmployeeManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeeManager.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		JMenuBar menuBar = new JMenuBar();
		frmEmployeeManager.setJMenuBar(menuBar);
		
		JMenu mnOperation = new JMenu("Operation");
		mnOperation.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				appLayout = (CardLayout) frmEmployeeManager.getContentPane().getLayout();
				appLayout.show(frmEmployeeManager.getContentPane(), "EmpPanel");
				
			}
		});
		menuBar.add(mnOperation);
		
		JMenu mnQA = new JMenu("Q&A");
		mnQA.addMouseListener(new MouseAdapter() {
	
			@Override
			public void mouseClicked(MouseEvent e) {
				
				appLayout = (CardLayout) frmEmployeeManager.getContentPane().getLayout();
				appLayout.show(frmEmployeeManager.getContentPane(), "QAPanel");
				
			}
		});
		menuBar.add(mnQA);
		
		frmEmployeeManager.getContentPane().add(employeePanel, "EmpPanel");		
		frmEmployeeManager.getContentPane().add(QAPanel, "QAPanel");
		
	}
	
}
