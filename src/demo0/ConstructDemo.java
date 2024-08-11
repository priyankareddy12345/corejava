package demo0;

public class ConstructDemo{
	
	public ConstructDemo() {
		System.out.println("i am in constuctor");
		System.out.println("i am in constuctor2");

	}
	public ConstructDemo(int a, int b) 
	{
	int c=a+b;
		System.out.println("i am in parameteriezed constuctor");
		System.out.println(c);


	}
	public ConstructDemo(String str) 
	{
	
		System.out.println(str);

	}

    public void getdata()
    {
		System.out.println("i am in method");

    }

	public static void main(String[] args) {
		ConstructDemo cd=new ConstructDemo();

		ConstructDemo cds=new ConstructDemo("Hello!");
		ConstructDemo c=new ConstructDemo(4,5);
		ConstructDemo conD=new ConstructDemo();
        conD.getdata(); 
		


		
	}

}
