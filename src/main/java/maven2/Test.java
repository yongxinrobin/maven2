package maven2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
//public static String url = "jdbc:oracle:@127.0.0.1:1521";
public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	public static void main(String[] args) {
           
		   Connection con = null;// ����һ�����ݿ�����
		    PreparedStatement pre = null;// ����Ԥ����������һ�㶼�������������Statement
		    ResultSet result = null;// ����һ�����������
		    try
		    {
		        Class.forName("oracle.jdbc.driver.OracleDriver");// ����Oracle��������
		        System.out.println("��ʼ�����������ݿ⣡");
//		        String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:XE";// 127.0.0.1�Ǳ�����ַ��XE�Ǿ����Oracle��Ĭ�����ݿ���
		        String user = "YWJK";// �û���,ϵͳĬ�ϵ��˻���
		        String password = "123456";// �㰲װʱѡ���õ�����
		        con = DriverManager.getConnection(url, "YWJK", "123456");// ��ȡ����
		        System.out.println("���ӳɹ���");
		        String sql = "select * from b_kh_jld where rownum < 50";// Ԥ������䣬�������������
		        pre = con.prepareStatement(sql);// ʵ����Ԥ�������
		        result = pre.executeQuery();// ִ�в�ѯ��ע�������в���Ҫ�ټӲ���
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
