package corejava;

public class thisDemo {
	int a=2;
	public void getdata()
	{
		int a=3;
		int b=a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);


		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo td=new thisDemo();
		td.getdata();
	}

}
