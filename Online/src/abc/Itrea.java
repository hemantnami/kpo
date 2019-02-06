package abc;

public class Itrea {

	void m1()
	{
		String s="kumar";
		for(int i=0;i<=28;i++)
		{
			System.out.println(s);
		}

	}
	void m2()
	{
		int i=10;
		while(i>=10)
		{
			System.out.println("Hi");
			i--;
		}
	}
	void m3()
	{
		 int[] Array ={10,20,30,49};

		 for(int b:Array)
		 {
			 System.out.println(b);
		 }
	}
	void m4()
	{
		int i=1;
		 do{  
		        System.out.println(i);  
		    i++;  
		    }while(i<=10);  
		

	}
	void money()
	{
		 System.out.println("Money");

	}
	void gold()
	{
		 System.out.println("Gold");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Itrea i=new Itrea();
	i.m1();
		System.out.println("Parent class");

	
	}

}
