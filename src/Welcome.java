import javax.swing.*;

public class Welcome {
    public static void main(String args[])
    {
        String name;

        name = JOptionPane.showInputDialog("Enter your name: ");

        JOptionPane.showMessageDialog(null, "Hello world is back yo, " + name + "!!","Welcome",
                                      JOptionPane.INFORMATION_MESSAGE);
    }
}
