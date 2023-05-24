package ch18;

import java.sql.*;

public class DB3Demo {
    public static Connection makeConnection() {
        String url =
                "jdbc:oracle:thin:@//localhost:1521/xe";
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");    // jdbc 드라이버를 메모리에 로드


            System.out.println("데이터베이스 연결 중...");
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

//        SQL 문을 실행한 후 결과집합인 ResultSet 객체를 가져온다
        String sql = "SELECT * FROM person";           // person; 세미콜론 제거하면 됨
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while(rs.next()) {         // 결과 집합을 사용해 필요한 내용 출력
            System.out.println("name : " + rs.getString(1) + "\t");          // re.getString("name")을 사용해도 결과 동일
            System.out.println("phone : " + rs.getString("phone"));
        }
    }
}
