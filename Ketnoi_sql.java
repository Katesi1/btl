package ketnoi_sql;
import java.sql.*;
public class Ketnoi_sql {
  public static void main(String[] args) {
        Connection con = null;
        try{
        String url = "jdbc:sqlserver://localhost:1433;"+"databaseName=Mon;user=sa;password=123456";
        con = java.sql.DriverManager.getConnection(url);
        System.out.println("Da ket noi sql thanh cong"); 
        java.sql.Statement st=con.createStatement();
    
        java.sql.ResultSet rs1 = st.executeQuery("SELECT * FROM Sinhvien");
        while(rs1.next()){
        System.out.printf("%-10s %-20s %-10s%n",rs1.getString(1),rs1.getString(2), rs1.getString(3));
        }
    }catch(Exception e){
        System.out.println("Khong ket noi duoc do" + e.getMessage());
    }   
    }
    
}
