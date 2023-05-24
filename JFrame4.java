package ch0203;

import javax.swing.*;

public class JFrame4 extends JFrame {
    JFrame4() {
        setTitle("개발자 이유진");

        JPanel p = new JPanel();
        JLabel l = new JLabel("개발자 이유진");
        JButton b = new JButton("버튼");
        p.add(l);
        p.add(b);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame4();
    }
}
