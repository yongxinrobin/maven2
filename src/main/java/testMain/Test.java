package testMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
	
public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	public static void main(String[] args) {
           
		   Connection con = null;
		    PreparedStatement pre = null;
		    ResultSet result = null;
		    try
		    {
		        Class.forName("oracle.jdbc.driver.OracleDriver");
		        System.out.println("开始尝试连接数据库！");
		        String user = "YWJK";
		        String password = "123456";
		        con = DriverManager.getConnection(url, "YWJK", "123456");
		        System.out.println("连接成功！");
		        String sql = "select * from b_kh_jld where rownum < 50";
		        pre = con.prepareStatement(sql);
		        result = pre.executeQuery();
		        while (result.next()){
		        	System.out.println(result.getString(5));
		        }
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
	}
}
