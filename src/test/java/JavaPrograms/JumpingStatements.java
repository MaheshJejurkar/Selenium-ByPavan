package JavaPrograms;

public class JumpingStatements 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<=10; i++) 
		{
			if(i==5) 
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("....................");
		
		for(int i=0; i<=10; i++) 
		{
			if(i==3|| i==5 || i==7) 
			{
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("....................");
		for(int i=0; i<=10; i++) 
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("....................");
		for(int i=0; i<=10; i++) 
		{
			if(!(i%2==0)) 
			{
				continue;
			}
			System.out.println(i);
		}
	}
}