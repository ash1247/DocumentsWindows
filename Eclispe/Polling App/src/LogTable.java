import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class LogTable extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static UserDataManipulations dat = new UserDataManipulations();
	
	public static String date()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd");
	    LocalDateTime now = LocalDateTime.now();
	    return dtf.format(now);
	}

	public LogTable()
    {
        Vector<Object> columnNames = new Vector<Object>();
        Vector<Object> data = new Vector<Object>();

        try
        {
            //  Connect to an Access Database

            String driver = "com.mysql.jdbc.Driver";
            String url =
            		"jdbc:mysql://localhost:3306/voting_log?autoReconnect=true&useSSL=false";
            String userid = "root";
            String password = "root98";

            Class.forName( driver );
            Connection connection = DriverManager.getConnection( url, userid, password );

            //  Read data from a table

            String sql = "SELECT * "
					+ "FROM voting_log;";
            
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
   
            //  Get column names

            for (int i = 1; i <= columns; i++)
            {
                columnNames.addElement( md.getColumnName(i) );
            }

            //  Get row data

            while (rs.next() )
            {
                Vector<Object> row = new Vector<Object>(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.addElement( rs.getObject(i) );
                }

                data.addElement( row );
            }

            rs.close();
            stmt.close();
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println( e );
        }

        //  Create table with database data

        DefaultTableModel model = new DefaultTableModel(data, columnNames)
        {
        	/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@SuppressWarnings({ "unchecked", "rawtypes" })
			@Override
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
        
        JButton btnDelete = new JButton("Delete");
        
        getContentPane().add( btnDelete, BorderLayout.PAGE_END );
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
		JTable table = new JTable( model );
        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );

        btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		        int row = table.getSelectedRow();

		        if(row == -1)
		        {
		        	JOptionPane.showMessageDialog(LogTable.this, "Please select a row first.", null, JOptionPane.WARNING_MESSAGE);
		        }
		        else
		        {
		            String tableClick = (table.getModel().getValueAt(row, 0).toString());
		            dat.deleteDataVoters( tableClick );
		        }
				
				LogTable table = new LogTable();
				table.setVisible( true );
				table.setBounds(200, 200, 800, 600);
				dispose();
			}
		});
        
        JPanel buttonPanel = new JPanel();
        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
    }

    public static void main(String[] args)
    {
        LogTable frame = new LogTable();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack(); 
        frame.setBounds(200, 200, 800, 600);
        frame.setVisible(true);
    }

}