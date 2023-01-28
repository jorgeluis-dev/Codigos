import javax.swing.JOptionPane;

public class nameandAge {

    public static void main(String[] args) {
        // Input dialogs to prompt the user for their name, age, and email
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String age = JOptionPane.showInputDialog("Enter your age: ");
        String email = JOptionPane.showInputDialog("Enter your email: ");
        
        // Display input in a message dialog
        JOptionPane.showMessageDialog(null, "Your name is: " + name + " and your age is: " + age + "\n Email registered: " + email);
    }
}
