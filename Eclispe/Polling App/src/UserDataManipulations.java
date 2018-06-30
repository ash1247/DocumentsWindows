import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;

public class UserDataManipulations {
	
	final static String DB_URL = "jdbc:mysql://localhost?autoReconnect=true&useSSL=false";
	final static String PATH = "jdbc:mysql://localhost:3306/voting_" + date() + "?autoReconnect=true&useSSL=false";
	final static String PATHLOG = "jdbc:mysql://localhost:3306/voting_log?autoReconnect=true&useSSL=false"; 
	final static String USERNAME = "root";
	final static String PASSWORD = "root98";
	final static String NAME = "voting_" + date();
	final static String LOG = "voting_log";
	
	
	static Connection con = null;
	static Statement stmt = null;
	
	public static String date()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd");
	    LocalDateTime now = LocalDateTime.now();
	    return dtf.format(now);
	}
	public static String dateAndTime()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH");
	    LocalDateTime now = LocalDateTime.now();
	    return dtf.format(now); 
	}
	
	public static int checkDataBase() throws SQLException
	{
		int x = 0;
		
		con = DriverManager.getConnection( DB_URL, USERNAME, PASSWORD);
		
		ResultSet resultSet = con.getMetaData().getCatalogs();

		while (resultSet.next()) {
		  String databaseName = resultSet.getString(1);
		  if( NAME.equals( databaseName ) )
		  {
			  x = 1;
		  }
		}
		resultSet.close();
		con.close();
		return x;

	}
	
	public static int checkDataBaseLog() throws SQLException
	{
		int x = 0;
		
		con = DriverManager.getConnection( DB_URL, USERNAME, PASSWORD);
		
		ResultSet resultSet = con.getMetaData().getCatalogs();

		while (resultSet.next()) {
		  String databaseName = resultSet.getString(1);
		  if( LOG.equals( databaseName ) )
		  {
			  x = 1;
		  }
		}
		resultSet.close();
		con.close();
		return x;

	}
	
	public void createLogDataBase()
	{
		try
		{
			int x = checkDataBaseLog();
			
			if( x == 1 )
			{
				
			}
			if( x == 0)
			{
				con = DriverManager.getConnection( DB_URL, USERNAME, PASSWORD);
			
				stmt = con.createStatement();
			
				stmt.executeUpdate( "CREATE DATABASE voting_log;");
			
				con.close();
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	/*public static int createLogDataBaseCheckTable()
	{
		String s = "1";
		int i = 1;
		try
		{
			HashSet<String> hs = new HashSet<String>();
			
			ResultSet rs;
			
			String sqlTables = "SHOW TABLES;";
			
			String sql = "CREATE TABLE log_count" 
					+ " (num INT NOT NULL );";
			
			String sqlCheck = "SELECT MAX(num) AS max FROM log_count";
			
			con = DriverManager.getConnection( PATHLOG, USERNAME, PASSWORD);
		
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sqlTables);
			while( rs.next() )
			{
				hs.add( rs.getString(1) );
			}
			
			if( !hs.contains( "log_count") )
			{
				stmt.executeUpdate( sql );
			}
			
			String insert = "INSERT INTO log_count VALUES(" + i + ");";
			
			stmt.executeUpdate(insert);
			
			rs = stmt.executeQuery( sqlCheck );
			
			while( rs.next() )
			{
				s = rs.getString(1);
				i = Integer.parseInt(s);
			}
			
			String insert2 = "INSERT INTO log_count VALUES(" + (i + 1) + ");";
			
			stmt.executeUpdate(insert2);
			
			con.close();
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return i;
	}*/
	
	public void createLogDataBaseTable()
	{
		try
		{
			HashSet<String> hs = new HashSet<String>();
			
			ResultSet rs;
			
			String sqlTables = "SHOW TABLES;";
		
			String sql = "CREATE TABLE voting_log" 
					+ " (Date DATE NOT NULL,"
					+ "Voting_Mode VARCHAR(15) NULL,"
					+ "Topic VARCHAR(225) NULL,"
					+ "Option_Won VARCHAR(225) NULL,"
					+ "Got_Votes INT NULL,"
					+ "Got_Percentage DECIMAL(5,2) NULL );";
		
			
			con = DriverManager.getConnection( PATHLOG, USERNAME, PASSWORD);
		
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sqlTables);
			
			while( rs.next() )
			{
				hs.add( rs.getString(1) );
			}
			
			if( !hs.contains( "voting_log") )
			{
				stmt.executeUpdate( sql );
			}
				
			con = DriverManager.getConnection( PATHLOG, USERNAME, PASSWORD);
		
			stmt = con.createStatement();
			
			con.close();
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	
	
	public void createDataBase()
	{
		try
		{
			int x = checkDataBase();
			
			if( x == 1 )
			{
				removeDataBase();
				con = DriverManager.getConnection( DB_URL, USERNAME, PASSWORD);
				
				stmt = con.createStatement();
			
				stmt.executeUpdate( "CREATE DATABASE voting_" + date() + ";");
				
				con.close();
			}
			if( x == 0)
			{
				con = DriverManager.getConnection( DB_URL, USERNAME, PASSWORD);
			
				stmt = con.createStatement();
			
				stmt.executeUpdate( "CREATE DATABASE voting_" + date() + ";");
			
				con.close();
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public static void removeDataBase()
	{		
		try
		{
			con = DriverManager.getConnection( DB_URL, USERNAME, PASSWORD);
	
			stmt = con.createStatement();
			
			stmt.executeUpdate( "DROP DATABASE voting_" + date() + ";");
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public void createTables()
	{
		try
		{
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( "CREATE TABLE adm "
					+ "(id INT NOT NULL, pass VARCHAR(100) NULL,"
					+ "PRIMARY KEY (id));" );

			stmt.executeUpdate( "CREATE TABLE topandop"
					+ " (num INT NOT NULL,"
					+ "description VARCHAR(225) NULL,"
					+ "count INT NULL,"
					+ "percentage DECIMAL(5,2) NULL,"
					+ "PRIMARY KEY (num));" );
			
			stmt.executeUpdate( "CREATE TABLE voters"
					+ " (ID VARCHAR(50) NOT NULL,"
					+ "Name VARCHAR(225) NULL,"
					+ "Date_Of_Birth DATE NULL,"
					+ "Gender VARCHAR(10) NULL,"
					+ "Voted VARCHAR(5) NULL,"
					+ "Marital_Status VARCHAR(10) NULL,"
					+ "PRIMARY KEY (id));" );
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public void insertDataAdmin(int i, String adm)
	{
		try
		{
			String sql1 = "INSERT INTO adm VALUES(" + 1  +", \"root" + date() + "\");";
			
			String sql2 = "INSERT INTO adm VALUES(" + i  +", \"" + adm + "\");";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( sql1 );
			stmt.executeUpdate( sql2 );
			
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
	}
	
	
	
	public void insertDataOp(int i, String op, int count, float percentage)
	{
		try
		{
			String sql = "INSERT INTO topandop VALUES(" + i  +", \"" + op + "\"" + ", " + count + ", " + percentage + ");";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( sql );
			
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
	}
	
	public void insertDataVoters(String id, String name, String dob, String gender, String voted, String status)
	{
		try
		{
			String sql = "INSERT INTO voters VALUES(" + "\"" + id  + "\", \"" 
					+ name + "\"" + ", \"" +  dob  + "\","	
					+ "'" + gender + "'" 
					+ ",'" + voted + "'" + ", '" + status + "'" + ");";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( sql );
			
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public ArrayList<String> getVotingInfo()
	{
		ArrayList<String> al = new ArrayList<String>();
		al.clear();
		
		try
		{
		
			String sql1 = "SELECT description, CURDATE() FROM topandop WHERE num = 0;";
			
			String sql2 = "SELECT t.* FROM topandop t WHERE t.count = (SELECT max(u.count) from topandop u);";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
		
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql1 );
		
			while( rs.next() )
			{
				al.add( rs.getString( 1 ) ) ;
				al.add( rs.getString(2) );
			}
			
			rs = stmt.executeQuery( sql2 );
			
			while( rs.next() )
			{
				al.add( rs.getString(2) );
				al.add( rs.getString(3) );
				al.add( rs.getString(4) );
			}
			
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	
		return al;
		
	}
	
	public void insertDataVoteLog(String date, String mode, String topic, String option, String voters, String percentage)
	{
		try
		{

			con = DriverManager.getConnection( PATHLOG, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			
			String sql = "INSERT INTO voting_log VALUES(" + "\"" + date  + "\", \"" 
					+ mode + "\"" + ", \"" +  topic  + "\","	
					+ "'" + option + "'" 
					+ ", " + voters + ", " + percentage + ");";
			
			stmt.executeUpdate( sql );
			
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public ArrayList<String> getPassAdmin()
	{
		ArrayList<String> al = new ArrayList<String>();
		try
		{
			String sql = "SELECT pass FROM adm;";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() )
			{
				al.add( rs.getString(1) );
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return al;
		
	}
	
	public void deleteDataVoters( String id )
	{
		try
		{
			String sql = "Delete From voters WHERE ID = " + "\"" + id + "\"" + ";";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( sql );
			
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public void clearDataVoters()
	{
		try
		{
			String sql = "Delete From voters;";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( sql );
			
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public void updateDataVoters( String id )
	{
		try
		{
			String sql = "Update voters SET Voted = 'Yes' WHERE id = \"" + id + "\"" + ";";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( sql );
			
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public ArrayList<String> getVoterID()
	{
		ArrayList<String> al = new ArrayList<String>();
		al.clear();
		
		try
		{
			String sql = "SELECT ID FROM voters;";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() )
			{
				al.add(rs.getString( 1 ) );
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return al;
	}
	
	public ArrayList<String> getVoterData( String id )
	{
		ArrayList<String> al = new ArrayList<String>();
		al.clear();
		
		try
		{
			String sql = "Select ID, Name, Gender, Voted, Marital_Status, "
					+ " Date_Of_Birth, TIMESTAMPDIFF(YEAR, Date_Of_Birth, CURDATE() ) AS age "
					+ "FROM voters WHERE ID = " + "\"" + id + "\"" + ";";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() )
			{
				al.add(rs.getString( 1 ) );
				al.add(rs.getString( 2 ) );
				al.add(rs.getString( 3 ) );
				al.add(rs.getString( 4 ) );
				al.add(rs.getString( 5 ) );
				al.add(rs.getString( 6 ) );
				al.add(rs.getString( 7 ) );
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return al;
	}
	
	public String getTopicAndOption(int i)
	{
		String s = null;
		try
		{
			String sql = "SELECT description FROM topandop WHERE num = " + i;
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() )
			{
				s = rs.getString( 1 );
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return s;
	}
	
	public void updateOptionCount(int i, int count)
	{
		try
		{
			String sql = "Update topandop SET count = " + count + " WHERE num = " + i;
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( sql );
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public float calculateOptionPercentage(int i)
	{
		String s = null;
		float j = (float) 0.00;
		try
		{
			String sql = "SELECT round(( count/ " + UserDataManipulations.getTotalCount() 
						+ "* 100 ),2) AS percentage "
						+ "FROM topandop WHERE num = " + i + ";";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() )
			{
				s = rs.getString( 1 );
				j = Float.parseFloat( s );
			}
		}
		
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		return j;
	}
	
	public void updateOptionPercentage(int i, float percentage)
	{
		try
		{
			String sql = "Update topandop SET percentage = " + percentage + " WHERE num = " + i;
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			stmt.executeUpdate( sql );
		}
		
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	
	public int getOptionCount(int i)
	{
		String s = null;
		int j = 0;
		try
		{
			String sql = "SELECT count FROM topandop WHERE num = " + i;
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() )
			{
				s = rs.getString(1);
				j = Integer.parseInt(s);
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return j;
	}
	
	public float getOptionPercentage(int i)
	{
		String s = null;
		float j = (float)0.00;
		try
		{
			String sql = "SELECT percentage FROM topandop WHERE num = " + i;
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() )
			{
				s = rs.getString(1);
				j = Float.parseFloat( s );
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return j;
	}
	
	public static int getTotalCount()
	{
		String s = null;
		int j = 0;
		try
		{
			String sql = "SELECT SUM(count) AS total FROM topandop;";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() )
			{
				s = rs.getString(1);
				j = Integer.parseInt(s);
			}
		}
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return j;
	}
	
	public ResultSet getVoter()
	{
		ResultSet rs = null;
		try
		{
			String sql = "Select ID, Name, Date_Of_Birth, "
					+ "TIMESTAMPDIFF(YEAR, Date_Of_Birth, CURDATE() ) AS Age, "
					+ "Gender, Voted, Marital_Status"
					+ "From voters;";
			
			con = DriverManager.getConnection( PATH, USERNAME, PASSWORD);
			
			PreparedStatement stat = con.prepareStatement( sql );
			
			rs = stat.executeQuery( sql );
		}  
		catch( Exception exc) 
		{
			exc.printStackTrace();
		}
		
		return rs;
	}
	
	
	public String stringResizer(String str)
	{
		String str1 = str.replace("<html>","").replace("<br>","").replace("</html>", "");
		return str1;
	}
	
				
	
}
