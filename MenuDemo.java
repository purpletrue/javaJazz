package ch16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuDemo extends JFrame implements ActionListener {        // MenuDemo 는 JFrame의 자식 클래스이자, ActionListener 구현 클래스.
    MenuDemo() {     // MenuDemo 클래스
        setTitle("메뉴 구성하기");   // 프레임 제목
        makeMenu();                // 메뉴 생성 메서드
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // 종료 동작 설정
        setSize(300, 170);   // 크기 넓이 300 높이 170
        setVisible(true);   // 볼 수 있게 설정
    }

    void makeMenu() {     // makeMenu 메서드
        JMenuItem item;   // JmenuItem 객체 선언
        KeyStroke key;    // KeyStroke 객체 선언

        JMenuBar mb = new JMenuBar();              // JmenuBar 객체 mb 생성
        JMenu m1 = new JMenu("파일");            // [파일] 메뉴바 생성
        m1.setMnemonic(KeyEvent.VK_F);             // [파일] 메뉴를 생성하고 단축키도 설정. ALT + F를 누르면 [파일] 메뉴가 나타남
        JMenu m2 = new JMenu("색상");            // [색상] 메뉴바 생성
        m2.setMnemonic(KeyEvent.VK_C);             // [색상] 메뉴 단축키 c

        item = new JMenuItem("새 파일", KeyEvent.VK_N);  // [새 파일] 메뉴 항목을 단축키 N으로 설정해 생성
        item.addActionListener(this);                     // MenuDemo 클래스가 ActionListener 구현 클래스이므로 this가 리스너가 된다.
        m1.add(item);                                       // 파일 메뉴에 새파일 넣음
        item = new JMenuItem("파일 열기", KeyEvent.VK_O); // [파일 열기] 단축키 O
        item.addActionListener(this);                    // 액션리스너 등록
        m1.add(item);                                       // 파일 메뉴에 파일열기 넣음
        m1.add(new JMenuItem("파일 저장"));              // 파일 메뉴에 [파일저장] 넣음
        m1.addSeparator();                                  // 분리하는 구분선 넣음
        m1.add(new JMenuItem("종료"));                  // 파일 메뉴에 [종료] 넣음

        item = new JMenuItem("파란색");                                        // [파란색] 메뉴 생성
        key = KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK);       // CTRL+A의 KeyStroke 객체를 생성한 후 단축키 CTRL + B 로 설정
        item.setAccelerator(key);                                                 // 메뉴항목에 단축키 설정
        item.addActionListener(this);                                           // 현재 클래스의 인스턴스를 액션 리스너로 등록
        m2.add(item);                                                             // 색상 메뉴에 파란색 추가
        item = new JMenuItem("빨간색");  // [빨간색] 메뉴 생성
        key = KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK); // 단축키 CTRL + R 로 설정
        item.setAccelerator(key);   // 단축키 설정
        item.addActionListener(this);  // 액션리스너 등록
        m2.add(item);  // 색상 메뉴에 빨간색 추가
        item =  new JMenuItem("노란색");  // [노란색] 메뉴 생성
        key = KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK);  // 단축키 CTRL + Y 로 설정
        item.setAccelerator(key);  // 단축키 설정
        item.addActionListener(this); // 액션리스터 등록
        m2.add(item); // 색상 메뉴에 노란색 추가
        mb.add(m1);     // 파일 메뉴를 메뉴바에 추가
        mb.add(m2);     // 색상 메뉴를 메뉴바에 추가
        setJMenuBar(mb); // 프레임 안에 메뉴바 설정
    }

    public static void main(String[] args) {    // 메인 메서드
        new MenuDemo();      // MenuDemo 객체 생성
    }

    public void actionPerformed(ActionEvent e) {    // actionPerformed 메서드 생성, 이벤트 발생할 때 호출
        JMenuItem mi = (JMenuItem) (e.getSource());      // 호출하고, mi 동작 수행

        switch (mi.getText()) {                // 메뉴 항목의 문자열에 따라 화면에 문자열을 출력하거나 프레임의 컨텐트패인 배경색을 변경
            case "새 파일" -> System.out.println("새 파일");    // 새 파일 출력
            case "파일 열기" -> System.out.println("파일 열기");  // 파일 열기 출력
            case "파란색" -> getContentPane().setBackground(Color.BLUE);   // 파란색 누르면 컨텐트팬의 배경색이 파란색으로 변경
            case "빨간색" -> getContentPane().setBackground(Color.RED);    // 빨간색 누르면 배경색이 빨간색으로 변경
            case "노란색" -> getContentPane().setBackground(Color.YELLOW);  // 노란색 누르면 노란색으로 변경
        }
    }
}
