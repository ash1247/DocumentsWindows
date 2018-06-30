import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;

public class EmployeePanel extends JPanel {
	private JTextField textFieldID;
	private JTextField textFieldName;
	private DefaultTableModel empTableModel;
	
	private EmpFileOperations empFileOperations;
	
	private ArrayList<Employee> allEmployees = new ArrayList<>();
	private JTable table;
	

	/**
	 * Create the panel.
	 */
	public EmployeePanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitle = new JPanel();
		add(panelTitle, BorderLayout.NORTH);
		
		JLabel lblOperations = new JLabel("Operations");
		lblOperations.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelTitle.add(lblOperations);
		
		JPanel panelButton = new JPanel();
		add(panelButton, BorderLayout.SOUTH);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ID = textFieldID.getText().toString();
				String name = textFieldName.getText().toString();
				
				textFieldID.setText("");
				textFieldName.setText("");
				
				saveEmployeeData(ID, name);
				
			}
		});
		panelButton.add(btnSave);
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table.getSelectedRow();
				allEmployees.remove(index);
				loadTable();
				writeEmpFile();
			}
		});
		panelButton.add(btnDelete);
		
		JPanel panelContet = new JPanel();
		add(panelContet, BorderLayout.CENTER);
		panelContet.setLayout(new GridLayout(1, 2, 10, 0));
		
		JPanel panelLeft = new JPanel();
		panelContet.add(panelLeft);
		panelLeft.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee ID");
		lblEmployeeName.setBounds(20, 0, 120, 27);
		panelLeft.add(lblEmployeeName);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(20, 31, 200, 33);
		textFieldID.setToolTipText("Employee ID");
		panelLeft.add(textFieldID);
		textFieldID.setColumns(10);
		
		JLabel lblEmployeeId = new JLabel("Employee Name");
		lblEmployeeId.setBounds(20, 69, 128, 27);
		panelLeft.add(lblEmployeeId);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(20, 107, 200, 33);
		textFieldName.setToolTipText("Employee Name");
		panelLeft.add(textFieldName);
		textFieldName.setColumns(10);
		
		JPanel panelRight = new JPanel();
		panelContet.add(panelRight);
		panelRight.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panelRight.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		/*table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int i = table.getSelectedRow();
				
			}
		});*/
		scrollPane.setViewportView(table);
		
		empFileOperations = new EmpFileOperations("files/employees.txt");
		//empFileOperations.openFormatter();
		allEmployees = empFileOperations.getEmployees();
		loadTable();
	}
	
	
	private void loadTable() {
		
		String heading[] = {"ID", "Name"};
		
		empTableModel = new DefaultTableModel(heading, 0);
		
		for (Employee employee : allEmployees) {
			
			Object[] empData = {employee.getID(), employee.getName()};
			empTableModel.addRow(empData);
			
		}
		
		table.setModel(empTableModel);
	}

	
	private void writeEmpFile(){
		empFileOperations.writeEmployees(allEmployees);
				
	}
	
	private void saveEmployeeData(String ID, String name)
	{
		
		Employee employee = new Employee(ID, name);
		allEmployees.add(employee);
		empFileOperations.addEmployee(employee);
		loadTable();
	}
}
