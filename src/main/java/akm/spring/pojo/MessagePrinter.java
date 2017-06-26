package akm.spring.pojo;

public class MessagePrinter
{
	private MessageService messageService;

	public MessageService getMessageService()
	{
		return messageService;
	}

	public void setMessageService(MessageService messageService)
	{
		this.messageService = messageService;
	}

	public void printMessage()
	{
		System.out.println(this.messageService.getMessage());
	}

}
