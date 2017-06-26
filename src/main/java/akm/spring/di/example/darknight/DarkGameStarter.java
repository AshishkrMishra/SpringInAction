package akm.spring.di.example.darknight;

public class DarkGameStarter
{

	Knight knight;
	
	public Knight getKnight()
	{
		return knight;
	}

	public void setKnight(Knight knight)
	{
		this.knight = knight;
	}

	public void startGame()
	{
		knight.emarkOnQuest();
	}
}
