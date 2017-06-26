package akm.applications;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import akm.spring.di.example.darknight.DarkNightGameUsingAnnotation;

public class DarkNightGameContextStarterWithAnotation
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(DarkNightGameUsingAnnotation.class);
		context.refresh();
	}

}
