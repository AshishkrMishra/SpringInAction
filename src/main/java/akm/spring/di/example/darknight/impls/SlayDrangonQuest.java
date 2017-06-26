package akm.spring.di.example.darknight.impls;

import java.io.PrintStream;

import akm.spring.di.example.darknight.Quest;

public class SlayDrangonQuest implements Quest
{

	private PrintStream printStream;

	public SlayDrangonQuest(PrintStream printStream)
	{
		this.printStream = printStream;
	}

	public void embark()
	{
		printStream.println("Embarking on  Quest to Slay the Drangon ");

	}

}
