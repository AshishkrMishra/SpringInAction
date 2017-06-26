package akm.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings({ "resource", "unused" })
public class SimplePojoApplication
{

	public static void main(String[] args)
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
}
