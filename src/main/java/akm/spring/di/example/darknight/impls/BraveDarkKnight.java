package akm.spring.di.example.darknight.impls;

import akm.spring.di.example.darknight.Knight;
import akm.spring.di.example.darknight.Quest;

public class BraveDarkKnight implements Knight
{

	private Quest quest;
	
	public BraveDarkKnight(Quest quest)
	{
		this.quest=quest;
	}
	public void emarkOnQuest()
	{
		quest.embark();

	}

}
