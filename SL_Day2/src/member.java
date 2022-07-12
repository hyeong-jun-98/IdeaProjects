import java.sql.*;
import java.util.Scanner;

public class member {


    private String name, id, pass, phone;

    public void setMemberInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 :");
        this.name = sc.nextLine();
        System.out.print("핸드폰번호 입력하세요 :");
        this.phone = sc.nextLine();
        System.out.print("아이디를 입력하세요 :");
        this.id = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 :");
        this.pass = sc.nextLine();

    }

    public void putMemberInfo() {
        System.out.println("name :" + name + ", ID :" + id + ", 비밀번호 :" + pass + ", 핸드폰 :" + phone);
    }

    public String getMemberName() {
        return name;
    }

    public String getMemberId() {
        return id;
    }

    public String getMemberPass() {
        return pass;
    }

    public String getMemberPhone() {
        return phone;
    }


    public void db_conn() throws SQLException {   // insert 입력문
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // jdbc 드라이버를 로딩하고 접속하는 과정이 필요함
        Connection conn;  // database에 연결할 때 사용하는 레퍼런스 변수
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "");
        System.out.println("접속완료");

        String insert = "INSERT INTO member_t(name, phone, id, pass) VALUES (?,?,?,?)";
        PreparedStatement p_stmt;
        p_stmt = conn.prepareStatement(insert);
        p_stmt.setString(1, name);
        p_stmt.setString(2, phone);
        p_stmt.setString(3, id);
        p_stmt.setString(4, pass);
        p_stmt.execute();
        p_stmt.close();


    }

    public void db_select() throws SQLException {   // select 출력문
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // jdbc 드라이버를 로딩하고 접속하는 과정이 필요함
        Connection conn;  // database에 연결할 때 사용하는 레퍼런스 변수
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "");
        System.out.println("접속완료");


        Statement stmt = conn.createStatement();  // ResultSet은 Statement를 통해 값을 저장할 수 있다.
        ResultSet rs = stmt.executeQuery("select * from member_t");
        while (rs.next()) {  // next() 메소드를 통해 선택되는 행을 바꿀 수 있다.(행 단위)  (다음 행이 있으면 true 반환)  커서가 내려가면서 잡는다
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
        }

        stmt.close();
    }
}