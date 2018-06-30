import javax.swing.JOptionPane;

public class Problem1
{
          public static void main(String [] args)

                {  
                   String name = JOptionPane.showInputDialog("What is your name?" );

                   String message = "Welcome " + name + ".";
                    
                   JOptionPane.showMessageDialog(null, message);

                  }
}