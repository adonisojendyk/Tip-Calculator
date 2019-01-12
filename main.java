import javax.swing.JOptionPane;

public class TipCalculatorAssignment {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter your Check Amount: ");
        
        double checkamount = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the percentage of tip you'd \nlike applied as a decimal: ");
        
        double tip = Double.parseDouble(input);
        
        double sumoftip =  checkamount*tip; 
        
        double total = sumoftip + checkamount;
        
        JOptionPane.showMessageDialog(null, "Check Amount: " + checkamount + "\nGratuity: " + tip + "\nTip Amount: " + sumoftip + "\nTotal: " + total);
    }
}
