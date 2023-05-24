package ch015;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame {
    JTextField t1, t2;                 // 이벤트 소스가 될 수 있는 컴포넌트로 여러 메서드에서 사용되므로 멤버 필드로 선언
    JTextArea area;
    JButton cal, reset;
    JComboBox cb;

    EventDemo() {               // ComponentDemo() 코드와 동일
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth(); showCenter(); showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 220);         // BorderLayout의 북쪽, 중앙, 남쪽에 배치한 모든 컴포넌트를 나타내려고 105에서 220으로 변경
        setVisible(true);

        addMouseListener(new MouseListener() {             // JFrame의 자식 클래스인 프로그램 자신이 이벤트 소스이므로 this.addMouseListener()와 동일
            @Override
            public void mouseClicked(MouseEvent e) {       // MouseListener 익명 객체를 이벤트 소스인 프로그램 자신에 등록
                System.out.println("마우스 클릭");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("마우스 버튼 누르기");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("마우스 버튼 놓기");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("마우스 입장");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("마우스 퇴장");
            }
        });

        addMouseMotionListener(new MouseMotionListener() {              // MouseMotionListener 익명 객체를 이벤트 소스인 프로그램 자신에 등록
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("마우스 드래그(" + e.getX() + ", " + e.getY() + ").");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("마우스 이동(" + e.getX() + ", " + e.getY() + ").");
            }
        });
    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2,0));

        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);

        KeyListener listener2 = new KeyListener() {       // KeyListener 객체를 생성
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar() + "를 입력했습니다.");    // 키보드로 입력하면 입력한 문자를 화면에 나타낸다.
            }

            @Override
            public void keyPressed(KeyEvent e) {        // KeyListener 인터페이스에 있는 추상 메서드이므로 사용하지 않아도 필요

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        t1.addKeyListener(listener2);        // 텍스트 필드에 생성된 KeyListener 객체를 등록
    }

    void showCenter() {
        JPanel panel = new JPanel();

        area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
        area.setEditable(false);               // 텍스트 영역에 입력할수없도록 설정
        area.setForeground(Color.RED);   // 텍스트 영역의 문자열을 빨간색으로 설정

        panel.add(area);

        add(panel, BorderLayout.CENTER);    // 텍스트 영역을 담은 패널을 프레임의 중앙에 추가
    }



    void showSouth() {
        String[] color = {"red", "blue"};

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("리셋");

        panel.add(cal); panel.add(cb); panel.add(reset);

        add(panel, BorderLayout.SOUTH);


        cb.addItemListener(e -> {                         //콤보 박스에 ItemListener 객체를 람다식으로 등록
            int index = ((JComboBox) cb).getSelectedIndex();    // 선택한 콤보 박스 항목의 인덱스를 가져온다.
            if (index == 0)                      // 콤보 박스의 선택한 항목에 따라 글자색 변경
                area.setForeground(Color.RED);
            else
                area.setForeground(Color.BLUE);
        });


        ActionListener listener1 = e -> {         // ActionListener 객체 생성
            if (e.getSource() == cal) {          // ActionEvent의 소스가 계산 버튼인지 조사한다
                if (t1.getText().isEmpty())     // 반지름 텍스트 필드에 입력 데이터가 있는지 조사
                    area.setText("반지름을 입력하세요!");      // 반지름 입력 데이터가 없다면 오류 메시지를 텍스트 영역에 추가
                else {
                    String s = t1.getText();      // 입력데이터가 있다면 넓이를 계산한 후 넓이 텍스트 필드에 추가
                    double radius = Double.parseDouble(s);
                    double result = radius * radius * 3.14;
                    t2.setText("" + result);
                    area.setText(radius + " * " + radius + " * 3.14=" + result);   // 계산 과정도 텍스트 영역에 추가
                }
            } else {
                t1.setText("");   // ActionEvent 소스가 리셋 버튼이므로 반지름과 넓이의 텍스트 필드와 텍스트 영역에 있는 내용을 지운다
                t2.setText("");
                area.setText("");
            }
        };

        cal.addActionListener(listener1);    // 버튼에 리스너를 등록
        reset.addActionListener(listener1);
    }


    public static void main(String[] args) {
        new EventDemo();
    }
}
