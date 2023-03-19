import java.sql.*;

public class MySQLExample {
    public static void main(String[] args) {
        try {
            //建立到数据库的连接
            String url = "jdbc:mysql://localhost:3306/0";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);

            // 创建语句
            Statement stmt = conn.createStatement();

            // 执行查询
            ResultSet rs = stmt.executeQuery("SELECT * FROM 0");

            // 处理结果集
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // 关闭连接并释放资源
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}