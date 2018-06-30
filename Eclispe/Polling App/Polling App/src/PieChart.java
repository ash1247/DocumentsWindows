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
			
	      if(option == 2)
	      {
	    	  dataset.setValue( option1 , vote.count1Percentage() );  
	    	  dataset.setValue( option2 , vote.count2Percentage() );   
	      }
	      else if(option == 3)
	      {
	    	  dataset.setValue( option1 , vote.count1Percentage() );  
	    	  dataset.setValue( option2 , vote.count2Percentage() );
	    	  dataset.setValue( option3 , vote.count3Percentage() );    
	      }
	      else if(option == 4)
	      {
	    	  dataset.setValue( option1 , vote.count1Percentage() );  
	    	  dataset.setValue( option2 , vote.count2Percentage() );
	    	  dataset.setValue( option3 , vote.count3Percentage() ); 
	    	  dataset.setValue( option4 , vote.count4Percentage() ); 
	      }
	      else
	      {
	    	  dataset.setValue( option1 , vote.count1Percentage() );  
	    	  dataset.setValue( option2 , vote.count2Percentage() );
	    	  dataset.setValue( option3 , vote.count3Percentage() ); 
	    	  dataset.setValue( option4 , vote.count4Percentage() ); 
	    	  dataset.setValue( option5 , vote.count5Percentage() );
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
