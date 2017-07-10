package testMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringUtil {
    private static ApplicationContext context;
    static{
    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    public static JdbcTemplate getTemplate(){
    	// <bean id="jdbcTemplate"
    	return (JdbcTemplate)context.getBean("jdbcTemplate");
    }
}

