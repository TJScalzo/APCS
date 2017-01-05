public class Message
{
	private boolean isCiphered;
	private String statement;
	public Message()
	{
		isCiphered = false;
		statement = "hello world";
	}
	public Message(String statement, boolean isCiphered)
	{
		this.isCiphered = isCiphered;
		this.statement = statement;
	}
	public String returnStatement()
	{
		return statement;
	}
	public boolean returnIsCiphered()
	{
		return isCiphered;
	}
}