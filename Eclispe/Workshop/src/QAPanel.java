import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QAPanel extends JPanel {

	public QAPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Any Question?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 47));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.CENTER);
		
		JButton btnThaks = new JButton("Thanks");
		btnThaks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblNewLabel.setText("Thank You All!");
				lblNewLabel.setForeground(Color.GREEN);
			}
		});
		btnThaks.setForeground(Color.GREEN);
		btnThaks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		add(btnThaks, BorderLayout.SOUTH);

	}

}
