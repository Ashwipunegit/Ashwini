package Practice.git.code;

public class Sample 
{
	public static void main(String []args)
	{
	String s[]= {"abc","xyz","pqr","dad","xyz","mno"};

	int count=0;
	for(int i=0;i<s.length;i++ )
	{
		for(int j=i+1;j<s.length;j++ )
		{
			if(s[i]==s[j])
			{
				System.out.println("Duplicate value="+s[i]);
				count++;
			}
		}
	}
	System.out.println("total Duplicate value="+count);
	}

}
