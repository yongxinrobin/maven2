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
	
	/*
	 * 		if(data!=null && data.size()>0){
				for(Map<String,Object> row : data){
					Category c = new Category();
					c.setId((Integer)row.get("id"));
					c.setCatename((String)row.get("catename"));
					list.add(c);
				}
			}
	 */
	

	
	/** public List<Dept> findALLDepts() {
        List<Dept> depts = new ArrayList<Dept>();;
        String sql = "select * from Dept";
        List list = jdbcT.queryForList(sql); 
        Iterator iterator = list.iterator();
        Dept dept = null;
        while (iterator.hasNext()) {
            Map map4dept = (Map) iterator.next();
            dept = new Dept();       
            dept.setDeptNo(((BigDecimal) map4dept.get("DEPTNO")).intValue());
            dept.setDName((String)map4dept.get("DNAME"));
            dept.setLoc((String)map4dept.get("LOC"));        
            depts.add(dept);
        }
	 * 
	 */

}
