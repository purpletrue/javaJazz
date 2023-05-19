package ch015;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo extends JFrame {
    CardLayout layout;               // 생성자와 rotate()메서드에서 사용하려고 멤버 변수로 선언한다.

    public void rotate() {         // CardLayout을 이용해 컨테이너에 쌓여있는 컴포넌트를 0.5초마다 하나씩 다음 컴포넌트로 넘긴다.
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            layout.next(this.getContentPane());
        }
    }
    CardLayoutDemo() {
        setTitle("카드 레이아웃!");
        layout = new CardLayout();            // 프레임의 배치 관리자를 CardLayout으로 설정한다.
        setLayout(layout);

        add(new JButton("버튼 0"));
        add(new JButton("버튼 1"));
        add(new JButton("버튼 2"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemo().rotate();             // 애플리케이션 객체를 생성해 rotate() 메서드를 실행한다
    }
}