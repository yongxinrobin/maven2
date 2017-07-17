package testMain;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestSpringJDBC {
	
	public static void main(String[] args) {
		JdbcTemplate dao = SpringUtil.getTemplate();
		 List<Map<String, Object>> map = dao.queryForList("select * from b_kh_jld where rownum < 50");
		 Iterator iterator = map.iterator();
        if(map!=null && map.size()>0){
        	for(Map<String, Object> subMap : map){
        		System.out.println("-------> " + subMap.toString());
        	}
        }
	}
}
