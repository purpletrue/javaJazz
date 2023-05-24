package ch015;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;


public class ComponentDemo extends JFrame {
    ComponentDemo() {
        setTitle("계산기");

        setLayout(new BorderLayout(10, 10));
        showNorth(); showCenter(); showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setVisible(true);
    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(1, 0));   // 패널을 행이 2개인 GridLayout방식으로 설정
//        아래 버튼이 잘려서 높이 지정
        p1.setPreferredSize(new Dimension(150, 30));

        JTextField t1 = new JTextField(15);  // 2개의 텍스트 필드 생성
        p1.add(t1);

        panel.add(p1);         // 2개의 패널도 패널 하나에 추가

        add(panel, BorderLayout.NORTH);  // 레이블과 텍스트 필드를 담은 패널을 프레임의 북쪽에 추가
    }


    void showCenter() {
        String[] color = {"red", "blue"};

        JPanel panel1 = new JPanel();
//        절대 위치 지정하기 위해 null값 추가
        panel1.setLayout(null);
//        panel1의 크기를 컴포넌트가 모두 표시될 수 있는 크기로 조정
        panel1.setPreferredSize(new Dimension(150, 100));

//        패널 1 on off
        JButton cal = new JButton("on");
        JButton reset = new JButton("off");
        cal.setBounds(60, 0, 50, 25);
        reset.setBounds(120, 0, 50, 25);

        panel1.add(cal);
        panel1.add(reset);

        add(panel1);    // 텍스트 영역을 담은 패널을 프레임의 중앙에 추가

    }

//        2번째 패널 추가 (숫자 부분)
    void showSouth() {
        JPanel panel2 = new JPanel(new GridLayout(4, 4, 10, 10));     // 10픽셀의 수평 및 수직 간격으로 GridLayout 설정
        GridBagConstraints gbc = new GridBagConstraints();
        panel2.setPreferredSize(new Dimension(150, 150));

        JButton nine = new JButton("9");
        JButton eight = new JButton("8");
        JButton seven = new JButton("7");
        JButton six = new JButton("6");
        JButton five = new JButton("5");
        JButton four = new JButton("4");
        JButton three = new JButton("3");
        JButton two = new JButton("2");
        JButton one = new JButton("1");
        JButton zero = new JButton("0");
        JButton pe = new JButton(".");
        JButton eq = new JButton("=");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton x = new JButton("x");
        JButton na = new JButton("÷");

        panel2.add(one); panel2.add(two); panel2.add(three);
        panel2.add(four); panel2.add(five); panel2.add(six);
        panel2.add(seven); panel2.add(eight); panel2.add(nine);
        panel2.add(zero); panel2.add(pe); panel2.add(eq);
        panel2.add(plus); panel2.add(minus); panel2.add(x);
        panel2.add(na);

        add(panel2, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new ComponentDemo();
    }
}
