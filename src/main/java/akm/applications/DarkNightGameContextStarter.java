package akm.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DarkNightGameContextStarter
{

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("DarkNightGame.xml");

	}

}
