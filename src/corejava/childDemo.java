package corejava;

public class childDemo extends parentDemo  {
	
	String name ="QAClickAcadamy" ;
	public childDemo() {
		super();
		System.out.println("Child class constructor");
	}
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
		public void getData()
		{
			super.getData();
			System.out.println("i am in childclass");
		}

	
    public static void main(String[] args) {
    	childDemo cd=new childDemo();
    	cd.getStringdata();
    	cd.getData();
    }
    }