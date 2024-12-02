import javax.swing.*;

public class SwingDemo extends JFrame {
    SwingDemo() {
        JButton b = new JButton("click me");
        b.setBounds(100, 20, 100, 30);
        add(b);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
