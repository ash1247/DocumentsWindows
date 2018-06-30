import javax.swing.JOptionPane;

public class Dialog1 {
	public static void main(String [] args)
	{   
		int num1;
		int num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another integer: "));
		
		String message = String.format("The sum is %d", num1 + num2);
		
		JOptionPane.showMessageDialog(null , message);
	}

}
