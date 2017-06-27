package akm.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import akm.spring.di.example.darknight.DarkGameStarter;

public class DarkNightGameContextStarterWithAOP
{

	@SuppressWarnings({ "resource" })
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("DarkNightGamewithAOP.xml");
		DarkGameStarter darkGameStarter=(DarkGameStarter)context.getBean("DarkGameStarter");
		darkGameStarter.startGame();
	}

}
