package jdbc_package;


import java.sql.*;

public class jdbc_play {
    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // jdbc 드라이버를 로딩하고 접속하는 과정이 필요함
        Connection conn;  // database에 연결할 때 사용하는 레퍼런스 변수
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "");
        System.out.println("접속완료");
//         jdbc 를 이용해서 어떤작업(저장, 검색, 삭제, 수정)을 실행하는 부분
//         jdbc 는 프리페어드라는 기능을 사용할 수 있음 (Prepared)
//         이 기능은 SQL 명령어에서 특저한 부분(데이터가 들어가는 부분)을 변수처리한 다음 나중에 채워넣는 방식이다
//
        // 삽입명령
//        String str = "INSERT INTO table_sample(m_name, m_phone) VALUES (?,?)";
//        PreparedStatement p_stmt;
//        p_stmt = conn.prepareStatement(str);
//        p_stmt.setString(1, "lee");
//        p_stmt.setString(2, "010-7789-4661");

        //삭제명령
        String delete = "delete from table_sample";
        PreparedStatement p_stmt;
        p_stmt = conn.prepareStatement(delete);


//        java.sql.Statement stmt = conn.createStatement() ;
//        String query = "select * from table_sample";
//        ResultSet rs = stmt.executeQuery(query) ;


//        // 서버로 SQL 명령어를 전송한다
        p_stmt.execute();
//         JDBC 사용 시 발생할 수 있는 에러를 처리하는 부분 (Exception)
    }

}

