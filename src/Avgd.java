import javax.swing.*;

public class Avgd {
  private JPanel jpanel;
  private JTabbedPane tabbedPane1;
  private JPanel jpanel3;
  private JPanel jpanel2;
  private JPanel jpanel1;
  private JLabel jLabel;
  private JTextField textField1;
  private JPasswordField passwordField1;
  private javax.swing.JLabel JLabel;

  public static void main(String[] args) {
    JFrame frame = new JFrame("Avgd");
    frame.setContentPane(new Avgd().jpanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
