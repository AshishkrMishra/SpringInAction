package akm.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheckTheExecutionFlowOfBlock
{

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("executionflowOfblock.xml");

	}

}
