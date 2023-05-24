package ch015;

import javax.swing.*;

public class JLabelTestDemo extends JFrame {
    JLabelTestDemo() {
        setTitle("이미지를 포함한 레이블");

        ImageIcon icon = new ImageIcon(this.getClass().getResource("images/bear.png"));
        JLabel label = new JLabel("곰 인형", icon, JLabel.CENTER);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelTestDemo();
    }
}
