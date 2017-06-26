package akm.spring.pojo;

public class SimpleObject
{
	private String value = "DEFAULT";

	{
		System.out.println("SimpleObject:Value:NonStatic01:" + value);
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	static
	{
		System.out.println("SimpleObject:Static:01");
	}
	{
		System.out.println("SimpleObject:NonStatic:01");
	}
	static
	{
		System.out.println("SimpleObject:Static:02");
	}
	{
		System.out.println("SimpleObject:NonStatic:02");
	}

	public SimpleObject()
	{
		{
			System.out.println("SimpleObject:Static:constructure:01");
		}

		{
			System.out.println("SimpleObject:Value:constructure:" + value);
		}

		{
			System.out.println("SimpleObject:Static:constructure:02");
		}
	}

	static
	{
		System.out.println("SimpleObject:Static:03");
	}

	{
		System.out.println("SimpleObject:NonStatic:03");
	}

	static
	{
		System.out.println("SimpleObject:Static:04");
	}

	{
		System.out.println("SimpleObject:NonStatic:04");
	}
	
	{
		System.out.println("SimpleObject:Value:NonStatic02:" + value);
	}
	
	public void lazyInit()
	{
		System.out.println("SimpleObject:Value:LazyInit:" + value);
	}
}
