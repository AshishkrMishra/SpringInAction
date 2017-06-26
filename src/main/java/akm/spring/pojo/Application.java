package akm.spring.pojo;

public class Application
{

	MessagePrinter messagePrinter;

	public void init()
	{
		messagePrinter.printMessage();
	}

	public MessagePrinter getMessagePrinter()
	{
		return messagePrinter;
	}

	public void setMessagePrinter(MessagePrinter messagePrinter)
	{
		this.messagePrinter = messagePrinter;
	}

}
