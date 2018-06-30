import javax.swing.JOptionPane;

class Hello
{
          public static void main(String [] args)

                {  
                   String name = JOptionPane.showInputDialog("What is your name?" );

                   String message = "Welcome " + name + " in the java world. ";
                    
                   JOptionPane.showMessageDialog(null, message);

                  }
}