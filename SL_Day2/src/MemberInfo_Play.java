import java.sql.*;

public class MemberInfo_Play {
    public static void main(String[] args) throws SQLException {
        member mb = new member();

        mb.setMemberInfo();
        mb.db_conn();
        mb.db_select();





    }
}
