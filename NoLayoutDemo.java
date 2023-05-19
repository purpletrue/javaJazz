package ch015;

import javax.swing.*;

public class NoLayoutDemo extends JFrame {

    NoLayoutDemo() {
        setTitle("절대 위치로 배치!");

        JPanel p = new JPanel();
        p.setLayout(null);              // 기본 배치 관리자를 제거한다.


        JButton b1 = new JButton("B 1");
        b1.setBounds(10, 10, 60, 30);  // 가로, 세로, 폭, 높이. 버튼의 크기와 위치 설정

        JButton b2 = new JButton("버튼 2");
        b2.setBounds(80, 20, 80, 25);
        JButton b3 = new JButton("Button 3");
        b3.setBounds(150, 30, 100, 30);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NoLayoutDemo();
    }
}
