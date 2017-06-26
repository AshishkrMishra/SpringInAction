package akm.spring.di.example.darknight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import akm.spring.di.example.darknight.impls.BraveDarkKnight;
import akm.spring.di.example.darknight.impls.SlayDrangonQuest;

@Configuration
public class DarkNightGameUsingAnnotation
{
	

	@Bean
	public Knight knight()
	{
		return new BraveDarkKnight(quest());
	}

	@Bean
	public  Quest quest()
	{
		// TODO Auto-generated method stub
		return new SlayDrangonQuest(System.out);
	}
	
	@Bean(initMethod="startGame")
	public DarkGameStarter startGame()
	{
		DarkGameStarter darkGameStarter= new DarkGameStarter();
		darkGameStarter.setKnight(knight());
		return darkGameStarter;
	}
	
	
}
