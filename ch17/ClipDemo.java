package ch17;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

public class ClipDemo extends JFrame {
    ClipDemo() {
        setTitle("이미지 그리기");

        class MyPanel extends JPanel {
            BufferedImage balloons, bear;

            public MyPanel() {
                try {
                    balloons = ImageIO.read(new File("images/balloons.png"));
                    bear = ImageIO.read(new File("images/bear.png"));
                } catch (IOException e) {
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setClip(30, 20, 240, 170);

            g.drawImage(balloons, 0, 0, null);

            g.setColor(Color.RED);

            g.drawRect(20, 10, 100, 100);

            g.drawImage(bear, 190, 120, null);
            }
        }

        add(new MyPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 265);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClipDemo();
    }
}
