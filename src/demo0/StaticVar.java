package demo0;

public class StaticVar {
	String name;
	String  address;
	static String city="Bangalore";
	static int i=0;
		
	StaticVar(String Name, String address) 
	
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
		
	}
		
		public void getAddress()
		{
			System.out.println(address+ " "+city);
		}
		public static void getcity() {
			System.out.println(city);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj=new StaticVar ("Bob", "marthali");
		StaticVar obj1=new StaticVar ("Ram", "Jayanagar");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getcity();
		StaticVar.i=4;
		
	     	 
	}

}
