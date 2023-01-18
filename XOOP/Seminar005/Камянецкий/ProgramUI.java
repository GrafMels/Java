import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgramUI {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Form1 form = new Form1();
    form.setVisible(true);
  }
}

class Form1 extends JFrame {
  private JButton btn = new JButton("Тык");
  JTextArea ja = new JTextArea();

  public Form1() {
    super("Форма 1");
    this.setBounds(0, 0, 200, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container co = this.getContentPane();
    btn.addActionListener(new BtnClick());
    co.add(btn);
    btn.setSize(100, 100);

    ja.setBounds(100, 100, 50, 89);
    co.add(ja);
  }

  class BtnClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      String msg = "hello world";
      JOptionPane.showMessageDialog(null, ja.getText(), "Тк", WIDTH);
    }
  }
}
