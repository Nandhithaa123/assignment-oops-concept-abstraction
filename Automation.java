package Week4.Day5;

public class Automation extends MultipleLanguage
{

	@Override
	public void java() 
	{
		System.out.println("java");
		
	}

	@Override
	public void Selenium()
	{
		System.out.println("selenium");
		
	}

	@Override
	public void ruby() 
	{
		System.out.println("ruby");
		
	}
	public static void main(String[] args) 
	{
		Automation auto=new Automation();
		auto.java();
		auto.python();
		auto.ruby();
		auto.Selenium();
		
	}
	

}
