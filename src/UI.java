import javax.swing.*;

public class UI {
  private JTextField textField1;
  private JPasswordField passwordField1;
  private JButton Button;
  private JPanel Jpanel;

  public static void main(String[] args) {
    JFrame frame = new JFrame("UI");
    frame.setContentPane(new UI().Jpanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
