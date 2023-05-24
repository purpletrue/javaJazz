package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo2Server extends Thread {   // Thread의 자식 클래스 = Echo2Server
    protected static boolean cont = true;
    protected Socket connection = null;

    public static void main(String[] args) throws IOException {
        ServerSocket server = null;

        server = new ServerSocket(5000);
        System.out.println("서버 소켓 생성");

        while (cont) {
            System.out.println("연결 대기 중...");
            new Echo2Server(server.accept());      // 클라이언트의 요청을 승인하고 소켓을 사용해 스레드를 생성
        }
        server.close();
    }

    private Echo2Server (Socket clientSocket) {
        connection = clientSocket;
        start();
    }
    public void run() {
        BufferedReader in;

        System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성");
        try {
            in = new BufferedReader(     // 소켓에서 생성한 입력 스트림으로 클라이언트에서 문자열을 받아 출력
                    new InputStreamReader(connection.getInputStream())
            );

            String msg;

            while ((msg = in.readLine()) != null) {
                System.out.println("읽은 메시지 메아리 : " + msg);
            }

            in.close();
            connection.close();

        } catch (IOException e) {
        }
    }
}
