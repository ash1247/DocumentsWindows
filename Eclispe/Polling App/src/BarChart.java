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
	private UserDataManipulations data = new UserDataManipulations();

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
				
		String option1 = data.getTopicAndOption(1);        
		String option2 = data.getTopicAndOption(2);        
		String option3 = data.getTopicAndOption(3);        
		String option4 = data.getTopicAndOption(4);        
		String option5 = data.getTopicAndOption(5);
		
		String voters = "Voters";
		       
		
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
		
		 if(option == 2)
	      {
			 dataset.addValue( data.getOptionPercentage(1), voters, option1 );   
			 dataset.addValue( data.getOptionPercentage(2), voters, option2 );
		  
	      }
	      else if(option == 3)
	      {
	    	  dataset.addValue( data.getOptionPercentage(1), voters, option1 );   
	  		  dataset.addValue( data.getOptionPercentage(2), voters, option2 );
	  		  dataset.addValue( data.getOptionPercentage(3), voters, option3 );
	      }
	      else if(option == 4)
	      {
	    	  dataset.addValue( data.getOptionPercentage(1), voters, option1 );   
	  		  dataset.addValue( data.getOptionPercentage(2), voters, option2 );
	  		  dataset.addValue( data.getOptionPercentage(3), voters, option3 );
	  		  dataset.addValue( data.getOptionPercentage(4), voters, option4 );		
	      }
		 
	      else
	      {
	    	  dataset.addValue( data.getOptionPercentage(1), voters, option1 );   
	  		  dataset.addValue( data.getOptionPercentage(2), voters, option2 );
	  		  dataset.addValue( data.getOptionPercentage(3), voters, option3 );
	  		  dataset.addValue( data.getOptionPercentage(4), voters, option4 );	
	  		  dataset.addValue( data.getOptionPercentage(5), voters, option5 );
	      }
		             

		return dataset; 
	   }

}
