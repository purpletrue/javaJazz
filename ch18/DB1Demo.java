package ch18;

import java.sql.*;

public class DB1Demo {
    public static Connection makeConnection() {
        String url =
//                "jdbc:mysql://localhost/contacts?serverTimezone=Asia/Seoul";
                "jdbc:oracle:thin:@//localhost:1521/xe";
        Connection con = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");    // MySQL 드라이버를 메모리에 로드
            Class.forName("oracle.jdbc.OracleDriver");    // jdbc 드라이버를 메모리에 로드


            System.out.println("데이터베이스 연결 중...");
//            con = DriverManager.getConnection(url, "root", "1234");  // 데이터베이스와 연결해 Connection 객체를 생성
            con = DriverManager.getConnection(url, "system", "1234");  // 데이터베이스와 연결해 Connection 객체를 생성

            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾지 못했습니다...");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = makeConnection();
        Statement stmt = con.createStatement();     // Connection 객체에서 statement 객체를 생성
        String sql = "INSERT INTO person (name, phone, email) VALUES " + "('임꺽정', '010-4444-4444', 'lim@four.com')";

        if(stmt.executeUpdate(sql) == 1)
            System.out.println("레코드 추가 성공");
        else
            System.out.println("레코드 추가 실패");

        con.close();
        stmt.close();

    }

}
