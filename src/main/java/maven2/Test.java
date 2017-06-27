package maven2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
//public static String url = "jdbc:oracle:@127.0.0.1:1521";
public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	public static void main(String[] args) {
           
		   Connection con = null;// 创建一个数据库连接
		    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
		    ResultSet result = null;// 创建一个结果集对象
		    try
		    {
		        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
		        System.out.println("开始尝试连接数据库！");
//		        String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:XE";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
		        String user = "YWJK";// 用户名,系统默认的账户名
		        String password = "123456";// 你安装时选设置的密码
		        con = DriverManager.getConnection(url, "YWJK", "123456");// 获取连接
		        System.out.println("连接成功！");
		        String sql = "select * from b_kh_jld where rownum < 50";// 预编译语句，“？”代表参数
		        pre = con.prepareStatement(sql);// 实例化预编译语句
		        result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
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
