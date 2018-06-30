import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class InfoWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoWindow frame = new InfoWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InfoWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 459, 538);
		setTitle("How to use");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton goBackButton = new JButton("<- Go Back");
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		goBackButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		TextArea scrollBar = new TextArea();
		scrollBar.setText("This is a very simple application to use.\n\n"
				+ "When you start the application it will ask you for a password."
				+ "\n\nYou can put any password you like without any spaces."
				+ "\n\nYou need to remember the password because you will need it to stop the \nvoting process."
				+ "\n\nIt has two modes. Poll Mode and Election Mode."
				+ "\nIn poll mode voters are anonymous, anyone can vote, and as many times as\n they want."
				+ "\nAnd in election mode only registered voters can vote."
				+ "\nAdmin can add the voters from 'add voter' button after logged in \nsuccessfully choosing election mode."
				+ "\n\nAfter successfully logged in into the application, you can add the topic on\n"
				+ "the topic area and you will able to choose how many options you want "
				+ "\nfor the voting proccess."
				+ "\nCurrently maximum 5 options can made for the process."
				+ "\n\nThen in the next window you will able to write the options"
				+ "\n\nIn that window there will be 'make it public!' button,\n"
				+ "You can click on that button to make the voting process public"
				+ "\n and start the voting proccess."
				+ "\n\nTo stop the voting process, there is a 'Stop Voting!' Button."
				+ "\nClick on it and it will ask for the password."
				+ "\nIn the textfield type in the password that you \nentered in the first window."
				+ "\nIf the password matches the voting process will \nstop otherwise it can't be stopped."
				+ "\n\nIn the result window you will be able to see the bar chart and pie chart of the"
				+ "\nvoting process along with percentage and total voters."
				+ "\nIt will also save the results in a 'results.txt' file");
		
		scrollBar.setEditable(false);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(147)
							.addComponent(goBackButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(goBackButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
