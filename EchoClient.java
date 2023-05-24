package ch18;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws IOException {             // 일대다 에코서버엔 throws IOExeption 추가해야함
        Socket client = null;
        PrintWriter out = null;

        try {
            client = new Socket();      // 빈 소켓을 생성
            System.out.println("에코 서버와 연결 시도...");
            client.connect(new InetSocketAddress("localhost", 5000), 3000); // 소켓으로 서버에 연결을 요청, 3000은 타임아웃을 의미하며 단위는 ms임
            System.out.println("에코 서버와 연결 성공...");
        } catch (Exception e) {
            e.printStackTrace();
        }

        out = new PrintWriter(client.getOutputStream(), true); // 소켓에서 출력스트림을 생성, true면 버퍼를 자동으로 비움

        Scanner in = new Scanner(System.in);
        String msg;

        System.out.print("보낼 메시지가 있나요?");
        while ((msg = in.nextLine()) != null) {   // 소켓을 이용해 클라이언트에서 입력된 메시지를 입력 스트림으로 읽은 후 "끝"을 포함하지 않을때까지 화면에 출력시킴
            if (msg.contains("끝"))
                break;
            out.println(msg);
            System.out.print("보낼 메시지가 더 있나요?");
        }

        System.out.println("클라이언트 종료");
        out.close();    // 소켓, 입력-출력 스트림을 닫는다
        in.close();
        client.close();
    }
}
