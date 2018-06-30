import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;

public class BarChart extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected static int option;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarChart chart = new BarChart();
					chart.pack( );        
					RefineryUtilities.centerFrameOnScreen( chart );        
					chart.setVisible( true ); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BarChart() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JFreeChart barChart = ChartFactory.createBarChart(
	    		  "Voters Bar Chart (In Percentage)",           
		         "Options",            
		         "Voters",            
		         createDataset(),          
		         PlotOrientation.VERTICAL,           
		         true, true, false);
		ChartPanel chartPanel = new ChartPanel( barChart );        
	    chartPanel.setPreferredSize(new java.awt.Dimension( 800 , 600 ) );        
	    setContentPane( chartPanel ); 
	}
	
	private CategoryDataset createDataset( ) {
		
		option = WelcomeWindow.radioButton;
		
		UserFileOperation operation1 = new UserFileOperation("Option1");
		UserFileOperation operation2 = new UserFileOperation("Option2");
		UserFileOperation operation3 = new UserFileOperation("Option3");
		UserFileOperation operation4 = new UserFileOperation("Option4");
		UserFileOperation operation5 = new UserFileOperation("Option5");
		
		VoteCount vote = new VoteCount();
		
		String option1 = operation1.getUserData();        
		String option2 = operation2.getUserData();        
		String option3 = operation3.getUserData();        
		String option4 = operation4.getUserData();        
		String option5 = operation5.getUserData();
		
		String voters = "Voters";
		       
		
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
		
		 if(option == 2)
	      {
			 dataset.addValue( vote.count1Percentage(), voters, option1 );   
			 dataset.addValue( vote.count2Percentage(), voters, option2 );
		  
	      }
	      else if(option == 3)
	      {
	    	  dataset.addValue( vote.count1Percentage(), voters, option1 );   
		  	  dataset.addValue( vote.count2Percentage(), voters, option2 );
		  	  dataset.addValue( vote.count3Percentage(), voters, option3 );
		  		   
	      }
	      else if(option == 4)
	      {
	    	  dataset.addValue( vote.count1Percentage(), voters, option1 );   
	    	  dataset.addValue( vote.count2Percentage(), voters, option2 );
		  	  dataset.addValue( vote.count3Percentage(), voters, option3 );
		  	  dataset.addValue( vote.count4Percentage(), voters, option4 );	
	      }
		 
	      else
	      {
	    	  dataset.addValue( vote.count1Percentage(), voters, option1 );   
	  		  dataset.addValue( vote.count2Percentage(), voters, option2 );
	  		  dataset.addValue( vote.count3Percentage(), voters, option3 );
	  		  dataset.addValue( vote.count4Percentage(), voters, option4 );	
	  		  dataset.addValue( vote.count5Percentage(), voters, option5 );
	      }
		             

		return dataset; 
	   }

}
