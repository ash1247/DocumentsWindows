import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RefineryUtilities;

public class PieChart extends JFrame {

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
					PieChart frame = new PieChart();
				    frame.setSize( 800 , 600 );    
				    RefineryUtilities.centerFrameOnScreen( frame );    
				    frame.setVisible( true ); 
				    
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PieChart() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setContentPane(createDemoPanel( ));
	}
	
	  private static PieDataset createDataset( ) {
		  option = WelcomeWindow.radioButton;
		  
	      DefaultPieDataset dataset = new DefaultPieDataset( );
	      
	      UserDataManipulations data = new UserDataManipulations();
	
	      String option1 = data.getTopicAndOption(1);        
	      String option2 = data.getTopicAndOption(2);        
	      String option3 = data.getTopicAndOption(3);        
	      String option4 = data.getTopicAndOption(4);        
	      String option5 = data.getTopicAndOption(5);
			
	      if(option == 2)
	      {
	    	  dataset.setValue( option1 , data.getOptionPercentage(1) );  
	    	  dataset.setValue( option2 , data.getOptionPercentage(2) );   
	      }
	      else if(option == 3)
	      {
	    	  dataset.setValue( option1 , data.getOptionPercentage(1) );  
	    	  dataset.setValue( option2 , data.getOptionPercentage(2) );
	    	  dataset.setValue( option3 , data.getOptionPercentage(3) );     
	      }
	      else if(option == 4)
	      {
	    	  dataset.setValue( option1 , data.getOptionPercentage(1) );  
	    	  dataset.setValue( option2 , data.getOptionPercentage(2) );
	    	  dataset.setValue( option3 , data.getOptionPercentage(3) ); 
	    	  dataset.setValue( option4 , data.getOptionPercentage(4) );  
	      }
	      else
	      {
	    	  dataset.setValue( option1 , data.getOptionPercentage(1) );  
	    	  dataset.setValue( option2 , data.getOptionPercentage(2) );
	    	  dataset.setValue( option3 , data.getOptionPercentage(3) ); 
	    	  dataset.setValue( option4 , data.getOptionPercentage(4) ); 
	    	  dataset.setValue( option5 , data.getOptionPercentage(5) );
	      }
	    	  
	      
	      return dataset;         
	   }
	  private static JFreeChart createChart( PieDataset dataset ) {
	      JFreeChart chart = ChartFactory.createPieChart(      
	         "Voters Pie Chart (In Percentage)",   // chart title 
	         dataset,          // data    
	         true,             // include legend   
	         true, 
	         false);

	      return chart;
	   }
	  
	  public static JPanel createDemoPanel( ) {
	      JFreeChart chart = createChart(createDataset( ) );  
	      return new ChartPanel( chart ); 
	   }

}
